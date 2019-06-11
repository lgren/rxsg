<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>主页</title>
    <link href="/webjars/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="/webjars/bootstrap-select/css/bootstrap-select.min.css" rel="stylesheet"/>
    <link href="/css/common.css?${version}" rel="stylesheet"/>
    <style type="text/css"></style>
</head>
<body>
<div class="container-fluid">
    <#--顶部导航-->
    <div class="row clearfix">
        <div class="col-md-12 column">
            <nav class="navbar navbar-default" role="navigation">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse"
                            data-target="#bs-example-navbar-collapse-1"><span
                            class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span
                            class="icon-bar"></span><span class="icon-bar"></span></button>
                    <a class="navbar-brand" href="#">两个人</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a href="javascript:" onclick="toTie()">装备</a>
                        </li>
                        <li>
                            <a href="javascript:">Link</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong
                                    class="caret"></strong></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Action</a>
                                </li>
                                <li>
                                    <a href="#">Another action</a>
                                </li>
                                <li>
                                    <a href="#">Something else here</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">Separated link</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">One more separated link</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control"/>
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="#">Link</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong
                                    class="caret"></strong></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Action</a>
                                </li>
                                <li>
                                    <a href="#">Another action</a>
                                </li>
                                <li>
                                    <a href="#">Something else here</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">Separated link</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>

            </nav>
        </div>
    </div>
    <div class="row clearfix">
        <#--正文左侧导航-->
        <div class="col-xs-2 column">
            <ul id="nav_equipment" class="nav nav-stacked nav-pills">
                <li><a href="javascript:" data-to="toEquipment">装备</a></li>
                <li><a href="javascript:" data-to="toTie">套装</a></li>
                <li class="disabled"><a href="#">信息</a></li>
                <#-- 下拉-->
                <li class="dropdown pull-right">
                    <a href="#" data-toggle="dropdown" class="dropdown-toggle">下拉<strong class="caret"></strong></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">操作</a></li>
                        <li><a href="#">设置栏目</a></li>
                        <li><a href="#">更多设置</a></li>
                        <li class="divider"></li>
                        <li><a href="#">分割线</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <#-- 正文核心内容-->
        <div id="body_core" class="col-xs-10 column"></div>
    </div>
</div>

<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script src="/webjars/layer/dist/layer.js"></script>
<script src="/webjars/bootstrap-paginator/build/bootstrap-paginator.min.js"></script>
<script src="/webjars/bootstrap-select/js/bootstrap-select.min.js"></script>
<script src="/webjars/bootstrap-select/js/i18n/defaults-zh_CN.js"></script>
<script src="/js/artTemplate.js"></script>
<#--<script src="/js/layer.js"></script>-->
<script src="/js/common.js?${version}"></script>

<script type="text/javascript">
    let isOk = true;
    $(function(){
        $('#nav_equipment>li').click(function () {
            const $this = $(this);
            $this.siblings().removeClass('active');
            $this.addClass('active');
        });

        $('#nav_equipment>li>a').click(function () {
            $.ajax({
                url: "/equipment/" + $(this).data('to'),
                type: "GET",
                // dataType: "json",
                success(result) {
                    $('#body_core').html(result);
                },
                error(result) {
                    console.log(result);
                }
            });
        });
        toTie();
    });
</script>
</body>
</html>