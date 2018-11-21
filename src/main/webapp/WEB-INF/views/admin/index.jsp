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
    <link rel="stylesheet"
          href="<c:url value="/resources/node_modules/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css" />"/>
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
                                <h4 class="card-title">Thống kê người dùng <input type="text" id="test1" name="" class="form-control col-lg-1 float-right"></h4>
                                <div id="morris-line-example"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-6 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Thống kê đối tác <input type="text" id="test2" name="" class="form-control col-lg-2 float-right" /></h4>
                                <div id="morris-bar-example1"></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Thống kê ưu đãi<input type="text" id="test3" name="" class="form-control" /></h4>
                                <div id="morris-bar-example2"></div>
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
        jQuery(function($) {
        $('#test1').datepicker({
            format: "yyyy",
            todayBtn: true,
            language: "vi",
            autoclose: true,
            minViewMode: 2,
            defaultDate: "2018-01-01",
            todayHighlight: true
        }).on('changeDate', function(ev){
            $("#morris-line-example").empty();
            var year = $(this).datepicker('getDate').getFullYear();
            loadUser(year);
        }).datepicker("setDate", new Date());
            // loadUser(2018);


            $('#test2').datepicker({
                format: "mm/yyyy",
                todayBtn: true,
                language: "vi",
                autoclose: true,
                minViewMode: 1,
                todayHighlight: true
            }).on('changeDate', function(ev){
                $("#morris-bar-example1").empty();
                var year = $(this).datepicker('getDate').getFullYear();
                var month = $(this).datepicker('getDate').getMonth();
                console.log(month+1);
                loadPartner(month+1,year);
            }).datepicker("setDate", new Date());
            // loadUser(2018);
    loadOffer();
        });
</script>
</body>
</html>
