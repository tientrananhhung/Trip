function loadUser(year) {
    'use strict';

    if ($('#morris-line-example').length) {
        $.ajax({
            url: 'http://localhost:8080/api/userstatistics/'+year+'',
            type: 'GET'
        })
            .done(function (data) {
                Morris.Line({
                    element: 'morris-line-example',
                    lineColors: ['#63CF72', '#76C1FA', '#F36368', '#FABA66'],
                    data: data,
                    hideHover: 'auto',
                    xkey: 'thang',
                    parseTime: false,
                    ykeys: ['tong_User', 'actived', 'deleted'],
                    labels: ['Người dùng', 'Kích hoạt', 'Ngừng hoạt động']
                });
            });
    };
};
function loadPartner(month,year){
    if ($("#morris-bar-example1").length) {
        $.ajax({
            url: 'http://localhost:8080/api/partnerstatistics/'+month+'/'+year+'',
            type: 'GET'
        })
            .done(function (data) {
                Morris.Bar({
                    element: 'morris-bar-example1',
                    barColors: ['#ffc107', '#f44336', '#000000','#3498DB'],
                    hideHover: 'auto',
                    data: data,
                    xkey: 'thang',
                    ykeys: ['tong_Partner', 'actived','deleted'],
                    labels: ['Đối tác', 'Kích hoạt', 'Ngừng hoạt động']
                });
            });
    };
};
function loadOffer(month,year){
    if ($("#morris-bar-example2").length) {
        $.ajax({
            url: 'http://localhost:8080/api/offerstatistics/'+month+'/'+year+'',
            type: 'GET'
        })
            .done(function (data) {
                Morris.Bar({
                    element: 'morris-bar-example2',
                    barColors: ['#ffc107', '#f44336', '#000000','#3498DB'],
                    hideHover: 'auto',
                    data: data,
                    xkey: 'thang',
                    ykeys: ['tong_Offer', 'used'],
                    labels: ['Đã tạo','Đã sử dụng']
                });
            });
    };

};
function loadPost(year) {
    'use strict';

    if ($('#morris-area-example').length) {
        $.ajax({
            url: 'http://localhost:8080/api/poststatistics/'+year+'',
            type: 'GET'
        })
            .done(function (data) {
                Morris.Area({
                    element: 'morris-area-example',
                    lineColors: ['#63CF72', '#76C1FA', '#F36368', '#FABA66'],
                    data: data,
                    hideHover: 'auto',
                    xkey: 'thang',
                    parseTime: false,
                    ykeys: ['tong_Post', 'deleted'],
                    labels: ['Bài viết',  'Đã xóa']
                });
            });
    };
};
