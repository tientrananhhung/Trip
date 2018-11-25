<%--
  Created by IntelliJ IDEA.
  User: chuthai
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
    <title>SmartTrip - Tour Manager</title>
    <!-- plugins:css -->
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/mdi/css/materialdesignicons.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/flag-icon-css/css/flag-icon.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/perfect-scrollbar/css/perfect-scrollbar.css" />">
    <link rel="stylesheet"
          href="<c:url value="/resources/node_modules/datatables.net-bs4/css/dataTables.bootstrap4.css" />">
    <!-- endinject -->
    <!-- plugin css for this page -->
    <!-- End plugin css for this page -->
    <!-- inject:css -->
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
    <!-- endinject -->
    <link rel="shortcut icon" href="<c:url value="/resources/images/favicon.png"/>">
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
                                <h4 class="card-title">Manager tours</h4>
                                <a>List tours</a>
                            </div>
                            <div class="col-md-4"></div>
                            <div class="col-md-4">
                                <a href="/admin/quan-ly-tour/them">
                                    <button style="margin-left: 190px;" type="button"
                                            class="btn btn-warning btn-rounded btn-fw">Add Tour
                                    </button>
                                </a>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-12 table-responsive">
                                <table id="order-listing" class="table" cellspacing="0">
                                    <thead>
                                    <tr>
                                        <th>User</th>
                                        <th>Parner Name</th>
                                        <th>Tour name</th>
                                        <th>Tour address</th>
                                        <th>Actions</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="tour" items="${listTour}">
                                        <tr>
                                            <td>${tour.usersByUserId.name}</td>
                                            <c:forEach items="${tour.usersByUserId.partnersById}" var="row">
                                                <td>${row.name}</td>
                                            </c:forEach>
                                            <td>${tour.name}</td>
                                            <td>${tour.address}</td>
                                            <td>
                                                <c:choose>
                                                    <c:when test="${tour.getDeleted()} ">
                                                        <a href="/admin/quan-ly-tour/xoa/${tour.id}/0"> <label
                                                                class="badge badge-danger">Inactive</label></a>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <a href="/admin/quan-ly-tour/xoa/${tour.id}/1">
                                                            <label class="badge badge-success">Active</label></a>
                                                    </c:otherwise>
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
<!-- End custom js for this page-->

</body>
</html>