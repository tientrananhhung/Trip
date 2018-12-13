<%--
  Created by IntelliJ IDEA.
  User: kuminhdey
  Date: 10/27/2018
  Time: 3:46 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>SmartTrip - Admin Dashboard</title>
    <link rel="icon" href="<c:url value="/resources/images/favicon.ico"/>"/>
    <!-- plugins:css -->
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/mdi/css/materialdesignicons.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/flag-icon-css/css/flag-icon.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/perfect-scrollbar/css/perfect-scrollbar.css" />">
    <!-- plugin css for this page -->
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/morris.js/morris.css" />">
    <link rel="stylesheet"
          href="<c:url value="/resources/node_modules/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css" />"/>
    <!-- endinject -->
    <!-- plugin css for this page -->
    <!-- End plugin css for this page -->
    <!-- inject:css -->
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
    <!-- endinject -->
<body>
<div class="container-scroller">
    <jsp:include page="include/nav-bar.jsp"/>
    <div class="container-fluid page-body-wrapper">
        <div class="row row-offcanvas row-offcanvas-right">
            <jsp:include page="include/menu.jsp"/>
            <div class="content-wrapper">
                <div class="row">
                    <div class="col-lg-12 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Thống kê người dùng <input type="text" id="test1" name=""
                                                                                  class="form-control col-lg-1 float-right">
                                </h4>
                                <div class="row col-lg-6">
                                    <p class="col-lg-7 grid-margin">Tổng người dùng</p>
                                    <p class="col-lg-4 grid-margin">${userstatistics.tong_User}</p>
                                </div>
                                <div class="row col-lg-6">
                                    <p class="col-lg-7 grid-margin">Tổng người dùng đã kích hoạt</p>
                                    <p class="col-lg-4 grid-margin">${userstatistics.actived}</p>
                                </div>
                                <div class="row col-lg-6">
                                    <p class="col-lg-7 grid-margin">Tổng người dùng đã ngưng sử dụng</p>
                                    <p class="col-lg-4 grid-margin">${userstatistics.deleted}</p>
                                </div>
                                <div id="morris-line-example"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-6 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Thống kê đối tác <input type="text" id="test2" name=""
                                                                               class="form-control col-lg-2 float-right"/>
                                </h4>
                                <div class="row col-lg-12">
                                    <p class="col-lg-7 grid-margin">Tổng đối tác</p>
                                    <p class="col-lg-4 grid-margin">${partnerstatistics.tong_Partner}</p>
                                </div>
                                <div class="row col-lg-12">
                                    <p class="col-lg-7 grid-margin">Tổng đối tác đã kích hoạt</p>
                                    <p class="col-lg-4 grid-margin">${partnerstatistics.actived}</p>
                                </div>
                                <div class="row col-lg-12">
                                    <p class="col-lg-7 grid-margin">Tổng đối tác đã ngưng sử dụng</p>
                                    <p class="col-lg-4 grid-margin">${partnerstatistics.deleted}</p>
                                </div>
                                <div id="morris-bar-example1"></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Thống kê ưu đãi <input type="text" id="test3" name=""
                                                                              class="form-control col-lg-2 float-right"/>
                                </h4>
                                <div class="row col-lg-12">
                                    <p class="col-lg-7 grid-margin"></p>
                                    <p class="col-lg-4 grid-margin"></p>
                                </div>
                                <div class="row col-lg-12">
                                    <p class="col-lg-7 grid-margin"></p>
                                    <p class="col-lg-4 grid-margin"></p>
                                </div>
                                <div class="row col-lg-12">
                                    <p class="col-lg-7 grid-margin">Tổng mã ưu đãi đã tạo</p>
                                    <p class="col-lg-4 grid-margin">${offerstatistics.tong_Offer}</p>
                                </div>
                                <div class="row col-lg-12">
                                    <p class="col-lg-7 grid-margin">Tổng mã ưu đãi đã sử dụng</p>
                                    <p class="col-lg-4 grid-margin">${offerstatistics.used}</p>
                                </div>
                                <div id="morris-bar-example2"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-12 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Thống kê bài viết <input type="text" id="test4" name=""
                                                                                class="form-control col-lg-2 float-right"/>
                                </h4>
                                <div class="row">
                                    <div class="row col-lg-4">
                                        <p class="col-lg-7 grid-margin">Tháng</p>
                                        <p class="col-lg-4 grid-margin post-month">11</p>
                                    </div>
                                    <div class="row col-lg-8">
                                        <p class="col-lg-4 grid-margin">Bài viết tiêu biểu</p>
                                        <p class="col-lg-8 4grid-margin post-top">11</p>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="row col-lg-4">
                                        <p class="col-lg-7 grid-margin">Tổng bài viết</p>
                                        <p class="col-lg-4 grid-margin post-count">11</p>
                                    </div>
                                    <div class="row col-lg-8">
                                        <p class="col-lg-4 grid-margin">Lượt xem</p>
                                        <p class="col-lg-8 grid-margin post-view">11</p>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="row col-lg-4">
                                        <p class="col-lg-7 grid-margin">Tổng bài viết đã xóa</p>
                                        <p class="col-lg-4 grid-margin post-delete-count">11</p>
                                    </div>
                                    <div class="row col-lg-8">
                                        <p class="col-lg-4 grid-margin">Người viết</p>
                                        <p class="col-lg-8 grid-margin post-author">11</p>
                                    </div>
                                </div>
                                <div id="morris-area-example"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="include/footer.jsp"/>
</div>
</div>
</div>
<!-- plugins:js -->
<script src="<c:url value="/resources/node_modules/jquery/dist/jquery.min.js"/>"></script>
<script src="<c:url value="/resources/node_modules/bootstrap/dist/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/node_modules/perfect-scrollbar/dist/perfect-scrollbar.min.js"/>"></script>
<!-- endinject -->
<!-- Plugin js for this page-->
<script src="<c:url value="/resources/node_modules/raphael/raphael.min.js"/>"></script>
<script src="<c:url value="/resources/node_modules/morris.js/morris.min.js"/>"></script>
<script src="<c:url value="/resources/node_modules/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js" />"></script>
<script src="<c:url value="/resources/js/morris.js"/>"></script>

<script src="<c:url value="/resources/js/off-canvas.js" />"></script>
<script src="<c:url value="/resources/js/hoverable-collapse.js" />"></script>
<script src="<c:url value="/resources/js/misc.js" />"></script>
<script src="<c:url value="/resources/js/settings.js" />"></script>
<script src="<c:url value="/resources/js/todolist.js" />"></script>
<!-- End plugin js for this page-->
<script type="text/javascript">
    jQuery(function ($) {
        $('#test1').datepicker({
            format: "yyyy",
            todayBtn: true,
            language: "vi",
            autoclose: true,
            minViewMode: 2,
            defaultDate: "2018-01-01",
            todayHighlight: true
        }).on('changeDate', function (ev) {
            $("#morris-line-example").empty();
            var year = $(this).datepicker('getDate').getFullYear();
            loadUser(year);
        }).datepicker("setDate", new Date());
        // loadUser(2018);

        $('#test4').datepicker({
            format: "mm/yyyy",
            todayBtn: true,
            language: "vi",
            autoclose: true,
            minViewMode: 1,
            todayHighlight: true
        }).on('changeDate', function (ev) {
            $("#morris-area-example").empty();
            var month = $(this).datepicker('getDate').getMonth() + 1;
            var year = $(this).datepicker('getDate').getFullYear();
            // loadCountPost(month,year);
            loadPost(year);
            var origin   = window.location.origin;
            $.ajax({
                url: origin+'/api/postcountstatistics/'+month+'/'+year+'',
                type: 'GET'
            })
                .done(function (data) {
                    $('.post-month').html(month);
                    $('.post-count').html(data.tong_Post);
                    $('.post-delete-count').html(data.deleted);
                    $('.post-top').html(data.title);
                    $('.post-view').html(data.max_View);
                    $('.post-author').html(data.users);
                });
        }).datepicker("setDate", new Date());

        $('#test2').datepicker({
            format: "mm/yyyy",
            todayBtn: true,
            language: "vi",
            autoclose: true,
            minViewMode: 1,
            todayHighlight: true
        }).on('changeDate', function (ev) {
            $("#morris-bar-example1").empty();
            var year = $(this).datepicker('getDate').getFullYear();
            var month = $(this).datepicker('getDate').getMonth();
            loadPartner(month + 1, year);
        }).datepicker("setDate", new Date());

        $('#test3').datepicker({
            format: "mm/yyyy",
            todayBtn: true,
            language: "vi",
            autoclose: true,
            minViewMode: 1,
            todayHighlight: true
        }).on('changeDate', function (ev) {
            $("#morris-bar-example2").empty();
            var year = $(this).datepicker('getDate').getFullYear();
            var month = $(this).datepicker('getDate').getMonth();
            loadOffer(month + 1, year);
        }).datepicker("setDate", new Date());

    });
</script>
</body>
</html>
