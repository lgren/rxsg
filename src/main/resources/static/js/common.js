//判断非空
function isEmpty(value) {
    return value === undefined || value == null || value === 'null'
        || value === 'undefined' || value.length === 0;

}

function toDivHtml($showNode, requestMapping) {
    $.ajax({
        url: requestMapping,
        type: "GET",
        success(result) {
            $showNode.html(result);
        },
        error(result) {
            console.log(result);
        }
    });
}


function onOnly($node, types, selector, fn) {
    $node.off(types, selector).on(types, selector, fn);
}

/**
 * 快速分页查询
 * @param selectStr 分页导航条展示的<ul>标签
 * @param url 分页查询的地址
 * @param current 初始化查询第几页
 * @param pageSize 初始化一页查询多少条
 * @param data 查询的数据条件
 * @param callback 查询后的回调数据
 */
function quickPage(selectStr, url, current, pageSize, data, callback) {
    if (data) {
        data.current = current;
        data.pageSize = pageSize;
    } else {
        data = {current: current, pageSize: pageSize};
    }
    $.ajax({
        url: url,
        type: "GET",
        // async: false,//使用同步的方式,true为异步方式
        // contentType: "application/json;charset=utf-8",
        data: data,
        dataType: "json",
        success(result) {
            if (!result.success) {layer.alert(result.msg);return;}
            // result.data.current // 当前页数
            // result.data.records // 数据列表
            // result.data.total // 总数
            // result.data.size // 当前页数量
            // result.data.pages // 总页数
            // console.log(result);
            callback && callback(result.data);
            $(selectStr).bootstrapPaginator({
                //设置版本号 如果bootstrap的版本是2.X的分页必须使用div元素。3.X分页的必须使用ul>li元素。
                bootstrapMajorVersion: 3,
                // 显示第几页 当前页数默认 1
                currentPage: current,
                // 总页数 默认1
                totalPages: result.data.pages,
                // 一次展示多少个按钮
                numberOfPages: 8,
                //当单击操作按钮的时候, 执行该函数, 调用ajax渲染页面
                onPageClicked: function (event, originalEvent, type, page) {
                    // 把当前点击的页码赋值给currentPage, 调用ajax,渲染页面
                    // currentPage = page;
                    // clickCallback && clickCallback(page);
                    quickPage(selectStr, url, page, pageSize, data, callback);
                },
                // 每个按钮都展示
                shouldShowPage: true,
                // 如果是首页或者尾页则展示 disabled样式
                itemContainerClass: function (type, page, current) {
                    return page === current ? type === "page" ? "active" : "disabled" : "";
                },
            })
        },
        error(result) {layer.alert(result);}
    });
}