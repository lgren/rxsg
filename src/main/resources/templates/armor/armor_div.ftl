<style type="text/css">
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
        <div>
            <ul id="armorPageNavBar"></ul>
        </div>
    </div>
    <#--正文核心右-->
    <div id="tie_info" class="col-md-6 column">
        <h4>此处展示套装详细属性</h4>
    </div>
</div>

<script type="text/javascript">
    $(function () {
        quickPage('#armorPageNavBar', "armor/armor", 1, 20, null, function (data) {
            console.log(data);
        });
    });
</script>