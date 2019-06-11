<style type="text/css">
    #tie_attr_list input {
        width: 100%;
        padding-left: 5px;
    }
</style>
<div class="row clearfix">
    <#-- 正文核心左-->
    <div id="tie_all" class="col-md-6 column">
        <div style="overflow: auto; height: 498px; margin-bottom: 20px">
            <div class="mb5">
                <button id="add_tie" type="button" class="btn btn-primary">新增套装</button>
            </div>
            <table class="table table-hover table-bordered table-condensed table-striped">
                <thead>
                <tr>
                    <th>套装名称</th>
                    <th>套装件数</th>
                    <th>套装件数</th>
                    <th>套装件数</th>
                    <th>套装件数</th>
                    <th>套装件数</th>
                    <th>套装件数</th>
                    <th>套装件数</th>
                    <th>套装件数</th>
                    <th>套装件数</th>
                    <th>套装件数</th>
                    <th>套装件数</th>
                    <th>套装id</th>
                </tr>
                </thead>
                <tbody id="tie_list">
                    <#list tieList as tie>
                    <tr data-id="${tie.tieid}" data-name="${tie.name}" data-count="${tie.count}">
                        <td width="50%">
                            <button id="delete_tie" type="button" class="btn btn-danger btn-xs">删除</button>
                            <span>${tie.name}</span>
                        </td>
                        <td width="25%">${tie.count}</td>
                        <td width="25%">${tie.count}</td>
                        <td width="25%">${tie.count}</td>
                        <td width="25%">${tie.count}</td>
                        <td width="25%">${tie.count}</td>
                        <td width="25%">${tie.count}</td>
                        <td width="25%">${tie.count}</td>
                        <td width="25%">${tie.count}</td>
                        <td width="25%">${tie.count}</td>
                        <td width="25%">${tie.count}</td>
                        <td width="25%">${tie.count}</td>
                        <td width="25%">${tie.tieid}</td>
                    </tr>
                    </#list>
                </tbody>
            </table>
        </div>
    </div>
    <#--正文核心右-->
    <div id="tie_info" class="col-md-6 column">
        <div class="row clearfix">
            <div class="col-md-8 column">
                <h3>
                    h3. 这是一套可视化布局系统.
                </h3>
                <p>
                    <em>Git</em> 是一个分布式的版本控制系统，最初由 <strong>Linus Torvalds</strong>
                    编写，用作Linux内核代码的管理。在推出后，Git在其它项目中也取得了很大成功，尤其是在
                    <small>Ruby</small>
                    社区中。
                </p>
            </div>
            <div class="col-md-4 column">
                <#--<img alt="140x140" src="v3/default3.jpg"/>-->
            </div>
        </div>
    </div>
</div>

<#--套装tr展示-->
<script id="tieTrTemp" type="text/html">
    <tr>
        <td width="50%">套装名(单击此条修改)</td>
        <td width="25%">套装件数(单击此条修改)</td>
        <td width="25%"></td>
    </tr>
</script>
<#--套装详细属性-->
<script id="tieAttrListTemp" type="text/html">
    <form id="tie_info" class="form-inline mt15">
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
                <input id="tie_name" value="{{name}}" class="form-control ml5 w150p" type="text" />
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
            <button id="remove_tie_attr" type="button" class="btn btn-danger btn-xs">移除</button>
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
    $(function () {
        // 每套套装的详细内容
        $('#tie_list').on('click', 'tr', function () {
            getTieInfo(this);
        });

        $('#tie_all').on('click', '#add_tie', function () {
            getTieInfo(null);
        });

        $('#tie_all').on('click', '#delete_tie', function () {
            const $this = $(this);
            layer.confirm('确认移除?', function () {
                $.ajax({
                    url: "equipment/tie/" + $this.closest('tr').data('id'),
                    type: "DELETE",
                    dataType: "json",
                    success(result) {
                        if (!result.success) layer.alert(result.msg);
                        if (result.data) {
                            $this.closest('tr').remove();
                            layer.msg('删除成功');
                        } else {
                            layer.alert('删除失败');
                        }
                    },
                    error(result) {console.log(result);}
                });
            });

        });

        $('#tie_info').on('click', '#add_tie_attr', function () {
            $('#tie_attr_list').append(template('tieAttrTrTemp', {tieName: $('#tie_name').val()}));
        });

        $('#tie_info').on('click', '#remove_tie_attr', function () {
            $(this).closest('tr').remove();
        });

        $('#tie_info').on('click', '#save_tie', function () {
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
                    url: "/equipment/tie",
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
                        toTie();
                    },
                    error(result) {isOk = true;console.log(result);}
                });
            });
        });

        $('#tie_info').on('input', '#tie_name', function () {
            $('span.tie_attr_name').html(this.value);
        });
    });

    function getTieInfo(e) {
        const $this = $(e);
        let tieid = $this.data("id");
        if (isEmpty(tieid)) {
            $('#tie_info').html(template('tieAttrListTemp', {tieAttrList: [{}],}));
        } else {
            $.ajax({
                url: "/equipment/tie",
                type: "GET",
                data: {tieid: tieid},
                dataType: "json",
                success(result) {
                    if (!result.success) {
                        layer.msg(result.msg);
                        return;
                    }
                    $('#tie_info').html(template('tieAttrListTemp', {
                        tieid: tieid,
                        name: $this.data("name"),
                        count: $this.data("count"),
                        tieAttrList: result.data !== null && result.data.length !==0 ? result.data : [{}],
                    }));
                },
                error(result) {console.log(result);}
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