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
                                <h4 class="card-title">Manager users</h4>
                                <p class="card-description">
                                    Addition user
                                </p>
                                <hr/>
                                <f:form cssClass="forms-sample" method="POST" modelAttribute="user"
                                        action="/admin/quan-ly-nguoi-dung/${action}">
                                    <div class="form-group">
                                        <f:hidden path="id"/>
                                    </div>
                                    <div class="form-group">
                                        <label>Name</label>
                                        <f:input path="name" type="text" cssClass="form-control" placeholder="Name"/>
                                    </div>
                                    <div class="form-group">
                                        <label>Username</label>
                                        <f:input path="username" type="text" cssClass="form-control"
                                                 placeholder="Username"/>
                                    </div>
                                    <c:if test="${not empty action}">
                                        <div class="form-group">
                                            <label>Password</label>
                                            <f:input path="password" type="password" cssClass="form-control"
                                                     placeholder="Password"/>
                                        </div>
                                    </c:if>


                                    <div class="form-group">
                                        <label>Phone</label>
                                        <f:input path="phone" type="tel" cssClass="form-control" placeholder="Phone"/>
                                    </div>
                                    <div class="form-group">
                                        <label>Email</label>
                                        <f:input path="email" cssClass="form-control form-control-sm"
                                                 data-inputmask="'alias': 'email'"/>
                                    </div>
                                    <div class="form-group">
                                        <label>Address</label>
                                        <f:input path="address" type="text" cssClass="form-control"
                                                 placeholder="Address"/>
                                    </div>
                                    <div class="form-group">
                                        <label>Birthday</label>
                                        <div class="input-group date datepicker" id="datepicker-popup">
                                            <div class="input-group-addon input-group-prepend">
                                                <span class="mdi mdi-calendar-blank"></span>
                                            </div>
                                            <f:input path="birthday" cssClass="form-control"></f:input>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label>Gender</label>
                                        <c:forEach var="radio" items="${gender}">
                                            <div class="form-radio">
                                                <label class="form-check-label">
                                                    <f:radiobutton checked="${radio.key == user.gender ? 'checked':''}"
                                                                   path="gender" value="${radio.key}"/> ${radio.value}
                                                </label>
                                            </div>
                                        </c:forEach>
                                    </div>
                                    <div class="form-group">
                                        <label>Role</label>
                                        <div class="form-group">
                                            <f:select cssClass="form-control border-primary" path="role">
                                                <f:options items="${role}"/>
                                            </f:select>
                                        </div>
                                    </div>
                                    <button type="submit" class="btn btn-success mr-2">Submit</button>
                                    <a href="listNguoiDung.html">
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
<script src="<c:url value="/resources/node_modules/inputmask/dist/jquery.inputmask.bundle.js" />"></script>
<script src="<c:url value="/resources/node_modules/inputmask/dist/inputmask/bindings/inputmask.binding.js" />"></script>
<script src="<c:url value="/resources/node_modules/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/moment/min/moment.min.js" />"></script>
<!-- End plugin js for this page-->
<!-- inject:js -->
<script src="<c:url value="/resources/js/off-canvas.js" />"></script>
<script src="<c:url value="/resources/js/hoverable-collapse.js" />"></script>
<script src="<c:url value="/resources/js/misc.js" />"></script>
<script src="<c:url value="/resources/js/settings.js" />"></script>
<script src="<c:url value="/resources/js/todolist.js" />"></script>
<!-- endinject -->
<!-- Custom js for this page-->
<script src="<c:url value="/resources/js/select2.js" />"></script>
<script src="<c:url value="/resources/js/formpickers.js" />"></script>
<script src="<c:url value="/resources/js/x-editable.js" />"></script>
<%---------------------------------------------%>
<%--<script>--%>
<%--$(function () {--%>
<%--var formattedDate = new Date("${user.birthday}");--%>
<%--var d = formattedDate.getDate();--%>
<%--var m =  formattedDate.getMonth();--%>
<%--m += 1;  // JavaScript months are 0-11--%>
<%--var y = formattedDate.getFullYear();--%>
<%--$('#birthday').val(d + "/" + m + "/" + y);--%>
<%--});--%>
<%--</script>--%>
</body>
</html>