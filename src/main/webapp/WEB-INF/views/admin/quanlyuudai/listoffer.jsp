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
    <title>SmartTrip - Offer Manager</title>
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
                                <h4 class="card-title">Manager offers</h4>
                                <a>List offers</a>
                            </div>
                            <div class="col-md-4"></div>
                            <div class="col-md-4">
                                <a href="/admin/quan-ly-uu-dai/them"><button style="margin-left: 190px;" type="button" class="btn btn-warning btn-rounded btn-fw">Add Offer</button></a>
                            </div>
                        </div>
                        <hr/>
                        <div class="row">
                            <div class="col-12 table-responsive">
                                <table id="order-listing" class="table" cellspacing="0">
                                    <thead>
                                    <tr>
                                        <th>Offer code</th>
                                        <th>Offer deal</th>
                                        <th>Offer status</th>
                                        <th>Actions</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="offer" items="${listOffer}">
                                        <tr>
                                            <td>${offer.id}</td>
                                            <td>${offer.usersByUserId.name}</td>
                                            <td>${offer.code}</td>
                                            <td>${offer.deal}</td>
                                            <td>
                                                <c:choose>
                                                    <c:when test="${offer.used == true}">
                                                       <label class="badge badge-danger">Isused</label>
                                                    </c:when>
                                                    <c:otherwise>

                                                        <%--<a onclick="showSwal('warning-message-and-cancel')" href="/admin/quan-ly-uu-dai/active/${offer.id}/true">--%>
                                                            <%--<label class="badge badge-success">Availble</label>--%>
                                                        <%--</a>--%>
                                                        <a class="btn-del-offer" href="#" o-id="${offer.id}">
                                                            <label class="badge badge-success">Availble</label>
                                                        </a>
                                                    </c:otherwise>
                                                </c:choose>
                                            </td>
                                            <td>
                                                <c:if test="${offer.used == false}">
                                                    <a href="/admin/quan-ly-uu-dai/${offer.id}">
                                                        <button class="btn btn-outline-primary">Edit</button>
                                                    </a>
                                                </c:if>
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
<script src="<c:url value="/resources/node_modules/sweetalert/dist/sweetalert.min.js"/>"></script>
<script src="<c:url value="/resources/js/off-canvas.js"/>"></script>
<script src="<c:url value="/resources/js/hoverable-collapse.js"/>"></script>
<script src="<c:url value="/resources/js/misc.js"/>"></script>
<script src="<c:url value="/resources/js/settings.js"/>"></script>
<script src="<c:url value="/resources/js/todolist.js"/>"></script>
<!-- endinject -->
<!-- Custom js for this page-->
<script src="<c:url value="/resources/js/data-table.js"/>"></script>
<script src="<c:url value="/resources/js/alerts.js"/>"></script>
<script src="<c:url value="/resources/js/custom.js"/>"></script>
<!-- End custom js for this page-->
<script>
    var id = '';
    $('.btn-del-offer').click(function(e){
        e.preventDefault();
        showSwal('warning-message-and-cancel');
        id = $(this).attr('o-id');
        console.log(offerId);
        // xoaDiaChiKH(offerId);
    });

    $('.swal-button').click(function(id){
        $.ajax({
            url: '/admin/quan-ly-uu-dai/active/'+id+'/true',
            type: "GET"
        })
            .done(function(data) {
                swal("Thông Báo!", "Offer này đã được sử dụng", "success");
            })
            .error(function(data) {
                swal("Thông Báo!", "Server đang gặp sự cố, xin vui lòng thực hiện lại sau giây lát", "error");
            });
    });
</script>
</body>
</html>
