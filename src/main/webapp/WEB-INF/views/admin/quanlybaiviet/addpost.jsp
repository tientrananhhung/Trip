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
    <title>Xollo Admin</title>
    <!-- plugins:css -->
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/mdi/css/materialdesignicons.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/flag-icon-css/css/flag-icon.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/perfect-scrollbar/css/perfect-scrollbar.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/simplemde/dist/simplemde.min.css" />">

    <!-- endinject -->
    <!-- plugin css for this page -->
    <link rel="stylesheet"
          href="<c:url value="/resources/node_modules/jquery-tags-input/dist/jquery.tagsinput.min.css" />">
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
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/jquery-file-upload/css/uploadfile.css" />">
    <link rel="stylesheet"
          href="<c:url value="/resources/node_modules/tempusdominus-bootstrap-4/build/css/tempusdominus-bootstrap-4.min.css" />"/>
    <link rel="stylesheet"
          href="<c:url value="/resources/node_modules/jquery-asColorPicker/dist/css/asColorPicker.min.css" />"/>
    <link rel="stylesheet"
          href="<c:url value="/resources/node_modules/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css" />"/>
    <link rel="stylesheet"
          href="<c:url value="/resources/node_modules/x-editable/dist/bootstrap3-editable/css/bootstrap-editable.css" />">
    <!-- End plugin css for this page -->
    <!-- inject:css -->
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />">
    <!-- endinject -->
    <link rel="shortcut icon" href="<c:url value="/resources/images/favicon.png" />"/>
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
                                <h4 class="card-title">Manage pos</h4>
                                <p class="card-description">
                                    Addition post
                                </p>
                                <hr/>
                                <f:form class="forms-sample" method="post" modelAttribute="posts"
                                        action="/admin/quan-ly-bai-viet/${action}">
                                    <div class="form-group">
                                        <f:hidden path="id"/>
                                    </div>
                                    <div class="form-group">
                                        <label>Post name</label>
                                        <f:input path="title" type="text" class="form-control"
                                                 placeholder="Name"/>
                                    </div>
                                    <div class="form-group">
                                        <label>Category</label>
                                            <f:select cssClass="form-control border-primary" path="postCategoryId">
                                                <c:forEach var="postct" items="${listPostCategory}">
                                                    <f:option value="${postct.id}" label="${postct.name}"/>
                                                </c:forEach>
                                            </f:select>
                                    </div>
                                    <div class="form-group">
                                        <label>Content</label>
                                        <f:textarea path="content" class="form-control"></f:textarea>
                                    </div>
                                    <button type="submit" class="btn btn-success mr-2">Submit</button>
                                    <a href="/admin/quan-ly-danh-muc-bai-viet">
                                        <button class="btn btn-light">Cancel</button>
                                    </a>
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
<%-------js-css------%>
<script src="<c:url value="/resources/node_modules/jquery/dist/jquery.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/popper.js/dist/umd/popper.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/bootstrap/dist/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/perfect-scrollbar/dist/perfect-scrollbar.min.js" />"></script>
<!-- endinject -->
<!-- Plugin js for this page-->
<script src="<c:url value="/resources/node_modules/jquery-tags-input/dist/jquery.tagsinput.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/progressbar.js/dist/progressbar.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/jquery-bar-rating/dist/jquery.barrating.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/inputmask/dist/jquery.inputmask.bundle.js" />"></script>
<script src="<c:url value="/resources/node_modules/inputmask/dist/inputmask/phone-codes/phone.js" />"></script>
<script src="<c:url value="/resources/node_modules/inputmask/dist/inputmask/phone-codes/phone-be.js" />"></script>
<script src="<c:url value="/resources/node_modules/inputmask/dist/inputmask/phone-codes/phone-ru.js" />"></script>
<script src="<c:url value="/resources/node_modules/inputmask/dist/inputmask/bindings/inputmask.binding.js" />"></script>
<script src="<c:url value="/resources/node_modules/dropify/dist/js/dropify.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/dropify/dist/js/dropify.min.js"/>"></script>
<script src="<c:url value="/resources/node_modules/jquery-file-upload/js/jquery.uploadfile.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/jquery-asColor/dist/jquery-asColor.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/jquery-asGradient/dist/jquery-asGradient.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/jquery-asColorPicker/dist/jquery-asColorPicker.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/moment/min/moment.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/x-editable/dist/bootstrap3-editable/js/bootstrap-editable.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/tempusdominus-bootstrap-4/build/js/tempusdominus-bootstrap-4.js" />"></script>
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

< <script src="<c:url value="/resources/js/editorDemo.js"/>"></script>
< <script src="<c:url value="/resources/node_modules/simplemde/dist/simplemde.min.js"/>"></script>
<%---------------------------------------------%>

<script>
    var simplemde = new SimpleMDE({ element: $("#content")[0] });
</script>
</body>
</html>
