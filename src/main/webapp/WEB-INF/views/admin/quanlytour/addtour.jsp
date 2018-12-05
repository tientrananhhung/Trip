<%--
  Created by IntelliJ IDEA.
  User: tgdd
  Date: 27/10/2018
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>SmartTrip - Tour Manager</title>
    <link rel="icon" href="<c:url value="/resources/images/favicon.ico"/>"/>
    <!-- plugins:css -->
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/mdi/css/materialdesignicons.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/flag-icon-css/css/flag-icon.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/perfect-scrollbar/css/perfect-scrollbar.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/font-awesome/css/font-awesome.min.css" />" />
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/dropify/dist/css/dropify.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/codemirror/lib/codemirror.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/css/froala/froala_editor.pkgd.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/css/froala/froala_style.min.css"/>">
    <!-- End plugin css for this page -->
    <!-- inject:css -->
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />">

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
                                <h4 class="card-title">Manager Tour</h4>
                                <p class="card-description">
                                    Addition Tour
                                </p>
                                <hr/>
                                <f:form class="forms-sample"  method="POST" modelAttribute="tours"
                                        action="/admin/quan-ly-tour/${action}"  enctype="multipart/form-data">
                                        <f:hidden path="id"/>
                                    <div class="form-group">
                                        <label>Tour Name</label>
                                        <f:input type="text" cssClass="form-control"  path="name" placeholder="Name"/>
                                        <f:errors path="name" cssStyle="color:red;display:block"></f:errors>
                                    </div>
                                    <div class="form-group">
                                        <label>Tour Address</label>
                                        <f:input type="text" cssClass="form-control" path="address" placeholder="Address"/>
                                        <f:errors path="address" cssStyle="color:red;display:block"></f:errors>
                                    </div>
                                    <div class="form-group">
                                        <label>Image</label>
                                        <f:input accept="image/*" path="fileData"
                                                 data-default-file="/resources/images/${posts.image}" type="file"
                                                 class="dropify" multiple="multiple"></f:input>
                                    </div>
                                    <div class="form-group">
                                        <label>Tour Content</label>
                                        <f:textarea type="text" cssClass="form-control" path="content" placeholder="Content"/>
                                        <f:errors path="content" cssStyle="color:red;display:block"></f:errors>
                                    </div>
                                    <div class="form-group">
                                        <label>Tour Policy</label>
                                        <f:input type="number" cssClass="form-control" path="policy" placeholder="Policy" />
                                        <f:errors path="policy" cssStyle="color:red;display:block"></f:errors>
                                    </div>
                                    <button type="submit" class="btn btn-success mr-2">Submit</button>
                                </f:form>
                                <a href="/admin/quan-ly-tour" class="btn btn-light">
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
<script src="<c:url value="/resources/node_modules/dropify/dist/js/dropify.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/moment/min/moment.min.js" />"></script>
<script src="<c:url value="/resources/js/off-canvas.js" />"></script>
<script src="<c:url value="/resources/js/hoverable-collapse.js" />"></script>
<script src="<c:url value="/resources/js/misc.js" />"></script>
<script src="<c:url value="/resources/js/settings.js" />"></script>
<script src="../../<c:url value="/resources/js/todolist.js" />"></script>
<script src="<c:url value="/resources/js/dropify.js"/>"></script>
<%--<script src="<c:url value="/resources/node_modules/codemirror/mode/xml/xml.js"/>"></script>--%>
<script src="<c:url value="/resources/node_modules/codemirror/lib/codemirror.js"/>"></script>
<script src="<c:url value="/resources/js/froala_editor.pkgd.min.js"/>"></script>
<script> $(function () {
    $('textarea').froalaEditor()
}); </script>
</body>
</html>
