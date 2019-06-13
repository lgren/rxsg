<#-- 直接调用方法 getTieInfo(展示的地方, 展示的部分数据{tieAttrList, count, name, tieid}) -->
<#macro tieInfo attrList>
<#--套装详细属性-->
<script id="tieAttrListTemp" type="text/html">
    <form class="form_tie_info form-inline mt15" style="overflow: auto; max-height: 498px; margin: 0 !important;">
        <div class="mb5">
            <button id="add_tie_attr" type="button" class="btn btn-primary">新增属性</button>
        </div>
        <table class="table table-bordered table-condensed table-striped">
            <thead>
            <tr>
                <th>套装名称</th>
                <th>属性名称</th>
                <th>属性值</th>
                <th>激活此属性需要的装备件数</th>
            </tr>
            </thead>
            <tbody id="tie_attr_list" data-tieid="{{tieid}}" data-name="{{name}}" data-count="{{count}}">
            {{each tieAttrList tieAttr}}
            {{include 'tieAttrTrTemp' tieAttr}}
            {{/each}}
            </tbody>
        </table>
        <div class="mt15">
            <div class="form-group mr5">
                <label for="tie_name">套装名称:</label>
                <input id="tie_name" value="{{name}}" class="form-control ml5 w150p" type="text"/>
            </div>
            <div class="form-group mr5">
                <label for="tie_count">套装件数:</label>
                <input id="tie_count" value="{{count}}" class="form-control ml5 w100p" type="number"/>
            </div>
            <button id="save_tie" type="button" class="btn btn-blue">保存</button>
        </div>
    </form>
</script>
<#--每一条具体属性-->
<script id="tieAttrTrTemp" type="text/html">
    <tr class="tie_attr">
        <td width="30%">
            <button type="button" class="remove_tie_attr btn btn-danger btn-xs">移除</button>
            <span class="tie_attr_name">{{tieName}}</span>
        </td>
        <td width="15%">
            <select class="tie_attr_attid form-control">
                <#list attrList as e>
                    <option {{'${e.name}'==attName?'selected':''}} value="${e.attid}">${e.name}</option>
                </#list>
            </select>
        </td>
        <td width="15%"><input class="tie_attr_value form-control" type="number" value="{{value}}"></td>
        <td width="40%"><input class="tie_attr_precond form-control" type="number" value="{{precond}}"></td>
    </tr>
</script>

<script type="text/javascript">
    // 成功保存后的回调方法 在 getTieInfo中定义 在 $body.on('click', '#save_tie', function (){...})中使用
    function saveTieCallback(){}

    $(function () {
        const $body = $("body");
        onOnly($body, 'click', '#add_tie_attr', function () {
            $('#tie_attr_list').append(template('tieAttrTrTemp', {tieName: $('#tie_name').val()}));
        });

        onOnly($body, 'click', '.remove_tie_attr', function () {
            $(this).closest('tr').remove();
        });

        onOnly($body, 'click', '#save_tie', function () {
            layer.confirm('确认保存?', function () {
                if (!isOk) {
                    layer.msg('正在火速提交中~', {time: 2000});
                    return;
                }
                const tieResult = getTie();
                if (!tieResult.success) {
                    layer.alert(tieResult.msg);
                    return;
                }
                isOk = false;
                $.ajax({
                    url: "/armor/tie",
                    type: "POST",
                    // async: false,//使用同步的方式,true为异步方式
                    contentType: "application/json;charset=utf-8",
                    data: JSON.stringify(tieResult.data),
                    dataType: "json",
                    success(result) {
                        isOk = true;
                        if (!result.success) {
                            layer.alert(result.msg);
                            return;
                        }
                        layer.msg(result.data);
                        saveTieCallback && saveTieCallback();
                    },
                    error(result) {
                        isOk = true;
                        console.log(result);
                    }
                });
            });
        });

        onOnly($body, 'input', '#tie_name', function () {
            $('span.tie_attr_name').html(this.value);
        });
    });

    function getTieInfo($showDiv, tieid, saveTieCallbackPar) {
        saveTieCallback = saveTieCallbackPar;
        if (isEmpty(tieid)) {
            $showDiv.html(template('tieAttrListTemp', {tieAttrList: [{}],}));
        } else {
            $.ajax({
                url: "/armor/tie/" + tieid,
                type: "GET",
                // data: {tieid: tempData.tieid},
                dataType: "json",
                success(result) {
                    if (!result.success) {
                        layer.msg(result.msg);
                        return;
                    }
                    const tieVO = result.data;
                    const tieAttrList = tieVO.tieAttrList;
                    $showDiv.html(template('tieAttrListTemp', {
                        tieid: tieVO.tieid,
                        name: tieVO.name,
                        count: tieVO.count,
                        tieAttrList: $.isEmptyObject(tieAttrList) ? [{}] : tieAttrList,
                    }));
                    // $('.tie_attr_attid').selectpicker();
                },
                error(result) {
                    console.log(result);
                }
            });
        }
    }

    function getTie() {
        const name = $('#tie_name').val();
        const count = $('#tie_count').val();
        if (isEmpty(name)) return {success: false, msg: '套装名称不能为空!'};
        if (isEmpty(count)) return {success: false, msg: '套装个数不能为空!'};
        const tieDTO = {
            tieid: $('#tie_attr_list').data('tieid'),
            name: name,
            count: count,
            tieAttrList: [],
        };
        const precondArr = [];
        const $trTieAttr = $('tr.tie_attr');
        for (let i = 0, len = $trTieAttr.length; i < len; i++)  {
            const $this = $trTieAttr.eq(i);
            const value = $this.find('.tie_attr_value').val();
            const precond = $this.find('.tie_attr_precond').val();
            if (isEmpty(value)) return {success: false, msg: '属性值不能为空!'};
            if (isEmpty(precond)) return {success: false, msg: '激活个数不能为空!'};
            if (precondArr.indexOf(precond) > -1) return {success: false, msg: '激活件数重复'};
            precondArr.push(precond);
            const tieAttr = {
                attid: $this.find('.tie_attr_attid').val(),
                tieid: tieDTO.tieid,
                value: value,
                precond: precond,
            };
            tieDTO.tieAttrList.push(tieAttr);
        }
        return {success: true, data: tieDTO};
    }
</script>
</#macro>

<#macro armorList>
<script id="armorListTemp" type="text/html">
    <table class="table table-bordered table-condensed table-striped">
        <thead>
        <tr>
            <th>装备名称</th>
            <th>部位</th>
            <th>装备等级</th>
            <th>装备ID</th>
            <th>图片</th>
        </tr>
        </thead>
        <tbody id="armor_list">
            {{each armorList armor}}
            <tr class="tie_attr">
                <td width="35%">{{armor.name}}</td>
                <td width="15%">{{partMap[armor.part]}}</td>
                <td width="15%">{{armor.heroLevel}}</td>
                <td width="25%">{{armor.id}}</td>
                <td width="10%">
                    <img alt="64x64" src="/images/armor/{{armor.image}}.png" class="img-thumbnail" />
                </td>
            </tr>
            {{/each}}
        </tbody>
    </table>
</script>

<script type="text/javascript">
    let partMap = ${partMapStr!"{}"};
    function getArmorList($showDiv, tieid) {
        $.ajax({
            url: "/armor/armor",
            type: "GET",
            data: {tieid: tieid},
            dataType: "json",
            success(result) {
                if (!result.success) {
                    layer.msg(result.msg);
                    return;
                }
                const armorList = result.data.records;
                $showDiv.html(template('armorListTemp', {
                    partMap: partMap,
                    armorList: $.isEmptyObject(armorList) ? [{}] : armorList,
                }));
                // $('.tie_attr_attid').selectpicker();
            },
            error(result) {
                console.log(result);
            }
        });
    }
</script>
</#macro>
