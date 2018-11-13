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
    <div class="container-fluid">
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
                    <div class="tour-order">
                        <div class="card text-white bg-dark mb-3"
                             style="border-radius: 1px; border: 1px solid #e8e8e8;">
                            <c:if test="${lTourDetail.serviceIsDefault}">
                                <div class="card-header">
                                    <h2 class="fm-price">${lTourDetail.servicePrice} ₫</h2>
                                    <span class="price-sale fm-price">${lTourDetail.serviceNormalPrice} ₫</span>
                                </div>
                            </c:if>
                            <div class="card-body" style="padding: 10px; background: #fff;">
                                <p class="card-text" style="color: rgba(0,0,0,0.65);">Bạn sẽ nhận được thư xác nhận sau
                                    khi
                                    thanh toán.</p>
                                <button type="button" class="btn btn-outline-success my-2 my-sm-0 btn-custom"
                                        style="width: 100%;">
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
<div class="packages" style="background: rgb(236, 236, 236);">
    <div class="container-fluid">
        <div class="box-content-fluid">
            <div class="row">
                <div class="col-lg-8 col-md-8 col-sm-12">
                    <section class="info-section">
                        <h2 class="title-section">Các gói của vé.</h2>
                        <input type="text">

                        <c:forEach items="${listTourDetail}" var="lTourDetail">
                            <div class="ticket-package-detail">
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
                                                                        class="btn btn-outline-success my-2 my-sm-0 btn-custom"
                                                                        style="vertical-align: top;">
                                                                    <span>Chọn</span>
                                                        </button>
                                                        </span>
                                                        </span>
                                                </div>
                                            </div>
                                        </div>
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
                                <select class="star-rating" name="rating" data-current-rating="3" style="float: right;">
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
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo"
                                         style="background-image: url('/resources/images/user2.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Thành Nhân Võ</h5>
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
                                                <span>12/09/2018 05:32</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Mua vé ở đây tuy giá rẻ không hơn bao nhiêu nhưng lại đỡ mất công đi lại, chờ
                                        đợi mua vé. Vé đi Bà Nà rất suôn sẻ, nhóm bạn mình đã cảm thấy tiết kiệm thời
                                        gian hơn rất nhiều để có nhiều time vui chơi hơn.
                                    </p>
                                </div>
                            </div>
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo"
                                         style="background-image: url('/resources/images/user3.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Ngọc Tuân Nguyễn</h5>
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
                                                <span>11/09/2018 09:36</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Đây là lần thứ 2 mình đi Bà Nà, lần đầu mình lên đến nơi mới mua vé nên rất mất
                                        thời gian. Lần 2 này mình đặt vé qua donkeyfun giá tuy không rẻ hơn bao nhiêu
                                        nhưng lại nhanh chóng tiện lợi, nhân viên lại tư vấn nhiệt tình và rất vui vẻ.
                                    </p>
                                </div>
                            </div>
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo"
                                         style="background-image: url('/resources/images/user4.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Thị Thanh Tài Võ</h5>
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
                                                <span>11/09/2018 06:12</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Đặt vé tại donkeyfun nên không mất quá nhiều thời gian, 1 ngày có thể tham quan
                                        hết Bà Nà Hills,,đồ ăn ở các nhà hàng ở Bà Nà cũng rất được.
                                    </p>
                                </div>
                            </div>
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo"
                                         style="background-image: url('/resources/images/user5.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Văn Nhớ Trần</h5>
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
                                                <span>11/09/2018 04:41</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Mua vé ở Donkeyfun rất tiện lợi, nhưng đi vào dịp lễ rất đông người nên phải
                                        đứng đợi rất rất lâu mới vào được cổng, người thì rất đông, nhưng lại không có
                                        quạt gió, thời tiết lại nóng nên tạo cảm giác rất mỏi mệt khi chờ đợi để được
                                        vào cổng.
                                    </p>
                                </div>
                            </div>
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo"
                                         style="background-image: url('/resources/images/user6.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Tnkt Truong</h5>
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
                                                <span>10/09/2018 18:03</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Nghe danh Bà Nà Hills đã lâu, là niềm ao ước của ai khi đến Đà Nẵng,. Khí hậu
                                        rất tuyệt để trốn cái nắng của Đà Thành, cảnh đẹp rừng núi với những tòa lâu đài
                                        rất tuyệt vời. Mình và nhóm bạn thân của mình đã có những giây phút vui chơi ở
                                        đây rất vui vẻ và đặc biệt có rất nhiều hình ảnh so deep sau chuyến đi. 😊
                                    </p>
                                </div>
                            </div>
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo"
                                         style="background-image: url('/resources/images/user7.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Văn Dũng Võ</h5>
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
                                                <span>10/09/2018 08:51</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Mình mua vé qua donkeyfun rất nhanh, đến ngày đi vì thời tiết không được tốt lắm
                                        nên càng ít khách không phải chờ đợi lâu, dù trời mưa không được đẹp như ngày
                                        nắng nhưng nhóm bạn mình cũng quẩy banh nóc đến chiều tối mới chịu quay về.
                                    </p>
                                </div>
                            </div>
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo"
                                         style="background-image: url('/resources/images/user8.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Hồng Triệu Nguyễn</h5>
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
                                                <span>10/09/2018 06:06</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Có rất nhiều nơi tuyệt vời ở Đà Nẵng, đúng là không lãng phí thanh xuân khi đã
                                        chọn Đà Nẵng là địa điểm du lịch hè. Đặt vé qua donkeyfun tiết kiệm được một
                                        chút ít chi phí của chuyến đi. Rất tiện ích.
                                    </p>
                                </div>
                            </div>
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo"
                                         style="background-image: url('/resources/images/user9.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Tiến Nam Vũ</h5>
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
                                                <span>09/09/2018 05:57</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Bà Nà Hills rất đẹp, ba mẹ và gia đình mình rất hài lòng với chuyến đi chơi này.
                                        Giá cả cũng rẻ và nhanh chóng hơn so với việc đợi và mua tại quầy.
                                    </p>
                                </div>
                            </div>
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo"
                                         style="background-image: url('/resources/images/user10.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Lương Trần</h5>
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
                                                <span>02/09/2018 05:15</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Bà Nà đẹp như người ta vẫn nói “đường lên tiên cảnh”, đáng với đồng tiền bỏ ra.
                                    </p>
                                </div>
                            </div>
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
                    </div>
                    <!-- End Reviews -->
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
<script type="text/javascript" src="/resources/js/custom.js"></script>
<!-- End Import Script -->
<!-- Start All Script -->
<!-- Start Owl Carousel Slide for post -->
<script>
    $(document).ready(function () {
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

    $(document).ready(function () {

        $(".tour-order12").sticky({
            topSpacing: 0,
            bottomSpacing: 450,
            zIndex: 100
        });
        <c:forEach items="${listTourDetail}" var="lTourDetail" begin="0" end="0">
        ratePageByTour(${lTourDetail.id}, 0);
        </c:forEach>


    });

</script>
<!--  -->
<!-- End All Script -->
</body>
</html>