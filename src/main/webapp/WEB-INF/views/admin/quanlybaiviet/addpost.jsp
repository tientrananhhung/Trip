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
    <title>SmartTrip - Post Manager</title>
    <link rel="icon" href="<c:url value="/resources/images/favicon.ico"/>"/>
    <!-- plugins:css -->
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/mdi/css/materialdesignicons.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/flag-icon-css/css/flag-icon.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/perfect-scrollbar/css/perfect-scrollbar.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/codemirror/lib/codemirror.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/css/froala/froala_editor.pkgd.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/css/froala/froala_style.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/font-awesome/css/font-awesome.min.css" />"/>
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/dropify/dist/css/dropify.min.css" />">
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
                                <h4 class="card-title">Manager Post</h4>
                                <p class="card-description">
                                    Addition post
                                </p>
                                <hr/>
                                <f:form class="forms-sample" modelAttribute="posts"
                                        action="/admin/quan-ly-bai-viet/${action}" method="POST"
                                        enctype="multipart/form-data">
                                    <div class="form-group">
                                        <f:hidden path="id"/>
                                    </div>
                                    <div class="form-group">
                                        <label>Post name</label>
                                        <f:input path="title" type="text" class="form-control"
                                                 placeholder="Name" required="true"/>
                                        <f:errors path="title" cssStyle="color:red;display:block"></f:errors>
                                    </div>
                                    <div class="form-group">
                                        <label>Category</label>
                                        <f:select cssClass="form-control border-primary" path="postCategoryId">
                                            <c:forEach var="postct" items="${listPostCategory}">
                                                <f:option value="${postct.id}" label="${postct.name}"/>
                                            </c:forEach>
                                        </f:select>
                                        <f:errors path="postCategoryId" cssStyle="color:red;display:block"></f:errors>
                                    </div>
                                    <c:if test="${action == 'sua'}">
                                        <div class="form-group">
                                            <label>Image</label>
                                            <f:input accept="image/*" path="fileData"
                                                     data-default-file="/resources/images/${posts.image}" type="file"
                                                     class="dropify"></f:input>
                                        </div>
                                    </c:if>
                                    <div class="form-group">
                                        <label>Content</label>
                                        <f:textarea path="content" class="form-control"></f:textarea>
                                        <f:errors path="content" cssStyle="color:red;display:block"></f:errors>
                                    </div>
                                    <button type="submit" id="postsubmit" class="btn btn-success mr-2">Submit</button>
                                    <button id="postsubmit" class="btn btn-success"
                                            onclick="OpenPopupCenter(800, 600);"><i class="mdi mdi-cloud-download"></i>Upload
                                        Ảnh
                                    </button>
                                </f:form>
                                <a href="/admin/quan-ly-bai-viet" class="btn btn-light">
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
<script src="<c:url value="/resources/node_modules/dropify/dist/js/dropify.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/moment/min/moment.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/jquery.repeater/jquery.repeater.min.js" />"></script>
<!-- End plugin js for this page-->
<!-- inject:js -->
<script src="<c:url value="/resources/js/off-canvas.js" />"></script>
<script src="<c:url value="/resources/js/hoverable-collapse.js" />"></script>
<script src="<c:url value="/resources/js/misc.js" />"></script>
<script src="<c:url value="/resources/js/settings.js" />"></script>
<script src="<c:url value="/resources/js/todolist.js" />"></script>
<!-- endinject -->
<!-- Custom js for this page-->
<script src="<c:url value="/resources/js/dropify.js"/>"></script>
<script src="<c:url value="/resources/js/editorDemo.js"/>"></script>
<script src="<c:url value="/resources/node_modules/codemirror/mode/xml/xml.js"/>"></script>
<script src="<c:url value="/resources/node_modules/codemirror/lib/codemirror.js"/>"></script>
<script src="<c:url value="/resources/js/froala_editor.pkgd.min.js"/>"></script>
<script> $(function () {
    $('textarea').froalaEditor()
}); </script>
<script language="javascript" type="text/javascript">
    function OpenPopupCenter(w, h) {
        var left = (screen.width - w) / 2;
        var top = (screen.height - h) / 4;  // for 25% - devide by 4  |  for 33% - devide by 3
        var targetWin = window.open('http://localhost:8080/upload', 'upload', 'toolbar=yes, location=no, directories=no, status=no, menubar=no, scrollbars=no, resizable=no, copyhistory=no, width=' + w + ', height=' + h + ', top=' + top + ', left=' + left);
    }

</script>
</body>
</html>
