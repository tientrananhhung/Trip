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
    <!-- plugins:css -->
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/mdi/css/materialdesignicons.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/flag-icon-css/css/flag-icon.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/perfect-scrollbar/css/perfect-scrollbar.css" />">
    <!-- plugin css for this page -->
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/morris.js/morris.css" />">
    <!-- endinject -->
    <!-- plugin css for this page -->
    <!-- End plugin css for this page -->
    <!-- inject:css -->
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
    <!-- endinject -->
    <link rel="shortcut icon" href="<c:url value="/resources/images/favicon.png"/>">
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
                                <h4 class="card-title">Thống kê người dùng</h4>
                                <div id="morris-line-example"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-6 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Thống kê người dùng tháng 12</h4>
                                <div id="morris-bar-example"></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Thống kê đối tác</h4>
                                <div id="morris-bar-example1"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-6 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Thống kê bài viết</h4>
                                <div id="morris-bar-example2"></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Thống kê Ưu Đãi</h4>
                                <div id="morris-bar-example3"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-6 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Thống kê địa điểm</h4>
                                <div id="morris-bar-example4"></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Thống kê đánh giá</h4>
                                    <div id="morris-bar-example5"></div>
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
<script src="<c:url value="/resources/js/morris.js"/>"></script>
<!-- End plugin js for this page-->
<script>


    $(function() {
        'use strict';

        if($('#morris-line-example').length) {
            $.ajax({
                url: 'http://localhost:8080/api/userstaticstic/',
                type: 'GET'
            })
                .done(function (data) {
                    Morris.Line({
                        element: 'morris-line-example',
                        lineColors: ['#63CF72', '#76C1FA','#F36368' , '#FABA66'],
                        data: data,
                        hideHover: 'auto',
                        xkey: 'thang',
                        parseTime: false,
                        ykeys: ['tong_User', 'actived','deleted'],
                        labels: ['Người dùng', 'Kích hoạt', 'Ngừng hoạt động']
                    });
                });
        };
        var $arrColors = ['#ffc107', '#f44336',  '#000000','#3498DB'];
        if($("#morris-bar-example").length){
            Morris.Bar({
                element: 'morris-bar-example',
                barColors: function (row, series, type) {
                    return $arrColors[row.x];
                },
                hideHover: 'auto',
                data: [{
                    y: 'Người dùng',
                    a: 500,
                    b: 90
                },
                    {
                        y: 'Chưa active',
                        a: 75,
                        b: 65
                    },
                    {
                        y: 'Ngừng hoạt động',
                        a: 50,
                        b: 40
                    },
                ],
                xkey: 'y',
                ykeys: ['a', 'b'],
                labels: ['Tháng 12', 'Tháng 11']
            });
        }
        if($("#morris-bar-example1").length){
            Morris.Bar({
                element: 'morris-bar-example1',
                barColors: function (row, series, type) {
                    return $arrColors[row.x];
                },
                hideHover: 'auto',
                data: [{
                    y: 'Người dùng',
                    a: 500,
                    b: 90
                },
                    {
                        y: 'Chưa active',
                        a: 75,
                        b: 65
                    },
                    {
                        y: 'Ngừng hoạt động',
                        a: 50,
                        b: 40
                    },
                ],
                xkey: 'y',
                ykeys: ['a', 'b'],
                labels: ['Tháng 12', 'Tháng 11']
            });
        }
        if($("#morris-bar-example2").length){
            Morris.Bar({
                element: 'morris-bar-example2',
                barColors: function (row, series, type) {
                    return $arrColors[row.x];
                },
                hideHover: 'auto',
                data: [{
                    y: 'Người dùng',
                    a: 500,
                    b: 90
                },
                    {
                        y: 'Chưa active',
                        a: 75,
                        b: 65
                    },
                    {
                        y: 'Ngừng hoạt động',
                        a: 50,
                        b: 40
                    },
                ],
                xkey: 'y',
                ykeys: ['a', 'b'],
                labels: ['Tháng 12', 'Tháng 11']
            });
        }
        if($("#morris-bar-example3").length){
            Morris.Bar({
                element: 'morris-bar-example3',
                barColors: function (row, series, type) {
                    return $arrColors[row.x];
                },
                hideHover: 'auto',
                data: [{
                    y: 'Người dùng',
                    a: 500,
                    b: 90
                },
                    {
                        y: 'Chưa active',
                        a: 75,
                        b: 65
                    },
                    {
                        y: 'Ngừng hoạt động',
                        a: 50,
                        b: 40
                    },
                ],
                xkey: 'y',
                ykeys: ['a', 'b'],
                labels: ['Tháng 12', 'Tháng 11']
            });
        }
        if($("#morris-bar-example4").length){
            Morris.Bar({
                element: 'morris-bar-example4',
                barColors: function (row, series, type) {
                    return $arrColors[row.x];
                },
                hideHover: 'auto',
                data: [{
                    y: 'Người dùng',
                    a: 500,
                    b: 90
                },
                    {
                        y: 'Chưa active',
                        a: 75,
                        b: 65
                    },
                    {
                        y: 'Ngừng hoạt động',
                        a: 50,
                        b: 40
                    },
                ],
                xkey: 'y',
                ykeys: ['a', 'b'],
                labels: ['Tháng 12', 'Tháng 11']
            });
        }
        if($("#morris-bar-example5").length){
            Morris.Bar({
                element: 'morris-bar-example5',
                barColors: function (row, series, type) {
                    return $arrColors[row.x];
                },
                hideHover: 'auto',
                data: [{
                    y: 'Người dùng',
                    a: 500,
                    b: 90
                },
                    {
                        y: 'Chưa active',
                        a: 75,
                        b: 65
                    },
                    {
                        y: 'Ngừng hoạt động',
                        a: 50,
                        b: 40
                    },
                ],
                xkey: 'y',
                ykeys: ['a', 'b'],
                labels: ['Tháng 12', 'Tháng 11']
            });
        }

    });

</script>
</body>
</html>
