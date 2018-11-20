<%--
  Created by IntelliJ IDEA.
  User: Tien Tran
  Date: 25/09/2018
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
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

    <link rel="stylesheet" href="/resources/css/popupform/style.css">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light" style="padding: 0px;">
    <div class="container-fluid box-content-fluid">
        <a class="navbar-brand" href="#">
            <img src="/resources/images/logo.png" alt="" style="height: 65px;">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav flex-row ml-md-auto d-none d-md-flex cnav-mb">
                <a href="/" class="nav-item menu-item">
                    <li class="nav-link">Trang Chủ</li>
                </a>
                <a href="/blog/" class="nav-item menu-item">
                    <li class="nav-link">Blog Du Lịch</li>
                </a>
                <a href="#" class="nav-item menu-item">
                    <li class="nav-link">Trở thành đối tác</li>
                </a>
                <a href="" class="nav-item menu-item" data-toggle="modal" data-target="#loginFormModal">
                    <li class="nav-link">Đăng nhập</li>
                </a>
                <a href="" class="nav-item menu-item" data-toggle="modal" data-target="#signupFormModal">
                    <li class="nav-link">Đăng ký</li>
                </a>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Tìm kiếm..." aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0 btn-custom-org" type="submit">Tìm kiếm</button>
            </form>
        </div>
    </div>
</nav>
<!-- Login Form Start -->
<div class="modal fade" id="loginFormModal" tabindex="-1" role="dialog" aria-labelledby="loginForm">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <div class="loginForm">
                <div class="mdl-card mdl-shadow--2dp">
                    <div class="mdl-card__title mdl-card--expand">
                        <div class="modal--logo">
                            <img src="/resources/images/logo.png" alt="">
                        </div>
                    </div>
                    <div class="mdl-card__supporting-text">
                        <f:form action="/dang-nhap" method="post" id="loginForm" modelAttribute="login" >
                            <div class="form-group">
                                <label for="exampleInputEmail1">Tài khoản</label>
                                <f:input required="true" path="username" cssClass="form-control" aria-describedby="emailHelp"
                                         placeholder="Nhập tên đăng nhập"/>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Mật khẩu</label>
                                <f:password required="true" path="password" cssClass="form-control" placeholder="Nhập mật khẩu"/>
                            </div>
                            <div class="form-group form-check">
                                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                                <label class="form-check-label" for="exampleCheck1">Nhớ mật khẩu</label>
                            </div>
                            <button type="submit" class="btn btn-primary  btn-custom">Đăng nhập</button>
                        </f:form>
                    </div>
                    <div class="mdl-card__actions mdl-card--border clearfix">
                        <a href="#" class="pull-left mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" data-toggle="modal" data-target="#forgotFormModal" data-dismiss="modal">
                            Quên mật khẩu?
                        </a>
                        <a href="#" class="pull-right mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" data-toggle="modal" data-target="#signupFormModal" data-dismiss="modal">
                            Đăng ký
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Login Form End -->

<!-- Signup Form Start -->
<div class="modal fade" id="signupFormModal" tabindex="-1" role="dialog" aria-labelledby="signupFormModal">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <div class="signupForm">
                <div class="mdl-card mdl-shadow--2dp">
                    <div class="mdl-card__title mdl-card--expand">
                        <div class="modal--logo">
                            <img src="/resources/images/logo.png" alt="">
                        </div>
                    </div>
                    <div class="mdl-card__supporting-text">
                        <form action="#" method="post" id="signupForm">
                            <div class="form-group">
                                <label for="exampleInputEmail1">Tài khoản</label>
                                <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Mật khẩu</label>
                                <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                            </div>
                            <button type="submit" class="btn btn-primary  btn-custom">Đăng ký</button>
                        </form>
                    </div>
                    <div class="mdl-card__actions mdl-card--border clearfix">
                        <p class="pull-left">Bạn đã có tài khoản?&nbsp;<a href="#" class="pull-right mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" data-toggle="modal" data-target="#loginFormModal" data-dismiss="modal">
                            Đăng nhập
                        </a>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Signup Form End -->

<!-- Forgot Form Start -->
<div class="modal fade" id="forgotFormModal" tabindex="-1" role="dialog" aria-labelledby="signupFormModal">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <div class="forgotForm">
                <div class="mdl-card mdl-shadow--2dp">
                    <div class="mdl-card__title mdl-card--expand">
                        <div class="modal--logo">
                            <img src="/resources/images/logo.png" alt="">
                        </div>
                    </div>
                    <div class="mdl-card__supporting-text">
                        <form action="forgotuser"  method="post" id="forgotForm">
                            <div class="form-group">
                                <label for="exampleInputEmail1">Email</label>
                                <input type="text" class="form-control" id="user" name="user" aria-describedby="emailHelp" placeholder="Enter email" />
                            </div>
                            <button type="submit" class="btn btn-primary  btn-custom">Khôi phục mật khẩu</button>
                        </form>
                    </div>
                    <div class="mdl-card__actions mdl-card--border clearfix">
                        <p class="pull-left">Bạn đã có tài khoản?&nbsp;<a href="#" class="pull-right mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" data-toggle="modal" data-target="#signupFormModal" data-dismiss="modal">
                            Đăng ký
                        </a>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

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

                        <c:forEach var="lTour" items="${listTour}" varStatus="lTourCount">
                            <div class="item" data-toggle="tooltip" data-placement="top"
                                 title="${lTour.name}">
                                <div class="card">
                                    <a href="/tour/${lTour.id}">
                                        <img class="card-img-top" src="/resources/images/tour4.jpg"
                                             alt="Smart Trip - No Image">
                                        <div class="card-body">
                                            <h5 class="card-title">${lTour.name}</h5>
                                            <div class="card-description">
                                                <div class="card-place">
                                                    <i class="fa fa-map-marker" aria-hidden="true"></i> ${lTour.address}
                                                </div>
                                                <div class="card-infor">
                                                    <table class="table">
                                                        <tr class="tb-infor">
                                                            <td>
                                                                <c:choose>
                                                                    <c:when test="${lTour.type}">
                                                                        <i class="fas fa-ticket-alt"></i> còn ${lTour.tQuantity - lTour.count} vé
                                                                    </c:when>
                                                                    <c:otherwise>
                                                                        <i class="fas fa-ticket-alt"></i> ${lTour.count} lượt đặt
                                                                    </c:otherwise>
                                                                </c:choose>
                                                            </td>
                                                            <td>
                                                                <select id="star-rating${lTourCount.count}"
                                                                        class="star-rating" name="rating"
                                                                        data-current-rating="${lTour.rate}">
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
                                                                        class="card-price-sale">${lTour.sPrice}</strong>
													    		</span>
                                                                <strong class="card-price"><strike>${lTour.sNormalPrice}</strike></strong>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                    </a>
                                </div>
                            </div>
                        </c:forEach>

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
            <a href="/blog">Xem thêm »</a>
        </div>
        <div class="box-body">

            <c:forEach items="${listPost}" var="lPost" varStatus="lPostCount">
                <c:choose>
                    <c:when test="${lPostCount.count == 1}">
                        <div class="post-big">
                            <a class="city-tickets" href="#" style="background-image: url('/resources/images/${lPost.image}');">
                                <div class="ticket-relative">
                                    <div class="ticket-info">
                                        <div class="ticket-big-short">
                                            <h3>${lPost.title}</h3>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </c:when>
                    <c:otherwise>
                        <div class="post-small" style="border-bottom: 5px solid white;">
                            <a class="city-tickets" href="#" style="background-image: url('/resources/images/${lPost.image}');">
                                <div class="ticket-relative">
                                    <div class="ticket-info">
                                        <div class="ticket-small-short">
                                            <h3>${lPost.title}</h3>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </c:otherwise>
                </c:choose>
            </c:forEach>

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

                        <c:forEach items="${listFood}" var="lFood" varStatus="lFoodCount">
                            <div class="item" data-toggle="tooltip" data-placement="top"
                                 title="${lFood.name}">
                                <div class="card">
                                    <a href="#">
                                        <img class="card-img-top" src="/resources/images/${lFood.image}"
                                             alt="Card image cap">
                                        <div class="card-body">
                                            <h5 class="card-title">${lFood.name}</h5>
                                            <div class="card-description">
                                                <div class="card-place">
                                                    <div style="margin-bottom: 5px;height: 42px;overflow: hidden;">
                                                        <i class="fa fa-map-marker"
                                                           aria-hidden="true"></i> ${lFood.address} - ${lFood.district}
                                                        - Tp. Đà Nẵng
                                                    </div>
                                                    <i class="fa fa-clock-o" aria-hidden="true"></i> ${lFood.openTime}
                                                </div>
                                                <div class="card-infor">
                                                    <table class="table">
                                                        <tr class="tb-infor">
                                                            <td><i class="fa fa-cutlery" aria-hidden="true"></i>
                                                                    ${lFood.category}
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                    </a>
                                </div>
                            </div>
                        </c:forEach>


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

<script type="text/javascript">

    //Owl Carousel Slide for post
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

    // Show tooltip bài viết
    $(function () {
        $('[data-toggle="tooltip"]').tooltip()
    })

    //Rate for Tour
    $(function () {
        for (var i = 1; i < 13; ++i) {
            var currentRating = $('#star-rating' + i).data('current-rating');
            $('#star-rating' + i).barrating({
                theme: 'fontawesome-stars-o',
                readonly: true,
                initialRating: currentRating
            });
        }
    });
</script>
<script type="text/javascript" src="/resources/js/popupform/main.js"></script>
<!-- Start All Script -->
</body>
</html>
