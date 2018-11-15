<%--
  Created by IntelliJ IDEA.
  User: kuminhdey
  Date: 10/27/2018
  Time: 4:17 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Đăng Nhập - Smart Trip</title>
    <!-- plugins:css -->
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/mdi/css/materialdesignicons.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/flag-icon-css/css/flag-icon.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/perfect-scrollbar/css/perfect-scrollbar.css" />">
    <!-- endinject -->
    <!-- plugin css for this page -->
    <!-- End plugin css for this page -->
    <!-- inject:css -->
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />">
    <!-- endinject -->
    <link rel="shortcut icon" href="<c:url value="/resources/images/favicon.png" />"/>
</head>
<body>
<div class="container-scroller">
    <div class="container-fluid page-body-wrapper">
        <div class="row">
            <div class="content-wrapper full-page-wrapper d-flex align-items-center auth login-full-bg">
                <div class="row w-100">
                    <div class="col-lg-4 mx-auto">
                        <div class="auth-form-dark text-left p-5">
                            <h2>Khôi phục mật khẩu</h2>
                            <%--<c:choose>--%>
                                <%--<c:when test="${not empty notify}">--%>
                                    <%--<h4 class="font-weight-light">${notify}</h4>--%>
                                <%--</c:when>--%>
                                <%--<c:otherwise>--%>
                                    <%--<h4 class="font-weight-light">Chào mừng bạn đến với Smart Trip</h4>--%>
                                <%--</c:otherwise>--%>
                            <%--</c:choose>--%>

                            <form cssClass="pt-5" method="POST" action="/recover">
                                <input type="hidden" value="${id}" name="id" id="id"/>
                                <div class="form-group">
                                    <label for="password">Mật Khẩu Mới</label>
                                    <input type="password" class="form-control" id="password"  name="password" placeholder="Mật Khẩu">
                                    <i class="mdi mdi-eye"></i>
                                </div>
                                <div class="form-group">
                                    <label for="password">Nhập Lại Mật Khẩu</label>
                                    <input type="password" class="form-control" placeholder="Nhập Lại Mật Khẩu">
                                    <i class="mdi mdi-eye"></i>
                                </div>
                                    <div class="mt-5">
                                        <button class="btn btn-block btn-secondary btn-lg font-weight-medium">Lấy lại mật khẩu
                                        </button>
                                    </div>
                                <div class="mt-3 text-center">
                                    <a href="/" class="auth-link text-white">Trang chủ</a>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <!-- content-wrapper ends -->
        </div>
        <!-- row ends -->
    </div>
    <!-- page-body-wrapper ends -->
</div>
<!-- container-scroller -->
<!-- plugins:js -->

<script src="<c:url value="/resources/node_modules/jquery/dist/jquery.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/popper.js/dist/umd/popper.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/bootstrap/dist/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/perfect-scrollbar/dist/perfect-scrollbar.min.js" />"></script>
<!-- endinject -->
<!-- inject:js -->
<script src="<c:url value="/resources/js/off-canvas.js" />"></script>
<script src="<c:url value="/resources/js/hoverable-collapse.js" />"></script>
<script src="<c:url value="/resources/js/misc.js" />"></script>
<script src="<c:url value="/resources/js/settings.js" />"></script>
<script src="<c:url value="/resources/js/todolist.js" />"></script>
<!-- endinject -->
</body>
</html>