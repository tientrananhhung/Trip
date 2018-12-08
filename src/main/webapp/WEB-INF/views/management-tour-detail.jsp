<%--
  Created by IntelliJ IDEA.
  User: T
  Date: 12/8/2018
  Time: 11:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quản lý tour - Smart Trip</title>
    <!-- Icon -->
    <link rel="icon" href="/resources/images/favicon.ico">
    <!-- Bootstrap css -->
    <link rel="stylesheet" href="/resources/css/bootstrap/bootstrap.min.css">
    <!-- Fontawesome -->
    <link rel="stylesheet" href="/resources/css/fontawesome/font-awesome.min.css">
    <!-- Editor -->
    <link rel="stylesheet" href="/resources/css/froala/froala_editor.pkgd.min.css">
    <link rel="stylesheet" href="/resources/css/editor/custom-theme.css">
    <!-- My css -->
    <link rel="stylesheet" href="/resources/css/custom.css">
</head>
<body>
<jsp:include page="includes/navbar.jsp"/>

<!-- Start Body Order -->

<div class="body-info">

    <jsp:include page="includes/menu-info.jsp"/>

    <section class="right-body-info">
        <div class="right-content-info">
            <div class="content-title-info">
                <h3 class="c_orange cfs-22">Quản lý tour<span> - Bà Nà Hills - Đường Lên Tiên Cảnh</span></h3>
            </div>
            <div class="content-body-info mg-top-20">

                <!-- Start Image of tour -->
                <div class="img-tour">
                    <img src="/resources/images/logo.png" alt="Smart Trip">
                </div>
                <!-- End Image of tour -->

                <div class="file-tour">
                    <label class="file-input-tour c_orange" for="upload-photo-tour">Đổi ảnh hiển thị</label>
                    <input id="upload-photo-tour" type="file" required>
                    <br>
                    <button type="button" class="btn btn-outline-success my-2 my-sm-0 btn-custom btn-choose-ticket" style="vertical-align: top;">
                        <span>Upload slide ảnh</span>
                    </button>
                </div>

                <!-- Start info of tour-->
                <div class="info-tour mg-top-10">
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="name-tour">
                                <input type="hidden" value="0">
                                <label class="c_orange">Tên tour:</label>
                                <b>Smart Trip</b>&emsp;

                                <button class="btn my-2 my-sm-0 btn-custom-org btn-edit btn-sm">
                                    <i class="fa fa-pencil" aria-hidden="true"></i>
                                </button>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="address-tour">
                                <label class="c_orange">Địa chỉ:</label>
                                <b>Xin vui lòng chọn địa điểm</b>
                            </div>
                        </div>
                        <div class="col-lg-6 mg-top-10">
                            <div class="content-tour">
                                <label class="c_orange">Nội dung:</label>
                                <textarea id="content" class="form-control" cols="5"></textarea>
                            </div>
                        </div>
                        <div class="col-lg-6 mg-top-10">
                            <div class="location-tour">
                                <label class="c_orange">Địa điểm: (Nhập tìm địa điểm)</label>
                                <input id="pac-input" class="form-control" type="text" placeholder="Tìm địa điểm">
                                <div id="map"></div>
                                <input type="hidden" id="lat">
                                <input type="hidden" id="lng">
                            </div>
                        </div>
                        <div class="col-lg-12 mg-top-20">
                            <div class="row">

                                <div class="col-lg-7">
                                    <div class="services-tour">

                                        <label class="c_orange">Danh sách dịch vụ:</label>
                                        &emsp;
                                        <button class="btn my-2 my-sm-0 btn-custom-org btn-add btn-sm">
                                            <i class="fa fa-plus" aria-hidden="true"></i>
                                        </button>

                                        <div class="service-list-tour">
                                            <div class="packer-service-detail">
                                                <label class="c_orange">Dịch vụ:</label>
                                                &emsp;
                                                <button class="btn my-2 my-sm-0 btn-custom-org btn-detail btn-sm">
                                                    <i class="fa fa-eye" aria-hidden="true"></i>
                                                </button>
                                                &emsp;
                                                <button class="btn my-2 my-sm-0 btn-custom-org btn-delete btn-sm" style="display: none;">
                                                    <i class="fa fa-trash-o" aria-hidden="true"></i>
                                                </button>
                                                <div class="service-tour">
                                                    <div class="row">
                                                        <div class="col-lg-12 name-service-form">
                                                            <div class="form-group">
                                                                <label>Tên dịch vụ:</label>
                                                                <input class="form-control name-service-detail" type="text" placeholder="Nhập tên dịch vụ">
                                                                <input type="hidden" value="0" />
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-6 normal-price-service-form">
                                                            <div class="form-group">
                                                                <label>Giá:</label>
                                                                <input class="form-control normal-price-service-detail" type="text" placeholder="Nhập giá" value="0">
                                                                <input type="hidden" />
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-6 price-service-form">
                                                            <div class="form-group">
                                                                <label>Giá khuyến mãi:<i class="fa fa-info-circle btn mg-left-10" style="padding: 0px;" aria-hidden="true" data-toggle="tooltip" data-placement="top" title="Nếu không điền hoặc lớn hơn giá gốc sẽ tự động lấy giá gốc"></i></label>
                                                                <input class="form-control price-service-detail" type="text" placeholder="Nhập giá khuyến mãi" value="0" min="0">
                                                                <input type="hidden" />
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-12">
                                                            <div class="form-group">
                                                                <label>Chi tiết dịch vụ:</label>
                                                                <textarea class="service-detail"></textarea>
                                                            </div>
                                                        </div>
                                                        <div class="col-lg-12 group-kind-ticket">
                                                            <div class="form-group">
                                                                <label>Danh sách vé:</label>
                                                                &emsp;
                                                                <button class="btn my-2 my-sm-0 btn-custom-org btn-add-kind-ticket btn-sm">
                                                                    <i class="fa fa-plus" aria-hidden="true"></i>
                                                                </button>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </div>

                                <div class="col-lg-5">
                                    <div class="view-service-tour">
                                        <label class="c_orange">Xem qua chi tiết dịch vụ</label>
                                        <p class="view-service">Chưa có chi tiết</p>
                                    </div>
                                    <div class="form-group">
                                        <label for="policy">Chính sách hủy: (giờ)<i class="fa fa-info-circle btn mg-left-10 policy" style="padding: 0px;" aria-hidden="true" data-toggle="tooltip" data-placement="top" title="Nếu không điền sẽ nhận là 0 - Nếu không có chính sách hủy vé sẽ tự động lấy ngày nhận vé làm ngày hủy vé"></i></label>
                                        <input type="number" class="form-control" id="policy" placeholder="Nhập số giờ" value="0" min="0">
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>

                    <div class="col-lg-12 mg-top-20" style="text-align: center;">
                        <button class="btn btn-custom btn-upload">Xác nhận</button>
                    </div>
                </div>
                <!-- End info of tour-->

            </div>
        </div>
    </section>
</div>

<!-- End Body Order -->

<jsp:include page="includes/footer.jsp"/>

<!-- Start Import Script -->
<script type="text/javascript" src="/resources/js/jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/resources/js/popper/popper.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/js/froala_editor.pkgd.min.js"></script>
<script type="text/javascript" src="/resources/js/froala/vi.js"></script>
<script type="text/javascript" src="/resources/js/custom.js"></script>
<!-- End Import Script -->

<!-- Start custom script-->
<script>
    $(document).ready(function () {

        // Hiệu ứng menu login
        navbarSubMenu();

        //Thêm active cho link hiện tại
        activeLinkNav();


        $('[data-toggle="tooltip"]').tooltip()

        $(document).on('mouseover', '.price-service-form .btn', function(event) {
            event.preventDefault();
            $(this).tooltip('toggle');
        });

        $(".li-user-info").mouseover(function() {
            $(".menu-dropdown-menu").fadeIn(200);
        });

        $(".li-user-info").mouseleave(function() {
            $(".menu-dropdown-menu").fadeOut(200);
        });

        $('#content').froalaEditor({
            heightMin: 200,
            height: 240,
            theme: 'custom',
            language: 'vi',
            toolbarSticky: false
        });

        editorMini('.service-detail', '.view-service');

        //Cho nội dung thu lên
        $('.service-tour').slideUp();
        $(document).on('click', '.btn-detail', function(event) {
            event.preventDefault();
            /* Act on the event */
            var a = $(this).attr('class');
            if (a != '' && a != undefined) {
                a = a.split(' ');
            } else {
                a = [];
            }
            // inArray là lệnh tìm kiếm active trong mảng a.
            if ($.inArray('service-active', a) >= 0) {
                $(this).children('.fa').removeClass('fa-eye-slash').addClass('fa-eye');
                // $(this).removeClass('service-active');
                $('.btn-detail').removeClass('service-active');
                $('.btn-detail').children('.fa').removeClass('fa-eye-slash').addClass('fa-eye');
                $('.service-tour').slideUp();
            } else {
                $('.btn-detail').children('.fa').removeClass('fa-eye-slash').addClass('fa-eye');
                $(this).children('.fa').removeClass('fa-eye').addClass('fa-eye-slash');
                $('.service-tour').slideUp();
                // $(this).next().next().slideToggle();
                $(this).next().next().slideDown();
                $('.btn-detail').removeClass('service-active');
                $(this).addClass('service-active');
            }
        });

        //Button xóa service
        $(document).on('click', '.btn-delete', function(event) {
            event.preventDefault();
            /* Act on the event */
            $(this).parent('.packer-service-detail').remove();
        });

        //Button thêm loại vé
        $(document).on('click', '.btn-add-kind-ticket', function(event) {
            event.preventDefault();
            /* Act on the event */
            $(this).parent('.form-group').parent('.group-kind-ticket').append(
                '<div class="kind-ticket">'+
                '<label>Loại vé:</label>'+
                '&emsp;'+
                '<button class="btn my-2 my-sm-0 btn-custom-org btn-delete-ticket btn-sm">'+
                '<i class="fa fa-trash-o" aria-hidden="true"></i>'+
                '</button>'+
                '<div class="row">'+
                '<div class="col-lg-6 name-kind-ticket">'+
                '<div class="form-group">'+
                '<label>Tên vé:</label>'+
                '<input type="text" class="form-control" placeholder="Nhập tên loại vé">'+
                '</div>'+
                '</div>'+
                '<div class="col-lg-6 price-kind-ticket">'+
                '<div class="form-group">'+
                '<label>Giá vé:</label>'+
                '<input type="text" class="form-control" placeholder="Nhập giá loại vé" value="0">'+
                '<input type="hidden" />'+
                '</div>'+
                '</div>'+
                '</div>'+
                '</div>'
            );
        });

        //Button xóa loại vé
        $(document).on('click', '.btn-delete-ticket', function(event) {
            event.preventDefault();
            /* Act on the event */
            $(this).parent('.kind-ticket').remove();
        });

        //Button edit tour
        $(document).on('click', '.btn-edit', function(event) {
            event.preventDefault();
            /* Act on the event */
            var val = $(this).prev('b').html();
            $(this).prev('b').html(
                '<input type="text" class="form-control" style="width: 70%; display: initial;" placeholder="'+val+'"/>'
            );
            $(this).children('.fa').removeClass('fa-pencil').addClass('fa-check');
            $(this).removeClass('btn-edit').addClass('btn-ok');
        });

        //Button ok edit tour
        $(document).on('click', '.btn-ok', function(event) {
            event.preventDefault();
            /* Act on the event */
            var val = $(this).prev('b').children('input').val();
            var valPrev = $(this).prev('b').children('input').attr('placeholder');
            if(val == null || val == ''){
                $(this).prev('b').html(valPrev+'&emsp;');
            }else{
                $(this).prev('b').html(val+'&emsp;');
            }
            $(this).children('.fa').removeClass('fa-check').addClass('fa-pencil');
            $(this).removeClass('btn-ok').addClass('btn-edit');
        });

        //Button thêm service
        $('.btn-add').click(function(event) {
            /* Act on the event */
            event.preventDefault();
            $('.service-list-tour').append(
                '<div class="packer-service-detail">'+
                '<label class="c_orange">Dịch vụ:</label>'+
                '&emsp;'+
                '<button class="btn my-2 my-sm-0 btn-custom-org btn-detail service-active btn-sm">'+
                '<i class="fa fa-eye-slash" aria-hidden="true"></i>'+
                '</button>'+
                '&emsp;'+
                '<button class="btn my-2 my-sm-0 btn-custom-org btn-delete btn-sm">'+
                '<i class="fa fa-trash-o" aria-hidden="true"></i>'+
                '</button>'+
                '<div class="service-tour">'+
                '<div class="row">'+
                '<div class="col-lg-12 name-service-form">'+
                '<div class="form-group">'+
                '<label>Tên dịch vụ:</label>'+
                '<input class="form-control name-service-detail" type="text" placeholder="Nhập tên dịch vụ">'+
                '</div>'+
                '</div>'+
                '<div class="col-lg-6 normal-price-service-form">'+
                '<div class="form-group">'+
                '<label>Giá:</label><input class="form-control normal-price-service-detail" type="text" placeholder="Nhập giá" value="0">'+
                '<input type="hidden" />'+
                '</div>'+
                '</div>'+
                '<div class="col-lg-6 price-service-form">'+
                '<div class="form-group">'+
                '<label>'+
                'Giá khuyến mãi:'+
                '<i class="fa fa-info-circle btn mg-left-10" aria-hidden="true" style="padding: 0px;" data-toggle="tooltip" data-placement="top" title="Nếu không điền hoặc lớn hơn giá gốc sẽ tự động lấy giá gốc"></i>'+
                '</label>'+
                '<input class="form-control price-service-detail" type="text" placeholder="Nhập giá khuyến mãi" value="0">'+
                '<input type="hidden" />'+
                '</div>'+
                '</div>'+
                '<div class="col-lg-12">'+
                '<div class="form-group">'+
                '<label>Chi tiết dịch vụ:</label>'+
                '<textarea class="service-detail"></textarea>'+
                '</div>'+
                '</div>'+
                '<div class="col-lg-12 group-kind-ticket">'+
                '<div class="form-group">'+
                '<label>Loại vé:</label>'+
                '&emsp;'+
                '<button class="btn my-2 my-sm-0 btn-custom-org btn-add-kind-ticket btn-sm">'+
                '<i class="fa fa-plus" aria-hidden="true"></i>'+
                '</button>'+
                '</div>'+

                '</div>'+
                '</div>'+
                '</div>'
            );
            $('.services-tour').children('label').html('Dịch vụ:');
            editorMini('.service-detail', '.view-service');
        });

        //Button gửi dữ liệu
        $('.btn-upload').click(function(event) {
            /* Act on the event */
            var check = 1;
            var idTour = $('.name-tour').children('input').val();;
            var nameTour = $('.name-tour').children('b').html();
            var address = $('.address-tour').children('b').html();
            var lat = $('#lat').val();
            var lng = $('#lng').val();
            var policy = $('#policy').val();
            var content = $('#content').froalaEditor('html.get');
            var idService = '';
            var nameServiceDetail = '';
            var normalPrice = '';
            var price = '';
            var idKind = '';
            var nameKind = '';
            var namePrice = '';
            var services = [];
            var tickets = [];
            json = {};

            if(policy == ''){
                policy = 0;
            }

            if(content == ''){
                content = 'Không có mô tả';
            }

            if($('.service-list-tour').has('.packer-service-detail').length){
                $('.service-list-tour').find('.packer-service-detail').each(function(){

                    idService = $(this).children('.service-tour').children('.row').children('.name-service-form').children('.form-group').children('.name-service-detail').next().val();

                    nameServiceDetail = $(this).children('.service-tour').children('.row').children('.name-service-form').children('.form-group').children('.name-service-detail').val();

                    if(nameServiceDetail == ''){
                        $(this).children('.service-tour').children('.row').children('.name-service-form').children('.form-group').children('label').empty();
                        $(this).children('.service-tour').children('.row').children('.name-service-form').children('.form-group').children('label').append('Tên dịch vụ:<span class="mg-left-10 c_red">Xin vui lòng không để trống</span>');
                        $(this).children('.service-tour').children('.row').children('.name-service-form').children('.form-group').children('.name-service-detail').css('border', '1px solid #e12424');
                        $(this).children('.service-tour').slideDown();
                        $(this).children('.service-tour').prev().prev().addClass('service-active');
                        $(this).children('.service-tour').prev().prev().children('.fa').removeClass('fa-eye').addClass('fa-eye-slash');
                        check = 0;
                    }else{
                        $(this).children('.service-tour').children('.row').children('.name-service-form').children('.form-group').children('label').empty();
                        $(this).children('.service-tour').children('.row').children('.name-service-form').children('.form-group').children('label').append('Tên dịch vụ:');
                        $(this).children('.service-tour').children('.row').children('.name-service-form').children('.form-group').children('.name-service-detail').css('border', '1px solid #ced4da');
                    }

                    normalPrice = $(this).children('.service-tour').children('.row').children('.normal-price-service-form').children('.form-group').children('.normal-price-service-detail').val();

                    if(normalPrice == ''){
                        $(this).children('.service-tour').children('.row').children('.normal-price-service-form').children('.form-group').children('label').empty();
                        $(this).children('.service-tour').children('.row').children('.normal-price-service-form').children('.form-group').children('label').append('Giá:<span class="mg-left-10 c_red">Xin vui lòng không để trống</span>');
                        $(this).children('.service-tour').children('.row').children('.normal-price-service-form').children('.form-group').children('.normal-price-service-detail').css('border', '1px solid #e12424');
                        $(this).children('.service-tour').slideDown();
                        $(this).children('.service-tour').prev().prev().addClass('service-active');
                        $(this).children('.service-tour').prev().prev().children('.fa').removeClass('fa-eye').addClass('fa-eye-slash');
                        check = 0;
                    }else{
                        $(this).children('.service-tour').children('.row').children('.normal-price-service-form').children('.form-group').children('label').empty();
                        $(this).children('.service-tour').children('.row').children('.normal-price-service-form').children('.form-group').children('label').append('Giá:');
                        $(this).children('.service-tour').children('.row').children('.normal-price-service-form').children('.form-group').children('.normal-price-service-detail').css('border', '1px solid #ced4da');
                    }

                    price = $(this).children('.service-tour').children('.row').children('.price-service-form').children('.form-group').children('.price-service-detail').val();

                    if(price == '' || price == 0 || price.replace(/\./g, '') > normalPrice.replace(/\./g, '')){
                        $(this).children('.service-tour').children('.row').children('.price-service-form').children('.form-group').children('.price-service-detail').val(normalPrice);
                        $(this).children('.service-tour').children('.row').children('.price-service-form').children('.form-group').children('.price-service-detail').next().val(normalPrice.replace(/\./g, ''));
                    }

                    if($(this).children('.service-tour').children('.row').children('.group-kind-ticket').has('.kind-ticket').length){
                        $(this).children('.service-tour').children('.row').children('.group-kind-ticket').find('.kind-ticket').each(function(){

                            nameKind = $(this).children('.row').children('.name-kind-ticket').children('.form-group').children('input.form-control').val();

                            if(nameKind == ''){
                                $(this).children('.row').children('.name-kind-ticket').children('.form-group').children('label').empty();
                                $(this).children('.row').children('.name-kind-ticket').children('.form-group').children('label').append('Tên vé:<span class="mg-left-10 c_red">Xin vui lòng không để trống</span>');
                                $(this).children('.row').children('.name-kind-ticket').children('.form-group').children('input').css('border', '1px solid #e12424');
                                $(this).closest('.service-tour').slideDown();
                                $(this).children('.service-tour').prev().prev().addClass('service-active');
                                $(this).children('.service-tour').prev().prev().children('.fa').removeClass('fa-eye').addClass('fa-eye-slash');
                                check = 0;
                            }else{
                                $(this).children('.row').children('.name-kind-ticket').children('.form-group').children('label').empty();
                                $(this).children('.row').children('.name-kind-ticket').children('.form-group').children('label').append('Tên vé:');
                                $(this).children('.row').children('.name-kind-ticket').children('.form-group').children('input').css('border', '1px solid #ced4da');
                            }

                            namePrice = $(this).children('.row').children('.price-kind-ticket').children('.form-group').children('input').val();

                            if(namePrice == ''){
                                $(this).children('.row').children('.price-kind-ticket').children('.form-group').children('label').empty();
                                $(this).children('.row').children('.price-kind-ticket').children('.form-group').children('label').append('Giá vé:<span class="mg-left-10 c_red">Xin vui lòng không để trống</span>');
                                $(this).children('.row').children('.price-kind-ticket').children('.form-group').children('input').css('border', '1px solid #e12424');
                                check = 0;
                            }else if(namePrice == 0){
                                $(this).children('.row').children('.price-kind-ticket').children('.form-group').children('label').empty();
                                $(this).children('.row').children('.price-kind-ticket').children('.form-group').children('label').append('Giá vé:<span class="mg-left-10 c_red">Xin vui lòng nhập giá</span>');
                                $(this).children('.row').children('.price-kind-ticket').children('.form-group').children('input').css('border', '1px solid #e12424');
                            }else{
                                $(this).children('.row').children('.price-kind-ticket').children('.form-group').children('label').empty();
                                $(this).children('.row').children('.price-kind-ticket').children('.form-group').children('label').append('Giá vé:');
                                $(this).children('.row').children('.price-kind-ticket').children('.form-group').children('input').css('border', '1px solid #ced4da');
                            }

                            var ticketDetail = {
                                'nameTicket': nameKind,
                                'priceTicket': namePrice
                            };

                            tickets.push(ticketDetail);
                        });
                    }else{
                        // console.log('vớ vẩn');

                        var ticketDetail = {
                            'nameTicket': nameServiceDetail,
                            'priceTicket': price
                        };

                        tickets.push(ticketDetail);
                    }

                    var serviceDetail = {
                        'idService': idService,
                        'nameService': nameServiceDetail,
                        'normalPriceService': normalPrice,
                        'priceService': price,
                        'ticketDetail': tickets
                    };

                    services.push(serviceDetail);
                });
            }else{
                console.log('service: ' + services);
            }
            if($('#policy').val() == ''){
                $('#policy').val(0);
            }

            json['idTour'] = idTour;
            json['nameTour'] = nameTour;
            json['address'] = address;
            json['lat'] = lat;
            json['lng'] = lng;
            json['policy'] = policy;
            json['content'] = content;
            json['ticketDetail'] = services;

            console.log(json);
            if(check == 1){
                console.log('Send');
            }else{
                console.log('Not null');
            }

        });

        $(document).on('keyup', '.price-service-detail, .normal-price-service-detail, .price-kind-ticket input', function(event) {
            event.preventDefault();
            var val = $(this).val().replace(/\./g, '');
            if(isNaN(val) || val.indexOf(' ') !== -1){
                var price = $(this).next().val();
                $(this).val(format(price));
            }else{
                $(this).next().val(val);
                $(this).val(format($(this).val()));
            }
        });

        function format(num){
            var str = num.toString(), parts = false, output = [], i = 1, formatted = null;
            str = str.split("").reverse();
            for(var j = 0, len = str.length; j < len; j++) {
                if(str[j] != ".") {
                    output.push(str[j]);
                    if(i%3 == 0 && j < (len - 1)) {
                        output.push(".");
                    }
                    i++;
                }
            }
            formatted = output.reverse().join("");
            return(formatted + ((parts) ? "." + parts[1].substr(0, 2) : ""));
        };

    });

    function errorCallback() {

        var myLatlng = new google.maps.LatLng(16.075733, 108.16994899999997);

        var map = new google.maps.Map(document.getElementById('map'), {
            center: {lat: 16.075733, lng: 108.16994899999997},
            zoom: 13,
            mapTypeId: 'roadmap'
        });

        var markers = [];

        markers.push(new google.maps.Marker({
            map: map,
            title: 'Bạn đang ở đây',
            position: myLatlng
        }));

        $.ajax({
            url: 'https://maps.googleapis.com/maps/api/geocode/json?latlng='+16.075733+','+108.16994899999997+'&key=AIzaSyDawMp3IadhGe1AbQgDXGZM4CHfqDCNRYk',
            type: 'GET'
        })
            .done(function(data) {
                $('#lat').val(16.075733);
                $('#lng').val(108.16994899999997);
            })
            .fail(function() {
                console.log("error");
            })

        // Create the search box and link it to the UI element.
        var input = document.getElementById('pac-input');
        address = input;

        var searchBox = new google.maps.places.SearchBox(input);
        map.controls[google.maps.ControlPosition.TOP_LEFT].push(input);

        // Bias the SearchBox results towards current map's viewport.
        map.addListener('bounds_changed', function() {
            searchBox.setBounds(map.getBounds());
        });

        // Listen for the event fired when the user selects a prediction and retrieve
        // more details for that place.
        searchBox.addListener('places_changed', function() {
            var places = searchBox.getPlaces();

            console.log(places);

            if (places.length == 0) {
                return;
            }

            // Clear out the old markers.
            markers.forEach(function(marker) {
                marker.setMap(null);
            });
            markers = [];

            // For each place, get the icon, name and location.
            var bounds = new google.maps.LatLngBounds();

            places.forEach(function(place) {
                if (!place.geometry) {
                    return;
                }

                // Create a marker for each place.
                markers.push(new google.maps.Marker({
                    map: map,
                    title: place.name,
                    position: place.geometry.location
                }));

                if (place.geometry.viewport) {
                    // Only geocodes have viewport.
                    bounds.union(place.geometry.viewport);
                } else {
                    bounds.extend(place.geometry.location);
                }

                var getlatlng = place.geometry.location;

                $.ajax({
                    url: 'https://maps.googleapis.com/maps/api/geocode/json?latlng='+getlatlng.lat()+','+getlatlng.lng()+'&key=AIzaSyDawMp3IadhGe1AbQgDXGZM4CHfqDCNRYk',
                    type: 'GET'
                })
                    .done(function(data) {
                        $('#lat').val(getlatlng.lat());
                        $('#lng').val(getlatlng.lng());
                        $('.address-tour').children('b').html(data.results[0].formatted_address);
                    })
                    .fail(function() {
                        console.log("error");
                    })

            });
            map.fitBounds(bounds);
        });
    }

    if (navigator && navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(initAutocomplete, errorCallback);
    } else {
        console.log('Geolocation is not supported');
    }

    // Gmap
    function initAutocomplete(position) {

        var myLatlng = new google.maps.LatLng(position.coords.latitude, position.coords.longitude);

        var map = new google.maps.Map(document.getElementById('map'), {
            center: {lat: position.coords.latitude, lng: position.coords.longitude},
            zoom: 13,
            mapTypeId: 'roadmap'
        });

        var markers = [];

        markers.push(new google.maps.Marker({
            map: map,
            title: 'Bạn đang ở đây',
            position: myLatlng
        }));

        $.ajax({
            url: 'https://maps.googleapis.com/maps/api/geocode/json?latlng='+position.coords.latitude+','+position.coords.longitude+'&key=AIzaSyDawMp3IadhGe1AbQgDXGZM4CHfqDCNRYk',
            type: 'GET'
        })
            .done(function(data) {
                $('#lat').val(position.coords.latitude);
                $('#lng').val(position.coords.longitude);
                $('.address-tour').children('b').html(data.results[0].formatted_address);
            })
            .fail(function() {
                console.log("error");
            })

        // Create the search box and link it to the UI element.
        var input = document.getElementById('pac-input');
        address = input;

        var searchBox = new google.maps.places.SearchBox(input);
        map.controls[google.maps.ControlPosition.TOP_LEFT].push(input);

        // Bias the SearchBox results towards current map's viewport.
        map.addListener('bounds_changed', function() {
            searchBox.setBounds(map.getBounds());
        });

        // Listen for the event fired when the user selects a prediction and retrieve
        // more details for that place.
        searchBox.addListener('places_changed', function() {
            var places = searchBox.getPlaces();

            console.log(places);

            if (places.length == 0) {
                return;
            }

            // Clear out the old markers.
            markers.forEach(function(marker) {
                marker.setMap(null);
            });
            markers = [];

            // For each place, get the icon, name and location.
            var bounds = new google.maps.LatLngBounds();

            places.forEach(function(place) {
                if (!place.geometry) {
                    return;
                }

                // Create a marker for each place.
                markers.push(new google.maps.Marker({
                    map: map,
                    title: place.name,
                    position: place.geometry.location
                }));

                if (place.geometry.viewport) {
                    // Only geocodes have viewport.
                    bounds.union(place.geometry.viewport);
                } else {
                    bounds.extend(place.geometry.location);
                }

                var getlatlng = place.geometry.location;

                $.ajax({
                    url: 'https://maps.googleapis.com/maps/api/geocode/json?latlng='+getlatlng.lat()+','+getlatlng.lng()+'&key=AIzaSyDawMp3IadhGe1AbQgDXGZM4CHfqDCNRYk',
                    type: 'GET'
                })
                    .done(function(data) {
                        $('#lat').val(getlatlng.lat());
                        $('#lng').val(getlatlng.lng());
                        $('.address-tour').children('b').html(data.results[0].formatted_address);
                    })
                    .fail(function() {
                        console.log("error");
                    })

            });
            map.fitBounds(bounds);
        });
    }
</script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDawMp3IadhGe1AbQgDXGZM4CHfqDCNRYk&libraries=places"
        async defer></script>
<!-- End custom script-->
</body>
</html>
