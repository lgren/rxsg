$(function () {
    // 每套套装的详细内容
    $('#tie_list').on('click', 'tr', function () {
        $.ajax({
            url: "/equipment/tie",
            type: "GET",
            data: {tieid: $(this).data("id")},
            dataType: "json",
            success(tieAttrList) {
                $('#tie_info').html(template('tieAttrListTemp', {tieAttrList: tieAttrList}));
            },
            error(result) {console.log(result);}
        });
    });
});