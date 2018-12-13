<%--
  Created by IntelliJ IDEA.
  User: chuthai
  Date: 10/27/2018
  Time: 3:46 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>SmartTrip - Post Manager</title>
    <link rel="icon" href="<c:url value="/resources/images/favicon.ico"/>"/>
    <!-- plugins:css -->
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/mdi/css/materialdesignicons.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/flag-icon-css/css/flag-icon.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/perfect-scrollbar/css/perfect-scrollbar.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/datatables.net-bs4/css/dataTables.bootstrap4.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
<body>
<div class="container-scroller">
    <jsp:include page="../include/nav-bar.jsp"/>
    <div class="container-fluid page-body-wrapper">
        <div class="row row-offcanvas row-offcanvas-right">
            <jsp:include page="../include/menu.jsp"/>
            <!-- partial -->
            <div class="content-wrapper">
                <div class="card">
                    <div class="card-body">
                        <div class="row">
                            <div class="col-md-4">
                                <h4 class="card-title">Manage Order</h4>
                                <a>List Order</a>
                            </div>
                            <div class="col-md-4"></div>
                            <div class="col-md-4">
                                <a href="/admin/quan-ly-order/them" class="btn btn-warning btn-rounded btn-fw" style="margin-left: 190px;">Add Post</a>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-12">
                                <table id="order-listing" class="table" cellspacing="0">
                                    <thead>
                                    <tr>
                                        <th>Customer Name</th>
                                        <th>Customer Phone</th>
                                        <th>Service</th>
                                        <th>Order Date</th>
                                        <th>Date Pickup</th>
                                        <th>Total Price</th>
                                        <th>Note</th>
                                        <th>Payment</th>
                                        <th>Purchased</th>
                                        <th>Refund</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="order" items="${listOrder}">
                                        <tr>
                                            <th>${order.customerName}</th>
                                            <td>${order.phoneUser}</td>
                                            <td>${order.serviceName}</td>
                                            <td>
                                                <fmt:formatDate var="fmtDate" value="${order.orderDate}"
                                                                pattern="dd/MM/yyyy"/>
                                                    ${fmtDate}
                                            </td>
                                            <td>${order.serviceDate}</td>
                                            <td>${order.totalPriceAfter}</td>
                                            <td>${order.note}</td>
                                            <td>
                                                <c:choose>
                                                    <c:when test="${order.payment.equals('Chuyển khoản')}">
                                                        <label class="badge badge-primary">Bank</label>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <label class="badge badge-warning">Direct</label></a>
                                                    </c:otherwise>
                                                </c:choose>
                                            </td>
                                            <td>
                                                <c:choose>
                                                    <c:when test="${order.purchased == true}">
                                                        <label class="badge badge-success">Purchased</label>
                                                    </c:when>
                                                    <c:when test="${order.purchased == false && order.deleted == false}">
                                                        <a href="/admin/quan-ly-hoa-don/thanh-toan/${order.orderID}">
                                                            <label class="badge badge-danger">Unpaid</label></a>
                                                    </c:when>
                                                    <c:otherwise>
                                                        Unpaid
                                                    </c:otherwise>
                                                </c:choose>
                                            </td>
                                            <td>
                                                <c:choose>
                                                    <c:when test="${order.purchased == true && order.deleted == true}">
                                                        <a href="/admin/quan-ly-hoa-don/hoan-tien/${order.orderID}" class="badge badge-danger">Refund</a>
                                                    </c:when>
                                                    <c:when test="${order.purchased == false && order.deleted == true}">
                                                        Canceled
                                                    </c:when>
                                                </c:choose>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- content-wrapper ends -->
        <jsp:include page="../include/footer.jsp"/>
    </div>
</div>
</div>
<!-- plugins:js -->
<script src="<c:url value="/resources/node_modules/jquery/dist/jquery.min.js"/>"></script>
<script src="<c:url value="/resources/node_modules/popper.js/dist/umd/popper.min.js"/>"></script>
<script src="<c:url value="/resources/node_modules/bootstrap/dist/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/node_modules/perfect-scrollbar/dist/perfect-scrollbar.min.js"/>"></script>
<!-- endinject -->
<!-- Plugin js for this page-->
<script src="<c:url value="/resources/node_modules/datatables.net/js/jquery.dataTables.js"/>"></script>
<script src="<c:url value="/resources/node_modules/datatables.net-bs4/js/dataTables.bootstrap4.js"/>"></script>
<!-- End plugin js for this page-->
<!-- inject:js -->
<script src="<c:url value="/resources/js/off-canvas.js"/>"></script>
<script src="<c:url value="/resources/js/hoverable-collapse.js"/>"></script>
<script src="<c:url value="/resources/js/misc.js"/>"></script>
<script src="<c:url value="/resources/js/settings.js"/>"></script>
<script src="<c:url value="/resources/js/todolist.js"/>"></script>
<!-- endinject -->
<!-- Custom js for this page-->
<script src="<c:url value="/resources/js/data-table.js"/>"></script>
<script>
    $(document).ready(function () {
        $('body').addClass('sidebar-icon-only');
    });
</script>
<!-- End custom js for this page-->

</body>
</html>
