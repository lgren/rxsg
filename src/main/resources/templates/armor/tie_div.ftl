<style type="text/css">
    #tie_attr_list input {
        width: 100%;
        padding-left: 5px;
    }
</style>
<div class="row clearfix">
    <#-- 正文核心左-->
    <div id="tie_all" class="col-md-6 column mb15">
        <div style="overflow: auto; max-height: 498px;">
            <div class="mb5">
                <button id="add_tie" type="button" class="btn btn-primary">新增套装</button>
            </div>
            <table class="table table-hover table-bordered table-condensed table-striped">
                <thead>
                <tr>
                    <th>套装名称</th>
                    <th>套装件数</th>
                    <th>套装ID</th>
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
                        <td width="25%">${tie.tieid}</td>
                    </tr>
                    </#list>
                </tbody>
            </table>
        </div>
    </div>
    <#--正文核心右-->
    <div id="tie_info" class="col-md-6 column mb15">
        <h4>此处展示套装详细属性</h4>
    </div>
    <div id="tie_armor_list" class="col-md-12 column mb15">
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

<#import "all_armor_info.ftl" as allArmorInfo/>
<@allArmorInfo.tieInfo attrList/>
<@allArmorInfo.armorList/>

<script type="text/javascript">
    $(function () {
        const $tieAll = $('#tie_all');
        // 每套套装的详细内容
        onOnly($('#tie_list'), 'click', 'tr', function () {
            const $this = $(this);
            getTieInfo($('#tie_info'), $this.data("id"), () => toDivHtml($('#body_core'), '/armor/toTie'));
            getArmorList($('#tie_armor_list'), $this.data("id"));
        });

        onOnly($tieAll, 'click', '#add_tie', function () {
            getTieInfo($('#tie_info'), null, () => toDivHtml($('#body_core'), '/armor/toTie'));
        });

        onOnly($tieAll, 'click', '#delete_tie', function () {
            const $this = $(this);
            layer.confirm('确认移除?', function () {
                $.ajax({
                    url: "armor/tie/" + $this.closest('tr').data('id'),
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
    });

</script>