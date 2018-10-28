<%--
  Created by IntelliJ IDEA.
  User: tgdd
  Date: 27/10/2018
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Xollo Admin</title>
    <!-- plugins:css -->
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/mdi/css/materialdesignicons.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/flag-icon-css/css/flag-icon.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/perfect-scrollbar/css/perfect-scrollbar.css" />">
    <!-- endinject -->
    <!-- plugin css for this page -->

    <link rel="stylesheet" href="<c:url value="/resources/node_modules/icheck/skins/all.css" />" />
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/select2/dist/css/select2.min.css" />" />
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/select2-bootstrap-theme/dist/select2-bootstrap.min.css" />" />
    <!-- End plugin css for this page -->
    <!-- inject:css -->
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />">
    <!-- endinject -->
    <link rel="shortcut icon" href="<c:url value="/resources/images/favicon.png" />" />
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
                                <h4 class="card-title">Manager districts</h4>
                                <p class="card-description">
                                    Addition district
                                </p>
                                <hr/>
                                <f:form cssClass="forms-sample" modelAttribute="district" method="post" action="/admin/quan-ly-quan/${action}">
                                    <div class="form-group">
                                        <f:hidden path="id"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputName1">District Name</label>
                                        <f:input path="name" type="text" cssClass="form-control" id="exampleInputName1" placeholder="Name"/>
                                    </div>
                                    <button type="submit" class="btn btn-success mr-2">Submit</button>
                                    <a href="/admin/quan-ly-quan"><button class="btn btn-light">Cancel</button></a>
                                </f:form>
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
<%-----------js-css---------------%>
<script src="<c:url value="/resources/node_modules/jquery/dist/jquery.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/popper.js/dist/umd/popper.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/bootstrap/dist/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/perfect-scrollbar/dist/perfect-scrollbar.min.js" />"></script>
<!-- endinject -->
<!-- Plugin js for this page-->
<script src="<c:url value="/resources/node_modules/icheck/icheck.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/typeahead.js/dist/typeahead.bundle.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/select2/dist/js/select2.min.js" />"></script>
<!-- End plugin js for this page-->
<!-- inject:js -->
<c:url value="/resources/js/select2.js" />
<script src="<c:url value="/resources/js/off-canvas.js" />"></script>
<script src="<c:url value="/resources/js/hoverable-collapse.js" />"></script>
<script src="<c:url value="/resources/js/misc.js" />"></script>
<script src="<c:url value="/resources/js/settings.js" />"></script>
<script src="<c:url value="/resources/js/todolist.js" />"></script>
<!-- endinject -->
<!-- Custom js for this page-->
<script src="<c:url value="/resources/js/file-upload.js" />"></script>
<script src="<c:url value="/resources/js/iCheck.js" />"></script>
<script src="<c:url value="/resources/js/typeahead.js" />"></script>
<script src="<c:url value="/resources/js/select2.js" />"></script>
<%---------------------------------------------------%>
</body>
</html>
