<%--
  Created by IntelliJ IDEA.
  User: T
  Date: 12/2/2018
  Time: 12:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thông tin - Smart Trip</title>
    <!-- Icon -->
    <link rel="icon" href="/resources/images/favicon.ico">
    <!-- Bootstrap css -->
    <link rel="stylesheet" href="/resources/css/bootstrap/bootstrap.min.css">
    <!-- Fontawesome -->
    <link rel="stylesheet" href="/resources/css/fontawesome/font-awesome.min.css">
    <!-- Date Picker -->
    <link rel="stylesheet" href="/resources/css/daterangepicker/daterangepicker.css">
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
                <h3 class="c_orange cfs-22">Tài khoản</h3>
            </div>
            <div class="content-body-info">
                <div class="info-user">
                    <img src="/resources/images/avatar.png" alt="Avatar Smart Trip" class="mr-3 mt-3 rounded-circle"
                         style="width:60px; float: left;">
                    <div class="mr-3 mt-3" style="display: inline-block;">
                        <h4 class="cfs-18">Trần Anh Hưng Tiến</h4>
                        <div>
                            <label class="file-input c_orange" for="upload-photo">Đổi ảnh đại diện</label>
                            <input id="upload-photo" type="file" required></div>
                    </div>
                </div>
                <div class="f-info-user">
                    <form action="">
                        <div class="form-row">
                            <div class="form-group col-md-3">
                                <label for="name">Họ và Tên</label>
                                <input type="text" class="form-control" id="name" placeholder="Nhập họ và tên">
                            </div>
                            <div class="form-group col-md-3">
                                <label for="phone">Phone</label>
                                <input type="tel" class="form-control" id="phone" placeholder="Nhập số điện thoại">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-3">
                                <label for="email">Email</label>
                                <input type="email" class="form-control" id="email" placeholder="Nhập địa chỉ email">
                            </div>
                            <div class="form-group col-md-3">
                                <label for="birthday">Ngày sinh</label>
                                <input class="form-control date-order" id="birthday" value=""
                                       placeholder="Nhập ngày sinh">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group form-radio col-md-3">
                                <label>Giới tính</label>

                                <input id="a" type="radio" name="gender" checked="checked" value="1">

                                <input id="b" type="radio" name="gender" value="0">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="address">Địa chỉ</label>
                                <textarea class="form-control" id="address" rows="3"
                                          placeholder="Nhập địa chỉ"></textarea>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>

</div>
<!-- End Body Order -->

<div class="modalLoading"></div>

<jsp:include page="includes/footer.jsp"/>

<!-- Start Import Script -->
<script type="text/javascript" src="/resources/js/jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/resources/js/popper/popper.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/js/daterangepicker/moment.min.js"></script>
<script type="text/javascript" src="/resources/js/daterangepicker/daterangepicker.js"></script>
<script type="text/javascript" src="/resources/js/custom.js"></script>
<!-- End Import Script -->

<!-- Start custom script-->
<script>
    $(document).ready(function () {

        navbarSubMenu();

        $('.date-order').daterangepicker({
            "autoUpdateInput": false,
            "singleDatePicker": true,
            "showDropdowns": true,
            "opens": "center",
            locale: {
                format: 'DD/MM/YYYY'
            }
        });

    });
</script>
<!-- End custom script-->

</body>
</html>
