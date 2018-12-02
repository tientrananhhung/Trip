<%--
  Created by IntelliJ IDEA.
  User: Tiến Trần
  Date: 12/2/2018
  Time: 4:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quản lý tour - Smart Trip</title>
    <!-- Icon -->
    <link rel="icon" href="/resources/images/favicon.ico">
    <!-- Bootstrap css -->
    <link rel="stylesheet" href="/resources/css/bootstrap/bootstrap.min.css">
    <!-- Fontawesome -->
    <link rel="stylesheet" href="/resources/css/fontawesome/font-awesome.min.css">
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
                <h3 class="c_orange cfs-22">Quản lý tour du lịch</h3>
            </div>
            <div class="content-body-info mg-top-20">
                <div class="tbl-header">
                    <table cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>Tên tour</th>
                            <th>Địa chỉ</th>
                            <th>Chính sách hủy</th>
                            <th>Tên dịch vụ</th>
                            <th>Giá gốc</th>
                            <th>Giá khuyến mãi</th>
                            <th>Mặc định</th>
                        </tr>
                        </thead>
                    </table>
                </div>
                <div class="tbl-content">
                    <table cellpadding="0" cellspacing="0" border="0">
                        <tbody>
                        <tr>
                            <td>
                                <a href="#">Công viên suối khoáng nóng Núi Thần Tài</a>
                            </td>
                            <td>QL14G - Hoà Phú - Hòa Vang - Đà Nẵng</td>
                            <td>48 giờ</td>
                            <td>Vé cáp treo</td>
                            <td>681.000</td>
                            <td>700.000</td>
                            <td>
                                <button type="button" class="btn btn-outline-danger btn-sm">Xóa</button>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <a href="#">Công viên suối khoáng nóng Núi Thần Tài</a>
                            </td>
                            <td>QL14G - Hoà Phú - Hòa Vang - Đà Nẵng</td>
                            <td>48 giờ</td>
                            <td>Vé cáp treo</td>
                            <td>681.000</td>
                            <td>700.000</td>
                            <td>
                                <button type="button" class="btn btn-outline-danger btn-sm">Xóa</button>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <a href="#">Công viên suối khoáng nóng Núi Thần Tài</a>
                            </td>
                            <td>QL14G - Hoà Phú - Hòa Vang - Đà Nẵng</td>
                            <td>48 giờ</td>
                            <td>Vé cáp treo</td>
                            <td>681.000</td>
                            <td>700.000</td>
                            <td>
                                <button type="button" class="btn btn-outline-danger btn-sm">Xóa</button>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <a href="#">Công viên suối khoáng nóng Núi Thần Tài</a>
                            </td>
                            <td>QL14G - Hoà Phú - Hòa Vang - Đà Nẵng</td>
                            <td>48 giờ</td>
                            <td>Vé cáp treo</td>
                            <td>681.000</td>
                            <td>700.000</td>
                            <td>
                                <button type="button" class="btn btn-outline-danger btn-sm">Xóa</button>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </section>
</div>

<!-- End Body Order -->

<jsp:include page="includes/footer.jsp"/>

<!-- Start Import Script -->
<script type="text/javascript" src="/resources/js/jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/resources/js/popper/popper.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/js/custom.js"></script>
<!-- End Import Script -->

<!-- Start custom script-->
<script>
    $(document).ready(function () {

        navbarSubMenu();

    });
</script>
<!-- End custom script-->
</body>
</html>
