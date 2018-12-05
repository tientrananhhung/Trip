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
    <title>SmartTrip - Post Manager</title>
    <link rel="icon" href="<c:url value="/resources/images/favicon.ico"/>"/>
    <!-- plugins:css -->
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/mdi/css/materialdesignicons.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/flag-icon-css/css/flag-icon.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/perfect-scrollbar/css/perfect-scrollbar.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/datatables.net-bs4/css/dataTables.bootstrap4.css" />">
    <!-- endinject -->
    <!-- plugin css for this page -->
    <!-- End plugin css for this page -->
    <!-- inject:css -->
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
    <!-- endinject -->
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
                                <h4 class="card-title">Manage post</h4>
                                <a>List post</a>
                            </div>
                            <div class="col-md-4"></div>
                            <div class="col-md-4">
                                <a href="/admin/quan-ly-bai-viet/them"><button style="margin-left: 190px;" type="button" class="btn btn-warning btn-rounded btn-fw">Add Post</button></a>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-12">
                                <table id="order-listing" class="table" cellspacing="0">
                                    <thead>
                                    <tr>
                                        <th>Post Image</th>
                                        <th>Post Title</th>
                                        <th>Author</th>
                                        <th>Category</th>
                                        <th>Actions</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="post" items="${listPost}">
                                        <tr>
                                            <th><img src="../../../../resources/images/${post.image}"></th>
                                            <th>${post.title}</th>
                                            <td>${post.usersByUserId.name}</td>
                                            <td>${post.postCategorysByPostCategoryId.name}</td>
                                            <td>
                                                <a href="/admin/quan-ly-bai-viet/${post.id}">
                                                    <button class="btn btn-outline-primary">Edit</button>
                                                </a>
                                                <a href="/admin/quan-ly-bai-viet/xoa/${post.id}">
                                                    <button class="btn btn-outline-danger">Delete</button>
                                                </a>
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
<c:url value="/resources/js/todolist.js"/>
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
