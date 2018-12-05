<%--
  Created by IntelliJ IDEA.
  User: tgdd
  Date: 27/10/2018
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>SmartTrip - Partner Manager</title>
    <link rel="icon" href="<c:url value="/resources/images/favicon.ico"/>"/>
    <!-- plugins:css -->
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/mdi/css/materialdesignicons.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/flag-icon-css/css/flag-icon.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/perfect-scrollbar/css/perfect-scrollbar.css" />">
    <!-- endinject -->
    <!-- plugin css for this page -->
    <link rel="stylesheet"
          href="<c:url value="/resources/node_modules/jquery-bar-rating/dist/themes/fontawesome-stars.css" />">
    <link rel="stylesheet"
          href="<c:url value="/resources/node_modules/jquery-bar-rating/dist/themes/bars-1to10.css" />">
    <link rel="stylesheet"
          href="<c:url value="/resources/node_modules/jquery-bar-rating/dist/themes/bars-horizontal.css" />">
    <link rel="stylesheet"
          href="<c:url value="/resources/node_modules/jquery-bar-rating/dist/themes/bars-movie.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/jquery-bar-rating/dist/themes/bars-pill.css" />">
    <link rel="stylesheet"
          href="<c:url value="/resources/node_modules/jquery-bar-rating/dist/themes/bars-reversed.css" />">
    <link rel="stylesheet"
          href="<c:url value="/resources/node_modules/jquery-bar-rating/dist/themes/bars-square.css" />">
    <link rel="stylesheet"
          href="<c:url value="/resources/node_modules/jquery-bar-rating/dist/themes/bootstrap-stars.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/jquery-bar-rating/dist/themes/css-stars.css" />">
    <link rel="stylesheet"
          href="<c:url value="/resources/node_modules/jquery-bar-rating/dist/themes/fontawesome-stars-o.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/jquery-bar-rating/examples/css/examples.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/font-awesome/css/font-awesome.min.css" />"/>
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/dropify/dist/css/dropify.min.css" />">
    <link rel="stylesheet"
          href="<c:url value="/resources/node_modules/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css" />"/>
    <!-- End plugin css for this page -->
    <!-- inject:css -->
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />">
    <!-- endinject -->
</head>
<body>
<div class="container-scroller">
    <jsp:include page="../include/nav-bar.jsp"/>
    <div class="container-fluid page-body-wrapper">
        <div class="row row-offcanvas row-offcanvas-right">
            <jsp:include page="../include/menu.jsp"/>
            <!-- partial -->
            <div class="content-wrapper">
                <div class="row">
                    <div class="col-md-12 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Manager partners</h4>
                                <p class="card-description">
                                    Addition partner
                                </p>
                                <hr/>
                                <f:form cssClass="forms-sample" method="POST" modelAttribute="partner"
                                        action="/admin/quan-ly-doi-tac/${action}">
                                    <div class="form-group">
                                        <f:hidden path="id"/>
                                    </div>
                                        <div class="form-group">
                                            <label>User</label>
                                            <f:select disabled="${action == 'sua' ? 'true':''}" cssClass="form-control border-primary" path="userId">
                                                <c:forEach var="us" items="${user_list}">
                                                    <f:option value="${us.id}"
                                                              label="Name: ${us.name} | Phone: ${us.phone} | Email: ${us.email}"/>
                                                </c:forEach>
                                            </f:select>
                                        </div>
                                    <div class="form-group">
                                        <label>Name</label>
                                        <f:input path="name" required="true" type="text" cssClass="form-control" placeholder="Name"/>
                                        <f:errors path="name" cssStyle="color:red;display:block"></f:errors>
                                    </div>
                                    <div class="form-group">
                                        <label>Phone</label>
                                        <f:input path="phone" required="true" type="tel" cssClass="form-control" placeholder="Phone"/>
                                        <f:errors path="phone" cssStyle="color:red;display:block"></f:errors>
                                    </div>
                                    <div class="form-group">
                                        <label>Email</label>
                                        <f:input path="email" required="true" cssClass="form-control form-control-sm"
                                               type="email"/>
                                        <f:errors path="email" cssStyle="color:red;display:block"></f:errors>
                                    </div>
                                    <div class="form-group">
                                        <label>Address</label>
                                        <f:input path="address" required="true" type="text" cssClass="form-control"
                                                 placeholder="Address"/>
                                        <f:errors path="address" cssStyle="color:red;display:block"></f:errors>
                                    </div>
                                    <button type="submit" class="btn btn-success mr-2">Submit</button>
                                </f:form>
                                <a href="/admin/quan-ly-doi-tac" class="btn btn-light">
                                    Cancel
                                </a>
                            </div>
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
<%-------js-css------%>
<script src="<c:url value="/resources/node_modules/jquery/dist/jquery.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/popper.js/dist/umd/popper.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/bootstrap/dist/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/perfect-scrollbar/dist/perfect-scrollbar.min.js" />"></script>
<!-- endinject -->
<!-- Plugin js for this page-->
<script src="<c:url value="/resources/node_modules/jquery-bar-rating/dist/jquery.barrating.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/inputmask/dist/jquery.inputmask.bundle.js" />"></script>
<script src="<c:url value="/resources/node_modules/inputmask/dist/inputmask/phone-codes/phone.js" />"></script>
<script src="<c:url value="/resources/node_modules/inputmask/dist/inputmask/phone-codes/phone-be.js" />"></script>
<script src="<c:url value="/resources/node_modules/inputmask/dist/inputmask/phone-codes/phone-ru.js" />"></script>
<script src="<c:url value="/resources/node_modules/inputmask/dist/inputmask/bindings/inputmask.binding.js" />"></script>
<script src="<c:url value="/resources/node_modules/dropify/dist/js/dropify.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/dropify/dist/js/dropify.min.js"/>"></script>
<script src="<c:url value="/resources/node_modules/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/moment/min/moment.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/jquery.repeater/jquery.repeater.min.js" />"></script>
<!-- End plugin js for this page-->
<!-- inject:js -->
<script src="<c:url value="/resources/js/off-canvas.js" />"></script>
<script src="<c:url value="/resources/js/hoverable-collapse.js" />"></script>
<script src="<c:url value="/resources/js/misc.js" />"></script>
<script src="<c:url value="/resources/js/settings.js" />"></script>
<script src="../../<c:url value="/resources/js/todolist.js" />"></script>
<!-- endinject -->
<!-- Custom js for this page-->
<script src="<c:url value="/resources/js/formpickers.js" />"></script>
<%--<script src="<c:url value="/resources/js/form-addons.js" />"></script>--%>
<script src="<c:url value="/resources/js/dropify.js" />"></script>
<%--<script src="<c:url value="/resources/js/dropzone.js" />"></script>--%>
<script src="<c:url value="/resources/js/formpickers.js" />"></script>
<script src="<c:url value="/resources/js/form-repeater.js" />"></script>
<%---------------------------------------------%>
</body>
</html>
