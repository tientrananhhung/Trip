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
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thêm bài viết - Smart Trip</title>
    <!-- Icon -->
    <link rel="icon" href="/resources/images/favicon.ico">
    <!-- Bootstrap css -->
    <link rel="stylesheet" href="/resources/css/bootstrap/bootstrap.min.css">
    <!-- Fontawesome -->
    <link rel="stylesheet" href="/resources/css/fontawesome/font-awesome.min.css">

    <link rel="stylesheet" href="<c:url value="/resources/node_modules/codemirror/lib/codemirror.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/css/froala/froala_editor.pkgd.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/css/froala/froala_style.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/dropify/dist/css/dropify.min.css" />">
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
                <h3 class="c_orange cfs-22">Thêm bài viết</h3>
            </div>
            <div class="content-body-info mg-top-20">
                <div class="">
                    <f:form class="forms-sample" modelAttribute="posts"
                            action="/quan-ly/bai-viet/${action}" method="POST"
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
                            <div class="form-group">
                                <label>Image</label>
                                <f:input accept="image/*" path="fileData"
                                         data-default-file="/resources/images/${posts.image}" type="file"
                                         class="dropify"></f:input>
                            </div>
                        <div class="form-group">
                            <label>Content</label>
                            <f:textarea path="content" class="form-control"></f:textarea>
                            <f:errors path="content" cssStyle="color:red;display:block"></f:errors>
                        </div>
                        <div class="form-group">
                            <label>Mô tả ngắn</label>
                            <f:input path="description" type="text" class="form-control"
                                     placeholder="Miêu tả" required="true"/>
                            <f:errors path="title" cssStyle="color:red;display:block"></f:errors>
                        </div>
                        <button type="submit" id="postsubmit" class="btn btn-success mr-2">Submit</button>
                        <a style=" color: #fff; " class="btn btn-success"
                                onclick="OpenPopupCenter(800, 600);"><i class="mdi mdi-cloud-download"></i>Upload
                            Ảnh
                        </a>
                        <a href="/quan-ly/bai-viet" class="btn btn-light">
                            Cancel
                        </a>
                    </f:form>

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
<script src="<c:url value="/resources/node_modules/dropify/dist/js/dropify.min.js" />"></script>
<script src="<c:url value="/resources/js/dropify.js"/>"></script>
<script type="text/javascript" src="/resources/js/custom.js"></script>
<!-- End Import Script -->
<script src="<c:url value="/resources/node_modules/codemirror/mode/xml/xml.js"/>"></script>
<script src="<c:url value="/resources/node_modules/codemirror/lib/codemirror.js"/>"></script>
<script src="<c:url value="/resources/js/froala_editor.pkgd.min.js"/>"></script>
<script> $(function () {
    $('textarea').froalaEditor()
}); </script>
<script language="javascript" type="text/javascript">
    function OpenPopupCenter(w, h) {
        var origin   = window.location.origin;
        var left = (screen.width - w) / 2;
        var top = (screen.height - h) / 4;  // for 25% - devide by 4  |  for 33% - devide by 3
        var targetWin = window.open(origin+'/upload', 'upload', 'toolbar=yes, location=no, directories=no, status=no, menubar=no, scrollbars=no, resizable=no, copyhistory=no, width=' + w + ', height=' + h + ', top=' + top + ', left=' + left);
    }

</script>
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
