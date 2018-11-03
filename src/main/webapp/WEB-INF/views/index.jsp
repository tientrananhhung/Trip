<%--
  Created by IntelliJ IDEA.
  User: Tien Tran
  Date: 25/09/2018
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trang Chủ - Smart Trip</title>
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
    <!-- My css -->
    <link rel="stylesheet" href="/resources/css/custom.css">
</head>
<body>

<jsp:include page="includes/navbar.jsp"/>

<!-- Start Carousel Slide -->
<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img class="d-block w-100 img-fluid" src="/resources/images/slidetour1.jpg" alt="First slide">
        </div>
        <div class="carousel-item">
            <img class="d-block w-100 img-fluid" src="/resources/images/slidetour2.jpg" alt="Second slide">
        </div>
        <div class="carousel-item">
            <img class="d-block w-100 img-fluid" src="/resources/images/slidetour3.jpg" alt="Third slide">
        </div>
        <div class="carousel-item">
            <img class="d-block w-100 img-fluid" src="/resources/images/slidetour4.jpg" alt="Third slide">
        </div>
    </div>
    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
<!-- End Carousel Slide -->

<!-- Start Content website -->
<div class="container-fluid">

    <!-- Start Điểm đến nổi bật -->
    <section class="box-content-fluid box-content mg-top-30">
        <div class="box-title mg-bottom-30">
            <h2>điểm đến nổi bật</h2>
            <a href="#">Xem thêm »</a>
        </div>
        <div class="box-body">
            <div class="combo-big">
                <a class="city-tickets" href="#" style="background-image: url('/resources/images/combo1.jpg');">
                    <div class="ticket-relative">
                        <div class="ticket-info">
                            <div class="ticket-big-short">
                                <h3>Combo Du lịch Sapa xuất phát từ Hà Nội - Adam Hotel</h3>
                                <div class="price t16">Giá chỉ từ <span class="c_orange_l">690.000đ</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </a>
            </div>
            <div class="combo-small" style="margin-bottom: 6px;">
                <a class="city-tickets" href="#" style="background-image: url('/resources/images/combo2.jpg');">
                    <div class="ticket-relative">
                        <div class="ticket-info">
                            <div class="ticket-small-short">
                                <h3>Combo Tour Đà Nẵng xuất phát từ HN/ HCM</h3>
                                <div class="price t16">Giá chỉ từ <span class="c_orange_l">3.990.000đ</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </a>
            </div>
            <div class="combo-small">
                <a class="city-tickets" href="#" style="background-image: url('/resources/images/combo3.jpg');">
                    <div class="ticket-relative">
                        <div class="ticket-info">
                            <div class="ticket-small-short">
                                <h3>Combo Du lịch Nha Trang siêu tiết kiệm xuất phát từ HN/HCM</h3>
                                <div class="price t16">Giá chỉ từ <span class="c_orange_l">1.990.000đ</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </a>
            </div>
        </div>
    </section>
    <!-- End Điểm đến nổi bật -->

    <!-- Start Điểm đến tự chọn -->
    <section class="box-content-fluid box-content mg-top-30">
        <div class="box-title mg-bottom-30">
            <h2>điểm đến tự chọn</h2>
            <a href="#">Xem thêm »</a>
        </div>
        <div class="box-body">
            <div class="row">
                <div class="col-lg-12 columns">
                    <div class="owl-carousel owl-theme">
                        <div class="item" data-toggle="tooltip" data-placement="top"
                             title="Bà Nà Hills - Đường Lên Tiên Cảnh">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/tour1.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Bà Nà Hills - Đường Lên Tiên Cảnh</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> An Sơn - Hòa Ninh -
                                                Hòa Vang - Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fas fa-ticket-alt"></i> 1000 lượt đặt</td>
                                                        <td>
                                                            <select class="star-rating" name="rating"
                                                                    data-current-rating="3">
                                                                <option value="1">1</option>
                                                                <option value="2">2</option>
                                                                <option value="3">3</option>
                                                                <option value="4">4</option>
                                                                <option value="5">5</option>
                                                            </select>
                                                        </td>
                                                    </tr>
                                                    <tr class="tb-price">
                                                        <td colspan="2" style="text-align: center;">
													    		<span class="mg-right-10 card-price-box">
													    			Giá: <strong
                                                                        class="card-price-sale">681.000đ</strong>
													    		</span>
                                                            <strong class="card-price"><strike>700.000đ</strike></strong>
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top"
                             title="Công viên suối khoáng nóng Núi Thần Tài">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/tour2.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Công viên suối khoáng nóng Núi Thần Tài</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> QL14G - Hoà Phú -
                                                Hòa Vang - Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fas fa-ticket-alt"></i> 1000 lượt đặt</td>
                                                        <td>
                                                            <select class="star-rating" name="rating"
                                                                    data-current-rating="3">
                                                                <option value="1">1</option>
                                                                <option value="2">2</option>
                                                                <option value="3">3</option>
                                                                <option value="4">4</option>
                                                                <option value="5">5</option>
                                                            </select>
                                                        </td>
                                                    </tr>
                                                    <tr class="tb-price">
                                                        <td colspan="2" style="text-align: center;">
													    		<span class="mg-right-10 card-price-box">
													    			Giá: <strong
                                                                        class="card-price-sale">285.000đ</strong>
													    		</span>
                                                            <strong class="card-price"><strike>300.000đ</strike></strong>
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top"
                             title="Du thuyền sông Hàn - MerryLand">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/tour3.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Du thuyền sông Hàn - MerryLand</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> Bạch Đằng - Thạch
                                                Thang - Hải Châu - Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fas fa-ticket-alt"></i> 1000 lượt đặt</td>
                                                        <td>
                                                            <select class="star-rating" name="rating"
                                                                    data-current-rating="3">
                                                                <option value="1">1</option>
                                                                <option value="2">2</option>
                                                                <option value="3">3</option>
                                                                <option value="4">4</option>
                                                                <option value="5">5</option>
                                                            </select>
                                                        </td>
                                                    </tr>
                                                    <tr class="tb-price">
                                                        <td colspan="2" style="text-align: center;">
													    		<span class="mg-right-10 card-price-box">
													    			Giá: <strong
                                                                        class="card-price-sale">117.000đ</strong>
													    		</span>
                                                            <strong class="card-price"><strike>150.000đ</strike></strong>
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top" title="Vinpearl Land Hội An">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/tour4.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Vinpearl Land Hội An</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> Đường Thanh Niên,
                                                Bình Dương, Thăng Bình, Quảng Nam
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fas fa-ticket-alt"></i> 1000 lượt đặt</td>
                                                        <td>
                                                            <select class="star-rating" name="rating"
                                                                    data-current-rating="3">
                                                                <option value="1">1</option>
                                                                <option value="2">2</option>
                                                                <option value="3">3</option>
                                                                <option value="4">4</option>
                                                                <option value="5">5</option>
                                                            </select>
                                                        </td>
                                                    </tr>
                                                    <tr class="tb-price">
                                                        <td colspan="2" style="text-align: center;">
													    		<span class="mg-right-10 card-price-box">
													    			Giá: <strong
                                                                        class="card-price-sale">250.000đ</strong>
													    		</span>
                                                            <!-- <strong class="card-price"><strike>300.000đ</strike></strong> -->
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top" title="Khu du lịch Hòa Phú Thành">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/tour5.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Khu du lịch Hòa Phú Thành</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> Quốc Lộ 14G - Hòa
                                                Phú - Hòa Vang - Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fas fa-ticket-alt"></i> 1000 lượt đặt</td>
                                                        <td>
                                                            <select class="star-rating" name="rating"
                                                                    data-current-rating="3">
                                                                <option value="1">1</option>
                                                                <option value="2">2</option>
                                                                <option value="3">3</option>
                                                                <option value="4">4</option>
                                                                <option value="5">5</option>
                                                            </select>
                                                        </td>
                                                    </tr>
                                                    <tr class="tb-price">
                                                        <td colspan="2" style="text-align: center;">
													    		<span class="mg-right-10 card-price-box">
													    			Giá: <strong
                                                                        class="card-price-sale">48.000đ</strong>
													    		</span>
                                                            <strong class="card-price"><strike>50.000đ</strike></strong>
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top"
                             title="Art In Paradise Đà Nẵng - 3D Art Museum">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/tour6.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Art In Paradise Đà Nẵng - 3D Art Museum</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> Lô C2-10 Trần Nhân
                                                Tông - Sơn Trà - Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fas fa-ticket-alt"></i> 1000 lượt đặt</td>
                                                        <td>
                                                            <select class="star-rating" name="rating"
                                                                    data-current-rating="3">
                                                                <option value="1">1</option>
                                                                <option value="2">2</option>
                                                                <option value="3">3</option>
                                                                <option value="4">4</option>
                                                                <option value="5">5</option>
                                                            </select>
                                                        </td>
                                                    </tr>
                                                    <tr class="tb-price">
                                                        <td colspan="2" style="text-align: center;">
													    		<span class="mg-right-10 card-price-box">
													    			Giá: <strong
                                                                        class="card-price-sale">117.000đ</strong>
													    		</span>
                                                            <strong class="card-price"><strike>140.000đ</strike></strong>
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top"
                             title="Bà Nà Hills - Đường Lên Tiên Cảnh (Trong ngày)">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/tour1.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Bà Nà Hills - Đường Lên Tiên Cảnh (Trong ngày)</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fas fa-ticket-alt"></i> 1000 lượt đặt</td>
                                                        <td>
                                                            <select class="star-rating" name="rating"
                                                                    data-current-rating="3">
                                                                <option value="1">1</option>
                                                                <option value="2">2</option>
                                                                <option value="3">3</option>
                                                                <option value="4">4</option>
                                                                <option value="5">5</option>
                                                            </select>
                                                        </td>
                                                    </tr>
                                                    <tr class="tb-price">
                                                        <td colspan="2" style="text-align: center;">
													    		<span class="mg-right-10 card-price-box">
													    			Giá: <strong class="card-price-sale">850.000đ - 980.000</strong>
													    		</span>
                                                            <strong class="card-price"><strike>140.000đ</strike></strong>
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top"
                             title="Cù Lao Chàm - Lặn Ngắm San Hô (Trong ngày)">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/tour7.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Cù Lao Chàm - Lặn Ngắm San Hô (Trong ngày)</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fas fa-ticket-alt"></i> 1000 lượt đặt</td>
                                                        <td>
                                                            <select class="star-rating" name="rating"
                                                                    data-current-rating="3">
                                                                <option value="1">1</option>
                                                                <option value="2">2</option>
                                                                <option value="3">3</option>
                                                                <option value="4">4</option>
                                                                <option value="5">5</option>
                                                            </select>
                                                        </td>
                                                    </tr>
                                                    <tr class="tb-price">
                                                        <td colspan="2" style="text-align: center;">
													    		<span class="mg-right-10 card-price-box">
													    			Giá: <strong
                                                                        class="card-price-sale">590.000đ</strong>
													    		</span>
                                                            <!-- <strong class="card-price"><strike>140.000đ</strike></strong> -->
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top" title="City tour Huế (Trong ngày)">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/tour8.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">City tour Huế (Trong ngày)</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fas fa-ticket-alt"></i> 1000 lượt đặt</td>
                                                        <td>
                                                            <select class="star-rating" name="rating"
                                                                    data-current-rating="3">
                                                                <option value="1">1</option>
                                                                <option value="2">2</option>
                                                                <option value="3">3</option>
                                                                <option value="4">4</option>
                                                                <option value="5">5</option>
                                                            </select>
                                                        </td>
                                                    </tr>
                                                    <tr class="tb-price">
                                                        <td colspan="2" style="text-align: center;">
													    		<span class="mg-right-10 card-price-box">
													    			Giá: <strong
                                                                        class="card-price-sale">650.000đ</strong>
													    		</span>
                                                            <!-- <strong class="card-price"><strike>140.000đ</strike></strong> -->
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top"
                             title="Đảo Lý Sơn 2N1Đ (Đón tại Đà Nẵng)">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/tour9.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Đảo Lý Sơn 2N1Đ (Đón tại Đà Nẵng)</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fas fa-ticket-alt"></i> 1000 lượt đặt</td>
                                                        <td>
                                                            <select class="star-rating" name="rating"
                                                                    data-current-rating="3">
                                                                <option value="1">1</option>
                                                                <option value="2">2</option>
                                                                <option value="3">3</option>
                                                                <option value="4">4</option>
                                                                <option value="5">5</option>
                                                            </select>
                                                        </td>
                                                    </tr>
                                                    <tr class="tb-price">
                                                        <td colspan="2" style="text-align: center;">
													    		<span class="mg-right-10 card-price-box">
													    			Giá: <strong
                                                                        class="card-price-sale">1.290.000đ</strong>
													    		</span>
                                                            <!-- <strong class="card-price"><strike>140.000đ</strike></strong> -->
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top"
                             title="Suối Khoáng Nóng Thần Tài (Trong ngày)">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/tour10.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Suối Khoáng Nóng Thần Tài (Trong ngày)</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fas fa-ticket-alt"></i> 1000 lượt đặt</td>
                                                        <td>
                                                            <select class="star-rating" name="rating"
                                                                    data-current-rating="3">
                                                                <option value="1">1</option>
                                                                <option value="2">2</option>
                                                                <option value="3">3</option>
                                                                <option value="4">4</option>
                                                                <option value="5">5</option>
                                                            </select>
                                                        </td>
                                                    </tr>
                                                    <tr class="tb-price">
                                                        <td colspan="2" style="text-align: center;">
													    		<span class="mg-right-10 card-price-box">
													    			Giá: <strong
                                                                        class="card-price-sale">650.000đ</strong>
													    		</span>
                                                            <!-- <strong class="card-price"><strike>140.000đ</strike></strong> -->
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top"
                             title="Ngũ Hành Sơn - Hội An (Trong ngày)">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/tour11.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Ngũ Hành Sơn - Hội An (Trong ngày)</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fas fa-ticket-alt"></i> 1000 lượt đặt</td>
                                                        <td>
                                                            <select class="star-rating" name="rating"
                                                                    data-current-rating="3">
                                                                <option value="1">1</option>
                                                                <option value="2">2</option>
                                                                <option value="3">3</option>
                                                                <option value="4">4</option>
                                                                <option value="5">5</option>
                                                            </select>
                                                        </td>
                                                    </tr>
                                                    <tr class="tb-price">
                                                        <td colspan="2" style="text-align: center;">
													    		<span class="mg-right-10 card-price-box">
													    			Giá: <strong
                                                                        class="card-price-sale">350.000đ</strong>
													    		</span>
                                                            <!-- <strong class="card-price"><strike>140.000đ</strike></strong> -->
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- End Điểm đến tự chọn -->

    <!-- Start Bài viết mới nhất -->
    <section class="box-content-fluid box-content mg-top-30">
        <div class="box-title mg-bottom-30">
            <h2>bài viết mới nhất</h2>
            <a href="#">Xem thêm »</a>
        </div>
        <div class="box-body">
            <div class="post-big">
                <a class="city-tickets" href="#" style="background-image: url('/resources/images/post1.jpg');">
                    <div class="ticket-relative">
                        <div class="ticket-info">
                            <div class="ticket-big-short">
                                <h3>Ngất ngây trước 5 điểm sống ảo ở Đà Lạt khiến dân tình chao đảo</h3>
                            </div>
                        </div>
                    </div>
                </a>
            </div>
            <div class="post-small" style="border-bottom: 5px solid white;">
                <a class="city-tickets" href="#" style="background-image: url('/resources/images/post2.jpg');">
                    <div class="ticket-relative">
                        <div class="ticket-info">
                            <div class="ticket-small-short">
                                <h3>Ẩm thực Trần – Tinh hoa ẩm thực đặc sản xứ Quảng</h3>
                            </div>
                        </div>
                    </div>
                </a>
            </div>
            <div class="post-small" style="border-bottom: 5px solid white;">
                <a class="city-tickets" href="#" style="background-image: url('/resources/images/post3.jpg');">
                    <div class="ticket-relative">
                        <div class="ticket-info">
                            <div class="ticket-small-short">
                                <h3>Bỏ túi bí kíp, không còn lo du lịch Nha Trang nên đi đâu</h3>
                            </div>
                        </div>
                    </div>
                </a>
            </div>
            <div class="post-small">
                <a class="city-tickets" href="#" style="background-image: url('/resources/images/post4.jpg');">
                    <div class="ticket-relative">
                        <div class="ticket-info">
                            <div class="ticket-small-short">
                                <h3>Những đặc sản Hà Nội làm nức lòng khách du lịch Thủ Đô</h3>
                            </div>
                        </div>
                    </div>
                </a>
            </div>
            <div class="post-small">
                <a class="city-tickets" href="#" style="background-image: url('/resources/images/post5.jpg');">
                    <div class="ticket-relative">
                        <div class="ticket-info">
                            <div class="ticket-small-short">
                                <h3> Bỏ túi địa chỉ 5 món ngon ở Đà Nẵng nhất định bạn phải thử một lần</h3>
                            </div>
                        </div>
                    </div>
                </a>
            </div>
        </div>
    </section>
    <!-- End Bài viết mới nhất -->

    <!-- Start Điểm ăn uống -->
    <section class="box-content-fluid box-content mg-top-30">
        <div class="box-title mg-bottom-30">
            <h2>điểm ăn uống tự chọn</h2>
            <a href="#">Xem thêm »</a>
        </div>
        <div class="box-body">
            <div class="row">
                <div class="col-lg-12 columns">
                    <div class="owl-carousel owl-theme">
                        <div class="item" data-toggle="tooltip" data-placement="top"
                             title="Trà Tiên Hưởng - Lê Đình Dương">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/food1.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Trà Tiên Hưởng - Lê Đình Dương</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> 32 Lê Đình Dương,
                                                Quận Hải Châu, Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fa fa-cutlery" aria-hidden="true"></i>
                                                            Café/Dessert
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top" title="EZI Coffee">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/food2.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">EZI Coffee</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> 30 Ông Ích Khiêm,
                                                Quận Hải Châu, Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fa fa-cutlery" aria-hidden="true"></i>
                                                            Café/Dessert
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top" title="Mote Pizza">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/food3.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Mote Pizza</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> 146 Lê Lợi, P. Hải
                                                Châu 1, Quận Hải Châu, Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fa fa-cutlery" aria-hidden="true"></i> Quán ăn
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top"
                             title="King Castella - Bánh Bông Lan Đài Loan - Trần Phú">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/food4.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">King Castella - Bánh Bông Lan Đài Loan - Trần Phú</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> 206 Trần Phú, Quận
                                                Hải Châu, Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fa fa-cutlery" aria-hidden="true"></i> Quán ăn
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top" title="Vevy Milktea">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/food5.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Vevy Milktea</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> 71 - 73 Phan Châu
                                                Trinh, Quận Hải Châu, Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fa fa-cutlery" aria-hidden="true"></i>
                                                            Café/Dessert
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top"
                             title="Royal Tea - Nguyễn Văn Thoại">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/food6.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Royal Tea - Nguyễn Văn Thoại</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> 95 Nguyễn Văn Thoại,
                                                Quận Ngũ Hành Sơn, Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fa fa-cutlery" aria-hidden="true"></i>
                                                            Café/Dessert
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top" title="Phố cổ Hà Nội">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/food7.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Phố cổ Hà Nội</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> 22 Phan Thanh Tài,
                                                Quận Hải Châu, Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fa fa-cutlery" aria-hidden="true"></i> Quán ăn
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top" title="Chân Gà Sả Ớt Hà An">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/food8.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Chân Gà Sả Ớt Hà An</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> K129/80 Tiểu La, P.
                                                Hòa Cường Bắc, Quận Hải Châu, Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fa fa-cutlery" aria-hidden="true"></i> Quán ăn
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top" title="Trà Sữa R&B">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/food9.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Trà Sữa R&B</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> 89 - 91 Nguyễn Văn
                                                Linh, Quận Hải Châu, Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fa fa-cutlery" aria-hidden="true"></i>
                                                            Café/Dessert
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top" title="Bún Đậu Mắm Tôm Bà Cúc">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/food10.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Bún Đậu Mắm Tôm Bà Cúc</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> 209 Tố Hữu, Quận Cẩm
                                                Lệ, Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fa fa-cutlery" aria-hidden="true"></i> Quán ăn
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top" title="Tokbokki Ly">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/food11.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Tokbokki Ly</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> 64 An Thượng 20,
                                                Quận Ngũ Hành Sơn, Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fa fa-cutlery" aria-hidden="true"></i> Quán ăn
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="item" data-toggle="tooltip" data-placement="top"
                             title="Trà Sữa Thỏ 7 Màu - Phan Tứ">
                            <div class="card">
                                <a href="#">
                                    <img class="card-img-top" src="/resources/images/food12.jpg" alt="Card image cap">
                                    <div class="card-body">
                                        <h5 class="card-title">Trà Sữa Thỏ 7 Màu - Phan Tứ</h5>
                                        <div class="card-description">
                                            <div class="card-place">
                                                <i class="fa fa-map-marker" aria-hidden="true"></i> 1 Phan Tứ, Quận Ngũ
                                                Hành Sơn, Đà Nẵng
                                            </div>
                                            <div class="card-infor">
                                                <table class="table">
                                                    <tr class="tb-infor">
                                                        <td><i class="fa fa-cutlery" aria-hidden="true"></i> Quán ăn
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- End Điểm ăn uống -->

</div>
<!-- End Content website -->

<jsp:include page="includes/services.jsp"/>

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
<!-- End Import Script -->

<!-- Start All Script -->

<!-- Start Owl Carousel Slide for post -->
<script>
    $(document).ready(function () {
        $('.owl-carousel').owlCarousel({
            loop: true,
            margin: 10,
            responsiveClass: true,
            responsive: {
                0: {
                    items: 1,
                    nav: false
                },
                600: {
                    items: 3,
                    nav: false
                },
                1000: {
                    items: 4,
                    nav: false,
                    loop: false,
                    margin: 20
                }
            }
        })
    })
</script>
<!-- End Owl Carousel Slide for post -->

<!-- Start Show tooltip bài viết -->
<script>
    $(function () {
        $('[data-toggle="tooltip"]').tooltip()
    })
</script>
<!-- End Show tooltip bài viết -->
<!--  -->
<script type="text/javascript">
    $(function () {
        $('.star-rating').barrating({
            theme: 'fontawesome-stars-o',
            readonly: true,
            initialRating: 3.5
        });
    });
</script>
<!--  -->

<!-- Start All Script -->
</body>
</html>
