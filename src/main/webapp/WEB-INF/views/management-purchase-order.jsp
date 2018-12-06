<%--
  Created by IntelliJ IDEA.
  User: Tiến Trần
  Date: 12/2/2018
  Time: 4:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<jsp:useBean id="now" class="java.util.Date" />
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quản lý đơn hàng đã thanh toán - Smart Trip</title>
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
                <h3 class="c_orange cfs-22">Quản lý đơn hàng đã thanh toán</h3>
            </div>
            <div class="content-body-info mg-top-20">
                <div class="tbl-header">
                    <table cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>Tên tour</th>
                            <th>Tên dịch vụ</th>
                            <th>Ngày đặt</th>
                            <th>Ngày đi</th>
                            <th>Phương thức thanh toán</th>
                            <th>Tổng tiền</th>
                            <th>Ghi chú</th>
                            <th>Menu</th>
                        </tr>
                        </thead>
                    </table>
                </div>
                <div class="tbl-content">
                    <table cellpadding="0" cellspacing="0" border="0">
                        <tbody>
                            <c:forEach items="${listOrder}" var="order">
                                    <tr>
                                        <td>
                                         ${order.tourName}
                                        </td>
                                        <td>${order.serviceName}</td>
                                        <td>${order.orderDate}</td>
                                        <td>${order.serviceDate}</td>
                                        <td>${order.payment}</td>
                                        <td>${order.totalPriceAfter}</td>
                                        <td>${order.note}</td>
                                        <td>
                                            <c:choose>
                                                <c:when test="${now.time - order.orderDate.time < order.policy}">
                                                    <a href="/quan-ly/huy-don-hang/1/${order.orderID}"
                                                       class="btn btn-outline-danger btn-sm">Hủy</a>
                                                </c:when>
                                                <c:otherwise>
                                                    <a>Hết tg hủy</a>
                                                </c:otherwise>
                                            </c:choose>
                                        </td>
                                    </tr>
                            </c:forEach>
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

        // Hiệu ứng menu login
        navbarSubMenu();

        //Thêm active cho link hiện tại
        activeLinkNav();

    });
</script>
<!-- End custom script-->
</body>
</html>
