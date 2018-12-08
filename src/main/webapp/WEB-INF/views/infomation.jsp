<%--
  Created by IntelliJ IDEA.
  User: T
  Date: 12/2/2018
  Time: 12:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thông tin - Smart Trip</title>
    <!-- Icon -->
    <link rel="icon" href="/resources/images/favicon.ico">
    <!-- Bootstrap css -->
    <link rel="stylesheet" href="/resources/css/bootstrap/bootstrap.min.css">
    <!-- Fontawesome -->
    <link rel="stylesheet" href="/resources/css/fontawesome/font-awesome.min.css">
    <!-- Date Picker -->
    <link rel="stylesheet" href="/resources/css/daterangepicker/daterangepicker.css">
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
                <h3 class="c_orange cfs-22">Tài khoản</h3>
            </div>
                <div class="f-info-user">
                    <f:form action="/quan-ly/changeinfo" modelAttribute="userInfo"  enctype="multipart/form-data">
                        <div class="content-body-info">
                            <div class="info-user">
                                <f:hidden path="avatar"/>
                                <img src="/resources/images/${userInfo.avatar}"  alt="Avatar Smart Trip" class="mr-3 mt-3 rounded-circle"
                                     style="width: 60px; height: 60px; float: left;" id="output">
                                <div class="mr-3 mt-3" style="display: inline-block;">
                                    <h4 class="cfs-18">${userInfo.name}</h4>
                                    <div>
                                        <label class="file-input c_orange" for="upload-photo">Đổi ảnh đại diện</label>
                                        <f:input id="upload-photo" path="fileData" type="file" accept="image/*" onchange="loadFile(event)" />
                                    </div>
                                </div>
                            </div>
                        <f:hidden path="id" />
                        <div class="form-row">
                            <div class="form-group col-md-3">
                                <label for="name">Họ và Tên</label>
                                <f:input type="text" class="form-control" id="name" path="name" placeholder="Nhập họ và tên" />
                                <f:errors path="name" cssStyle="color:red;display:block"></f:errors>
                            </div>
                            <div class="form-group col-md-3">
                                <label for="phone">Phone</label>
                                <f:input type="tel" class="form-control" id="phone" path="phone" placeholder="Nhập số điện thoại" />
                                <f:errors path="phone" cssStyle="color:red;display:block"></f:errors>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-3">
                                <label for="email">Email</label>
                                <f:input type="email" path="email" class="form-control" id="email" placeholder="Nhập địa chỉ email" />
                                <f:errors path="email" cssStyle="color:red;display:block"></f:errors>
                            </div>
                            <div class="form-group col-md-3">
                                <label for="birthday">Ngày sinh</label>
                                <fmt:formatDate var="fmtDate" value="${userInfo.birthday}" pattern="dd/MM/yyyy"/>
                                <f:input class="form-control date-order"  id="birthday" path="birthday"
                                       placeholder="Chọn ngày sinh" value="${fmtDate}" />
                                <f:errors path="birthday" cssStyle="color:red;display:block"></f:errors>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group form-radio col-md-3">
                                <label>Giới tính</label>
                           <c:choose>
                               <c:when test="${userInfo.gender == true}">
                                   <f:radiobutton id="a"  path="gender" checked="checked" value="1" />
                                   <f:radiobutton id="b"  path="gender" value="0" />
                               </c:when>
                               <c:when test="${userInfo.gender == false}">
                                   <f:radiobutton id="a"  path="gender"  value="1" />
                                   <f:radiobutton id="b"  path="gender" value="0" checked="checked" />
                               </c:when>
                           </c:choose>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="address">Địa chỉ</label>
                                <f:textarea class="form-control" id="address" rows="3"
                                          placeholder="Nhập địa chỉ" path="address"></f:textarea>
                                <f:errors path="address" cssStyle="color:red;display:block"></f:errors>
                            </div>
                        </div>
                        <button type="submit" id="postsubmit" class="btn btn-success mr-2">Submit</button>
                    </f:form>
                </div>
            </div>
        </div>
    </section>

</div>
<!-- End Body Order -->

<div class="modalLoading"></div>

<jsp:include page="includes/footer.jsp"/>

<!-- Start Import Script -->
<script type="text/javascript" src="/resources/js/jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/resources/js/popper/popper.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/js/daterangepicker/moment.min.js"></script>
<script type="text/javascript" src="/resources/js/daterangepicker/daterangepicker.js"></script>
<script type="text/javascript" src="/resources/js/custom.js"></script>
<!-- End Import Script -->

<!-- Start custom script-->
<script>
    $(document).ready(function () {

        navbarSubMenu();

        $('.date-order').daterangepicker({
            "autoUpdateInput": false,
            "singleDatePicker": true,
            "showDropdowns": true,
            "opens": "center",
            locale: {
                format: 'DD/MM/YYYY'
            }
        });

        $('.date-order').on('apply.daterangepicker', function(ev, picker) {
            $(this).val(picker.startDate.format('DD/MM/YYYY'));
        });

    });
    var loadFile = function(event) {
        var output = document.getElementById('output');
        output.src = URL.createObjectURL(event.target.files[0]);
    };
</script>
<!-- End custom script-->

</body>
</html>
