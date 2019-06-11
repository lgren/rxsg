//判断非空
function isEmpty(value) {
    return value === undefined || value == null || value === 'null'
        || value === 'undefined' || value.length === 0;

}

function toTie() {
    $.ajax({
        url: "/equipment/toTie",
        type: "GET",
        // dataType: "json",
        success(result) {
            $('#body_core').html(result);
        },
        error(result) {
            console.log(result);
        }
    });
}