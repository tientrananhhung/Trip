<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Tien Tran
  Date: 11/3/2018
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Food Detail - Smart Trip</title>
    <!-- Icon -->
    <link rel="icon" href="../resources/images/favicon.ico">
    <!-- Bootstrap css -->
    <link rel="stylesheet" href="../resources/css/bootstrap/bootstrap.min.css">
    <!-- OwlCarousel css -->
    <link rel="stylesheet" href="../resources/css/owlcarousel/owl.carousel.min.css">
    <link rel="stylesheet" href="../resources/css/owlcarousel/owl.theme.default.min.css">
    <!-- Star rating -->
    <link rel="stylesheet" href="../resources/css/starrating/fontawesome-stars-o.css">
    <!-- Fontawesome -->
    <link rel="stylesheet" href="../resources/css/fontawesome/font-awesome.min.css">
    <!-- My css -->
    <link rel="stylesheet" href="../resources/css/custom.css">
</head>
<body style="background: #eee;">

<jsp:include page="includes/navbar.jsp"/>

<!-- Start Content website -->
<div class="contain-fluid">
    <div class="box-content-fluid">
        <!-- Start Header of Food -->
        <section class="foot-head mg-top-30">
            <div class="row">
                <div class="col-lg-5">
                    <div class="foot-main-image">
                        <a href="#">
                            <img src="../resources/images/${fooddetail.placeInfoImage}" alt="" class="pic-place"
                                 style="width: 100%; height: 280px;">
                        </a>
                    </div>
                </div>
                <div class="col-lg-7">
                    <div class="main-information">
                        <div class="res-common" style="position: relative;">
                            <div class="res-common-info">
                                <nav aria-label="breadcrumb">
                                    <ol class="breadcrumb">
                                        <li class="breadcrumb-item"><a href="#">Đà Nẵng</a></li>
                                        <li class="breadcrumb-item"><a href="#">${fooddetail.districtName}</a></li>
                                        <li class="breadcrumb-item" aria-current="page">${fooddetail.placeInfoAddress}</li>
                                    </ol>
                                </nav>
                                <div class="main-info-title mg-top-20">
                                    <h2>${fooddetail.placeInfoName}</h2>
                                    <div class="food-info mg-top-20">
                                        <div class="properties">
                                            <table class="table table-bordered">
                                                <tbody>
                                                <tr>
                                                    <td class="center">
                                                        <div class="cfs-16">
                                                            <span><i class="fa fa-cutlery c_orange"
                                                                     aria-hidden="true"></i> Loại quán</span>
                                                        </div>
                                                        <div class="cfs-14 pd-top-10">${fooddetail.foodCategoryName}</div>
                                                    </td>
                                                    <td class="center">
                                                        <div class="cfs-16">
                                                            <i class="fa fa-tag c_orange" aria-hidden="true"></i> Tầm
                                                            giá
                                                        </div>
                                                        <div class="cfs-14 pd-top-10">10.000đ - 50.000đ</div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="center">
                                                        <div class="cfs-16">
                                                            <i class="fa fa-clock-o c_orange" aria-hidden="true"></i>
                                                            Giờ mở cửa
                                                        </div>
                                                        <div class="cfs-14 pd-top-10">${fooddetail.foodOpentime}</div>
                                                    </td>
                                                    <td class="center">
                                                        <div class="cfs-16">
                                                            <i class="fa fa-map-marker c_orange" aria-hidden="true"></i>
                                                            Địa chỉ
                                                        </div>
                                                        <div class="cfs-14 pd-top-10">${fooddetail.placeInfoAddress}</div>
                                                    </td>
                                                </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- End Header of Food -->
        <section class="food-body mg-top-20">
            <div class="row">
                <div class="col-lg-8">
                    <div class="list-order">
                        <div class="food-title">
                            <h3 class="food-box-heading">Thực đơn của quán</h3>
                        </div>
                        <div class="food-offers-box">
                            <c:forEach var="foodinfo" items="${fooddetail.foodInforDTOList}">
                                <div class="food-box-menu-detail">
                                    <div class="img-food-detail">
                                        <img src="../resources/images/${foodinfo.images}" alt="${foodinfo.name}">
                                    </div>
                                    <div class="name-food-detail">
                                        <h3>${foodinfo.name}</h3>
                                        <div class="package-detail-more">
                                            <button class="btn btn-detail">
                                                <i class="fa fa-angle-right" aria-hidden="true"></i> Thông tin chi tiết
                                            </button>
                                            <div class="service-detail cfs-14">
                                                    ${foodinfo.detail}
                                            </div>
                                        </div>
                                    </div>
                                    <div class="food-price">
                                        <span class="food-price-detail"> ${foodinfo.price}</span>
                                        <span class="unit">đ</span>
                                    </div>
                                </div>
                            </c:forEach>
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
                </div>
                <div class="col-lg-4">
                    <div class="info-store">
                        <div class="food-title">
                            <h3 class="food-box-heading">Bạn có biết?</h3>
                        </div>
                        <div class="food-offers-box">
                            <div class="food-store-description">
                                ${fooddetail.content}
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <section class="food-map mg-top-20">
            <div class="row">
                <div class="col-lg-12">
                    <div class="list-order">
                        <div class="food-title">
                            <h3 class="food-box-heading">Bản đồ</h3>
                        </div>
                        <div class="food-offers-box" style="text-align: center; padding-bottom: 20px">
                            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3833.953147842485!2d108.19936231534777!3d16.067920888881766!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x314218528530f167%3A0x4e8740f7f741130f!2zMTUyIEzDqiDEkOG7mSwgQ2jDrW5oIEdpw6FuLCBRLiBUaGFuaCBLaMOqLCDEkMOgIE7hurVuZyA1NTAwMDAsIFZp4buHdCBOYW0!5e0!3m2!1svi!2s!4v1540954923085"
                                    width="800" height="600" frameborder="0" style="border:0" allowfullscreen></iframe>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>
</div>
<!-- End Content website -->

<jsp:include page="includes/footer.jsp"/>

<!-- Start Import Script -->
<script type="text/javascript" src="../resources/js/jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="../resources/js/popper/popper.min.js"></script>
<script type="text/javascript" src="../resources/js/bootstrap/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="../resources/js/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="../resources/js/bootstrap/util.js"></script>
<script type="text/javascript" src="../resources/js/sticky/jquery.sticky.js"></script>
<script type="text/javascript" src="../resources/js/custom.js"></script>
<!-- End Import Script -->
<!-- Start All Script -->
<script type="text/javascript">

    //sticky for info-store
    $(document).ready(function () {
        $(".info-store").sticky({
            topSpacing: 0,
            bottomSpacing: 450,
            zIndex: 10
        });
    });

    //Hide detail
    $(function () {

        navbarSubMenu();

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
                $(this).children('.fa').removeClass('fa-angle-right').addClass('fa-angle-down');
                $('.service-detail').slideUp();
                $(this).next().slideToggle();
                $('.btn-detail').removeClass('active');
                $(this).addClass('active');
            }
        });
    });
</script>
<!-- Start All Script -->
</body>
</html>
