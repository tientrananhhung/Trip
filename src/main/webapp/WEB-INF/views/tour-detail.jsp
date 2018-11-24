<%--
  Created by IntelliJ IDEA.
  User: T
  Date: 11/2/2018
  Time: 7:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tour detail - Smart Trip</title>
    <!-- Icon -->
    <link rel="icon" href="/resources/images/favicon.ico">
    <!-- Bootstrap css -->
    <link rel="stylesheet" href="/resources/css/bootstrap/bootstrap.min.css">
    <!-- OwlCarousel css -->
    <link rel="stylesheet" href="/resources/css/owlcarousel/owl.carousel.min.css">
    <link rel="stylesheet" href="/resources/css/owlcarousel/owl.theme.default.min.css">
    <!-- Star rating -->
    <link rel="stylesheet" href="/resources/css/starrating/fontawesome-stars-o.css">
    <!-- Fontawesome -->
    <link rel="stylesheet" href="/resources/css/fontawesome/font-awesome.min.css">
    <!-- Date Picker -->
    <link rel="stylesheet" href="/resources/css/daterangepicker/daterangepicker.css">
    <!-- My css -->
    <link rel="stylesheet" href="/resources/css/custom.css">
</head>
<body>
<jsp:include page="includes/navbar.jsp"/>
<!-- Start Carousel Slide -->
<c:forEach items="${listTourDetail}" var="lTourDetail" begin="0" end="0">
    <div class="loop owl-carousel owl-theme owl-loaded owl-drag">
        <c:forEach items="${lTourDetail.images}" var="imgTour">
            <a tabindex="-1">
                <div class="image-slider container-image"
                     style="background-image: url('/resources/images/${imgTour}');"></div>
            </a>
        </c:forEach>

            <%--<a tabindex="-1">--%>
            <%--<div class="image-slider container-image" style="background-image: url('/resources/images/detail2.jpg');"></div>--%>
            <%--</a>--%>
            <%--<a tabindex="-1">--%>
            <%--<div class="image-slider container-image" style="background-image: url('/resources/images/detail3.jpeg');"></div>--%>
            <%--</a>--%>
            <%--<a tabindex="-1">--%>
            <%--<div class="image-slider container-image" style="background-image: url('/resources/images/detail4.jpg');"></div>--%>
            <%--</a>--%>
            <%--<a tabindex="-1">--%>
            <%--<div class="image-slider container-image" style="background-image: url('/resources/images/detail5.jpg');"></div>--%>
            <%--</a>--%>
            <%--<a tabindex="-1">--%>
            <%--<div class="image-slider container-image" style="background-image: url('/resources/images/detail6.jpg');"></div>--%>
            <%--</a>--%>
    </div>
    <!-- End Carousel Slide -->
    <!-- Start Information of Tour -->
    <div class="container-fluid mg-bottom-10">
        <div class="box-content-fluid">
            <div class="row">
                <div class="col-lg-8 col-md-8 col-sm-12">
                        <%--<h1>Bà Nà Hills - Đường Lên Tiên Cảnh</h1>--%>
                    <h1>${lTourDetail.name}</h1>
                    <div class="cfs-14 critical-info">
                        <i class="fa fa-map-marker c_orange" aria-hidden="true"></i> Địa điểm:
                        <span>${lTourDetail.address}</span>
                    </div>
                    <div class="cfs-14 critical-info">
                        <i class="fa fa-check-square-o c_orange" aria-hidden="true"></i> Đối tác dịch vụ:
                        <span>${lTourDetail.partnerName} - ${lTourDetail.partnerAddress}</span>
                    </div>
                    <div class="properties">
                        <table class="table table-bordered">
                            <tbody>
                            <tr>
                                <c:choose>
                                    <c:when test="${lTourDetail.ticketType}">
                                        <td class="center">
                                            <div class="cfs-16">
                                                <i class="fa fa-eye c_orange m_right_10 c_orange"
                                                   aria-hidden="true"></i> Còn
                                            </div>
                                            <div class="cfs-14 pd-top-10">${lTourDetail.ticketQuantity - lTourDetail.ticketCount}</div>
                                        </td>
                                    </c:when>
                                    <c:otherwise>
                                        <td class="center">
                                            <div class="cfs-16">
                                                <i class="fa fa-eye c_orange m_right_10 c_orange"
                                                   aria-hidden="true"></i> Số lượt đặt
                                            </div>
                                            <div class="cfs-14 pd-top-10">${lTourDetail.ticketCount}</div>
                                        </td>
                                    </c:otherwise>
                                </c:choose>
                                <td class="center">
                                    <div class="cfs-16">
                                        <i class="fa fa-hourglass-half c_orange" aria-hidden="true"></i> Trạng thái
                                    </div>
                                    <c:choose>
                                        <c:when test="${lTourDetail.ticketType}">
                                            <c:choose>
                                                <c:when test="${(lTourDetail.ticketQuantity - lTourDetail.ticketCount) == 0}">
                                                    <div class="cfs-14 pd-top-10">Lượt đặt đã hết</div>
                                                </c:when>
                                                <c:otherwise>
                                                    <div class="cfs-14 pd-top-10">Có sẵn hôm nay</div>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="cfs-14 pd-top-10">Có sẵn hôm nay</div>
                                        </c:otherwise>
                                    </c:choose>
                                </td>
                                <td class="center">
                                    <div class="cfs-16">
                                        <i class="fa fa-times-circle c_orange" aria-hidden="true"></i> Chính sách huỷ
                                    </div>
                                    <div class="cfs-14 pd-top-10">Trước ${lTourDetail.policy} tiếng</div>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-12">
                    <div id="tour-order" class="tour-order">
                        <div class="card text-white bg-dark mb-3"
                             style="border-radius: 1px; border: 1px solid #e8e8e8;">
                            <c:if test="${lTourDetail.serviceIsDefault}">
                                <div class="card-header">
                                    <h2 class="fm-price">${lTourDetail.servicePrice} ₫</h2>
                                    <span class="price-sale fm-price">${lTourDetail.serviceNormalPrice} ₫</span>
                                </div>
                            </c:if>
                            <div class="card-body" style="padding: 10px; background: #fff;">
                                <div id="card-text-order" class="card-text" style="color: rgba(0,0,0,0.65);">Bạn sẽ nhận
                                    được thư xác nhận sau khi thanh toán.
                                </div>

                                <div id="card-order" class="card-text" style="color: rgba(0,0,0,0.65);">

                                    <div id="book-detail">
                                        <div class="row">
                                            <div class="col-lg-12" style="">
                                                <h3 class="cfs-16 book-service"></h3>
                                            </div>
                                            <div class="col-lg-12 book-date">
                                                <h4 class="cfs-14">Ngày đặt: <span></span></h4>
                                            </div>
                                            <div class="ant-col-24 book-time"></div>
                                        </div>
                                        <div class="row mg-bottom-10">
                                            <div class="col-lg-12">
                                                <div class="row">
                                                    <div class="col-lg-12">
                                                        <div class="book-package-person">

                                                            <div class="mg-bottom-10">
                                                                <div class="row">
                                                                    <div class="col-lg-6">Người Lớn</div>
                                                                    <div class="col-lg-2 center">x2</div>
                                                                    <div class="col-lg-4">
                                                                        <div class="t_right">1.000.000 ₫</div>
                                                                    </div>
                                                                </div>
                                                            </div>

                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-lg-6 col-md-6 col-sm-6">Tổng cộng</div>
                                                    <div class="col-lg-6 col-md-6 col-sm-6">
                                                        <div class="t_right">
                                                            <b id="total-price-service">0 ₫</b>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                </div>

                                <button type="button" class="btn btn-outline-success my-2 my-sm-0 btn-order btn-custom"
                                        style="width: 100%;" disabled="disabled">
                                    <span>Đặt ngay</span>
                                </button>
                                <div class="pd-top-10">
                                    <a href="#" class="btn btn-outline-success my-2 my-sm-0 btn-outline-custom"
                                       target="_blank" style="width: 100%;">
                                        <i class="fa fa-commenting-o m_right_10"></i> Tư vấn dịch vụ
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- End Information of Tour -->
</c:forEach>
<!-- Start Services -->
<div class="packages mg-top-10" style="background: rgb(236, 236, 236);">
    <div class="container-fluid">
        <div class="box-content-fluid">
            <div class="row">
                <div class="col-lg-8 col-md-8 col-sm-12">
                    <section class="info-section">
                        <h2 class="title-section">Các gói của vé.</h2>

                        <!--Datepicker-->
                        <div id="date-order" class="mg-bottom-10">
                            <i class="fa fa-calendar"></i>&nbsp;
                            <span>Chọn ngày</span>&nbsp;<i class="fa fa-caret-down"></i>
                        </div>
                        <!--Datepicker-->

                        <c:forEach items="${listTourDetail}" var="lTourDetail">
                            <div class="ticket-package-detail mg-top-20">
                                <div class="ticket-package-detail-body">
                                    <div class="df-ticket-package">
                                        <div class="row">
                                            <div class="col-lg-8">
                                                <h2>${lTourDetail.serviceName}</h2>
                                            </div>
                                            <div class="col-lg-4">
                                                <div class="g-right">
                                                    <div class="dp-ib">
                                                        <p class="cfs-16 c_black" style="margin: 0px;">
                                                            <strong class="fm-price">${lTourDetail.servicePrice}
                                                                ₫</strong>
                                                        </p>
                                                        <p class="cfs-14 price-sale c_gray fm-price"
                                                           style="margin: 0px;">${lTourDetail.serviceNormalPrice} ₫</p>
                                                    </div>
                                                    <span>
                                                        <span>
                                                            <button type="button"
                                                                    class="btn btn-outline-success my-2 my-sm-0 btn-custom btn-choose-ticket"
                                                                    style="vertical-align: top;">
                                                                <span>Chọn</span>
                                                            </button>
                                                        </span>
                                                    </span>
                                                </div>
                                            </div>
                                        </div>

                                        <div class="package-kind-ticket">
                                            <div class="row">

                                                <c:forEach items="${lTourDetail.serviceRule}" var="sRule">
                                                    <!-- Start Ticket detail -->
                                                    <div class="col-lg-6 mg-top-10">
                                                        <div class="row package-service-ticket">
                                                            <div class="col-lg-6">
                                                                <h3 class="cfs-16"
                                                                    style="font-weight: bolder;">${sRule.name}</h3>
                                                                <span>${sRule.priceFormat} đ</span>
                                                                <input type="hidden" value="${sRule.price}">
                                                            </div>
                                                            <div class="col-lg-6" style="text-align: center;">

                                                                <div class="ticket-form-item">
                                                                    <div class="ticket-form-item-control-wrapper">
                                                                        <div class="ticket-form-item-control">
                                                                            <span class="ticket-form-item-children">
                                                                                <div style="position: relative;">
                                                                                    <div class="number-stepper">
                                                                                        <button type="button"
                                                                                                class="btn-reduction"
                                                                                                disabled="disabled">−</button>
                                                                                        <span class="val-ticket">0</span>
                                                                                        <button type="button"
                                                                                                class="btn-increase">+</button>
                                                                                    </div>
                                                                                </div>
                                                                            </span>
                                                                        </div>
                                                                    </div>
                                                                </div>

                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- End Ticket detail -->
                                                </c:forEach>

                                            </div>
                                        </div>

                                        <p class="notify-ticket mg-top-20" style="color: #ef7a70;">Nhập tối thiểu 1
                                            người.</p>

                                        <div class="package-detail-more">
                                            <button class="btn btn-detail">
                                                <i class="fa fa-angle-right" aria-hidden="true"></i> Thông tin chi tiết
                                            </button>
                                            <div class="service-detail">
                                                    ${lTourDetail.serviceDetail}
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </c:forEach>

                    </section>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Services -->
<!-- Start Content Tour Detail -->
<div class="container-fluid">
    <div class="box-content-fluid">
        <div class="row">
            <div class="col-lg-8 col-md-8 col-sm-12">
                <!-- Start Content Tour -->
                <section class="tour-content">
                    <div id="tour-services">
                        <div class="info-section">
                            <c:forEach items="${listTourDetail}" var="lTourDetail">
                                ${lTourDetail.content}
                            </c:forEach>
                        </div>
                    </div>
                </section>
                <!-- End Content Tour -->

                <!-- Start Review and Comment -->
                <div id="tour-review">
                    <div class="info-section">
                        <div class="row">
                            <div class="col-lg-9">
                                <h2 class="ticket-title">Đánh giá (20 Nhận xét)</h2>
                            </div>
                            <div class="col-lg-3" style="margin: auto;">
                                <select id="star-rating" class="star-rating" name="rating" data-current-rating="3"
                                        style="float: right;">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <!-- Start Reviews -->
                    <div class="pd-left-20">
                        <div id="user-review">
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo"
                                         style="background-image: url('/resources/images/user1.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Văn Huệ Võ</h5>
                                    <div class="product-star">
                                        <div class="row">
                                            <div class="col-lg-2">
                                                <select class="star-rating" name="rating" data-current-rating="3"
                                                        style="float: right;">
                                                    <option value="1">1</option>
                                                    <option value="2">2</option>
                                                    <option value="3">3</option>
                                                    <option value="4">4</option>
                                                    <option value="5">5</option>
                                                </select>
                                            </div>
                                            <div class="col-lg-3">
                                                <span>12/09/2018 09:46</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Đây là địa điểm rất tốt để đi du lịch với gia đình. Gia đình mình đi 4 người và
                                        1 em bé nên tiết kiệm được 1 ít tiền và thời gian khi mua vé qua ứng dụng
                                        donkeyfun.
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- End Reviews -->

                    <div class="center mg-top-10">
                        <nav aria-label="navigation" style="overflow: hidden; display: inline-block;">
                            <ul class="pagination">
                                <li class="page-item disabled">
                                    <a class="page-link" href="#">
                                        <i class="fa fa-angle-left" aria-hidden="true"></i>
                                    </a>
                                </li>
                                <li class="page-item active"><a class="page-link" href="#">1</a></li>
                                <li class="page-item"><a class="page-link" href="#">2</a></li>
                                <li class="page-item">
                                    <a class="page-link" href="#">
                                        <i class="fa fa-angle-right" aria-hidden="true"></i>
                                    </a>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
                <!-- End Review and Comment -->
            </div>
        </div>
    </div>
</div>
<!-- End Content Tour Detail -->

<jsp:include page="includes/footer.jsp"/>

<!-- Start Import Script -->
<script type="text/javascript" src="/resources/js/jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/resources/js/owlcarousel/owl.carousel.js"></script>
<script type="text/javascript" src="/resources/js/popper/popper.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap/util.js"></script>
<script type="text/javascript" src="/resources/js/owlcarousel/highlight.js"></script>
<script type="text/javascript" src="/resources/js/owlcarousel/app.js"></script>
<script type="text/javascript" src="/resources/js/starrating/jquery.barrating.min.js"></script>
<script type="text/javascript" src="/resources/js/sticky/jquery.sticky.js"></script>
<script type="text/javascript" src="/resources/js/daterangepicker/moment.min.js"></script>
<script type="text/javascript" src="/resources/js/daterangepicker/daterangepicker.js"></script>
<script type="text/javascript" src="/resources/js/sticky/sticky.compile.js"></script>
<script type="text/javascript" src="/resources/js/custom.js"></script>
<!-- End Import Script -->
<!-- Start All Script -->
<script>
    //Start Owl Carousel Slide for post
    $(document).ready(function () {

        $(document).ready(function(){
            // $("#tour-order").sticky({topSpacing:0});
            var sticky = new Sticky('#tour-order');
        });

        $('.loop').owlCarousel({
            center: true,
            loop: true,
            responsive: {
                0: {
                    items: 1,
                    margin: 10
                },
                600: {
                    items: 2,
                    margin: 10
                },
                1000: {
                    items: 2,
                    margin: 10
                }
            }
        })
    })
    //End Owl Carousel Slide for post

    //Start Show tooltip bài viết
    $(function () {
        $('[data-toggle="tooltip"]').tooltip()
    })
    //End Show tooltip bài viết


    $(function () {

        //Cho nội dung thu lên
        $('.service-detail').slideUp();

        $('.btn-detail').click(function (event) {
            /* Act on the event */
            var a = $(this).attr('class');
            if (a != '' && a != undefined) {
                a = a.split(' ');
            } else {
                a = [];
            }
            // inArray là lệnh tìm kiếm active trong mảng a.
            if ($.inArray('active', a) >= 0) {
                $(this).children('.fa').removeClass('fa-angle-down').addClass('fa-angle-right');
                $(this).removeClass('active');
                $('.service-detail').slideUp();
            } else {
                $('.btn-detail').children('.fa').removeClass('fa-angle-down').addClass('fa-angle-right');
                $(this).children('.fa').removeClass('fa-angle-down').addClass('fa-angle-right');
                $('.service-detail').slideUp();
                $(this).next().slideToggle();
                $('.btn-detail').removeClass('active');
                $(this).addClass('active');
            }
        });
    });

    //Datepicker
    $(function () {

        var start = moment().subtract();

        function cb(start) {
            $('#date-order span').html(start.format('D/MM/YYYY'));
        }

        $('#date-order').daterangepicker({
            "singleDatePicker": true,
            "opens": "center",
        }, cb);

        cb(start);

    });

    $(document).ready(function () {

        <c:forEach items="${listTourDetail}" var="lTourDetail" begin="0" end="0">

        ratePageByTour(${lTourDetail.id}, 0);

        loadPaging(${lTourDetail.id});

        $(document).on('click', '.btn-page', function (event) {
            event.preventDefault();
            /* Act on the event */
            var page = $(this).attr('page');
            var finalPage = $('.btn-next').attr('final-page');
            ratePageByTour(${lTourDetail.id}, page);
            $('.page-item').removeClass('active');
            $(this).parent('.page-item').addClass('active');
            if (parseInt(page) == parseInt(finalPage)) {
                $('.btn-next').parent('.page-item').addClass('disabled');
                $('.btn-back').parent('.page-item').removeClass('disabled');
            } else if (parseInt(page) == 0) {
                $('.btn-back').parent('.page-item').addClass('disabled');
                $('.btn-next').parent('.page-item').removeClass('disabled');
            } else {
                $('.btn-back').parent('.page-item').removeClass('disabled');
                $('.btn-next').parent('.page-item').removeClass('disabled');
            }
        });

        $(document).on('click', '.btn-next', function (event) {
            event.preventDefault();
            /* Act on the event */
            $('.btn-back').parent('.page-item').removeClass('disabled');
            var currentPage = $('.btn-next').attr('current-page');
            var finalPage = $('.btn-next').attr('final-page');
            if (parseInt(currentPage) == parseInt(finalPage) - 1) {
                $('.btn-next').parent('.page-item').addClass('disabled');
            }
            $('li.active').removeClass('active').next().addClass('active');
            console.log(parseInt(currentPage) + 1);
            ratePageByTour(${lTourDetail.id}, parseInt(currentPage) + 1);
        });

        $(document).on('click', '.btn-back', function (event) {
            event.preventDefault();
            /* Act on the event */
            $('.btn-next').parent('.page-item').removeClass('disabled');
            var currentPage = $('.btn-back').attr('current-page');
            if (parseInt(currentPage) == 1) {
                $('.btn-back').parent('.page-item').addClass('disabled');
            }
            $('li.active').removeClass('active').prev().addClass('active');
            ratePageByTour(${lTourDetail.id}, parseInt(currentPage) - 1);
        });

        </c:forEach>

        //Button tăng số lượng ticket
        $(document).on('click', '.btn-increase', function (event) {
            event.preventDefault();
            /* Act on the event */
            var valTicket = $(this).prev().html();
            var newValTicket = parseInt(valTicket) + 1;
            $('.notify-ticket').hide(500);
            $(this).prev().html(newValTicket);
            $(this).prevAll().prop('disabled', false);
            $('.btn-order').prop('disabled', false);
            setOrder($('.package-service-ticket').toArray());
        });

        //Button giảm số lượng ticket
        $(document).on('click', '.btn-reduction', function (event) {
            event.preventDefault();
            /* Act on the event */
            var valTicket = $(this).next().html();
            var newValTicket = parseInt(valTicket) - 1;
            var a = [];
            if (parseInt(valTicket) == 0) {
                $(this).prop('disabled', true);
            } else {
                var arValTicket = $('.val-ticket').toArray();
                $(this).next().html(newValTicket);
                for (i = 0; i < arValTicket.length; i++) {
                    a.push($(arValTicket[i]).html());
                }
                var check = 0
                for (var j = 0; j < a.length; j++) {
                    if (a[j] != 0) {
                        check = 1;
                    }
                }
                if (check == 0) {
                    $(this).parent('.number-stepper').parent('div').parent('.ticket-form-item-children').parent('.ticket-form-item-control').parent('.ticket-form-item-control-wrapper').parent('.ticket-form-item').parent('.col-lg-6').parent('.package-service-ticket').parent('.col-lg-6').parent('.row').parent('.package-kind-ticket').next('.notify-ticket').show(500);
                    $('.btn-order').prop('disabled', true);
                }

            }
            setOrder($('.package-service-ticket').toArray());
        });

        $(document).on('click', '.btn-choose-ticket', function (event) {
            event.preventDefault();
            /* Act on the event */

            resetBtnChooseTicket();

            $(this).parent('span').parent('span').parent('.g-right').parent('.col-lg-4').parent('.row').parent('.df-ticket-package').children('.package-kind-ticket, .notify-ticket').show(500).fadeIn();
            $(this).css('display', 'none');
            $(this).parent('span').parent('span').parent('.g-right').parent('.col-lg-4').parent('.row').parent('.df-ticket-package').parent('.ticket-package-detail-body').parent('.ticket-package-detail').addClass('ticket-selected');

            var service = $(this).parent('span').parent('span').parent('.g-right').parent('.col-lg-4').prev().children('h2').html();
            var dateOrder = $('#date-order').children('span').html();
            $('.book-service').html(service);
            $('.book-date h4 span').html(dateOrder);
        });

        $(document).on('click', '#date-order', function (event) {
            event.preventDefault();
            /* Act on the event */
            $('#card-order').hide(500);
            $('#card-text-order').show(500);
            $('.ticket-package-detail').removeClass('ticket-selected');
            $('.btn-choose-ticket').css('display', 'inherit');
            // $('.package-kind-ticket').css('display', 'none');
            $('.package-kind-ticket').hide(500);
            $('.notify-ticket').css('display', 'none');
        });

        // $('.tour-order').sticky({
        //     topSpacing: 0,
        //     bottomSpacing: 450,
        //     zIndex: 9999
        // });

    });

</script>
<script type="text/javascript">


</script>
<!--  -->
<!-- End All Script -->
</body>
</html>