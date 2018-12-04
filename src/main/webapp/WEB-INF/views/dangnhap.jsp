<%--
  Created by IntelliJ IDEA.
  User: kuminhdey
  Date: 12/02/18
  Time: 11:06 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Đăng nhập - Smart Trip</title>
    <!-- Icon -->
    <link rel="icon" href="/resources/images/favicon.ico">
    <!-- Bootstrap css -->
    <link rel="stylesheet" href="/resources/css/bootstrap/bootstrap.min.css">
    <!-- Fontawesome -->
    <link rel="stylesheet" href="/resources/css/fontawesome/font-awesome.min.css">
    <!-- My css -->
    <link rel="stylesheet" href="/resources/css/custom.css">
</head>
<body class="login-page">
<jsp:include page="includes/navbar.jsp"/>
<div class="container">
    <div class="row justify-content-center">
        <div id="choose-login-order">
            <div class="card bg-light mg-top-20 card-login">
                <div class="card-header bg-light order-card-head">Đăng nhập tài khoản Smart
                    Trip
                </div>
                <div class="card-body card-body-login" style="padding: 24px;">

                    <!-- Start form login order -->
                    <div id="f-login">
                        <c:if test="${not empty notify}">
                            <p class="font-weight-light c_red">${notify}</p>
                        </c:if>
                        <%--<p class="font-weight-light c_red">Ahihi</p>--%>

                        <f:form method="POST" modelAttribute="login" action="dang-nhap">
                            <div class="form-group">
                                <label for="username">Tên đăng nhập</label>
                                    <%--<input id="username" type="type" class="form-control" name="username" value="" placeholder="Xin vui lòng điền tên đăng nhập" required autofocus>--%>
                                <f:input required="true" path="username" cssClass="form-control"
                                         placeholder="Xin vui lòng điền tên đăng nhập"
                                         autofocus="true"/>
                            </div>

                            <div class="form-group">
                                <label for="password">Mật khẩu</label>
                                    <%--<input id="password" type="password" class="form-control" name="password" placeholder="Xin vui lòng điền mật khẩu" required data-eye>--%>
                                <f:password required="true" path="password"
                                            cssClass="form-control"
                                            placeholder="Xin vui lòng điền mật khẩu"
                                            data-eye="true"/>
                            </div>

                            <div class="mg-bottom-10" style="display: flow-root;">
                                <a href="#" class="btn-register t_right">Đăng ký</a>
                                <span class="t_right">|</span>
                                <a href="#" class="btn-forgot-password t_right">
                                    Quên mật khẩu?
                                </a>
                            </div>

                            <div class="form-group no-margin">
                                <button type="submit"
                                        class="btn btn-outline-success my-2 my-sm-0 btn-order btn-custom"
                                        style="width: 100%;">
                                    <span>Đăng nhập</span>
                                </button>
                            </div>
                        </f:form>

                    </div>
                    <!-- End form login order -->

                </div>
            </div>
        </div>
        <!-- Start Login Order -->

        <!-- End Login Order -->

        <!-- Start Register Order -->
        <div id="choose-register-order" style="display: none">
            <div class="card bg-light mg-top-20 card-register">
                <div class="card-header bg-light order-card-head">
                    <!-- Start Step order -->
                    <div class="order-steps order-steps order-steps-horizontal order-steps-small order-steps-label-horizontal">
                        <div class="order-steps-item order-steps-item-process">
                            <div class="order-steps-item-icon">
                                <span class="order-steps-icon">1</span>
                            </div>
                            <div class="order-steps-item-content">
                                <div class="order-steps-item-title">Đăng ký nhanh</div>
                            </div>
                        </div>
                        <div class="order-steps-item order-steps-item-wait">
                            <div class="order-steps-item-tail"></div>
                            <div class="order-steps-item-icon">
                                <span class="order-steps-icon">2</span>
                            </div>
                            <div class="order-steps-item-content">
                                <div class="order-steps-item-title">Xác thực</div>
                            </div>
                        </div>
                    </div>
                    <!-- End Step order -->
                </div>
                <div class="card-body card-body-register" style="padding: 24px;">

                    <!-- Start form register order -->
                    <div id="f-register">
                        <f:form method="POST" modelAttribute="register" action="dang-ky">
                            <div class="form-group">
                                <label>Tên đăng nhập</label>
                                <f:input path="username" type="text" class="form-control username"  placeholder="Xin vui lòng điền tên đăng nhập" required="true" autofocus="true" />
                                <f:errors path="username" cssStyle="color:red;display:block"></f:errors>
                            </div>

                            <div class="form-group">
                                <label>Mật khẩu</label>
                                <f:input type="password" class="form-control password"
                                       path="password" placeholder="Xin vui lòng điền mật khẩu"
                                       required="true" data-eye="true" />
                                <f:errors path="password" cssStyle="color:red;display:block"></f:errors>
                            </div>

                            <div class="form-group">
                                <label>Email</label>
                                <f:input type="email" class="form-control email" path="email"
                                       placeholder="Xin vui lòng điền địa chỉ email" required="true"/>
                                <f:errors path="email" cssStyle="color:red;display:block"></f:errors>
                            </div>

                            <div class="form-group">
                                <label>Họ và Tên</label>
                                <f:input type="text" class="form-control name" path="name" placeholder="Xin vui lòng điền họ và tên" required="true"/>
                                <f:errors path="name" cssStyle="color:red;display:block"></f:errors>
                            </div>

                            <div class="form-group">
                                <label>Số điện thoại</label>
                                <f:input type="tel"  class="form-control phone" path="phone"  placeholder="Xin vui lòng điền số điện thoại"  required="true" />
                                <f:errors path="phone" cssStyle="color:red;display:block"></f:errors>
                            </div>

                            <div class="mg-bottom-10" style="display: flow-root;">
                                <a href="#" class="btn-login t_right">Đăng nhập</a>
                                <span class="t_right">|</span>
                                <a href="#" class="btn-forgot-password t_right">Quên mật
                                    khẩu?</a>
                            </div>

                            <div class="form-group no-margin">
                                <button type="submit"
                                        class="btn btn-outline-success my-2 my-sm-0 btn-order btn-custom"
                                        style="width: 100%;">
                                    <span>Đăng ký</span>
                                </button>
                                <center class="cfs-14 c_gray" style="padding: 0px 40px;">Khi tạo
                                    tài khoản Smart Trip xem như bạn đã đồng ý với điều khoản
                                    dịch vụ
                                </center>
                            </div>
                        </f:form>
                    </div>
                    <!-- End form register order -->

                </div>
            </div>
        </div>
        <!-- End Register Order -->

        <!-- Start Forgot Password Order -->
        <div id="choose-forgot-password-order" style="display: none">
            <div class="card bg-light mg-top-20 card-forgot-password">
                <div class="card-header bg-light order-card-head">
                    <!-- Start Step order -->
                    <div class="order-steps order-steps order-steps-horizontal order-steps-small order-steps-label-horizontal">
                        <div class="order-steps-item order-steps-item-process">
                            <div class="order-steps-item-icon">
                                <span class="order-steps-icon">1</span>
                            </div>
                            <div class="order-steps-item-content">
                                <div class="order-steps-item-title">Quên mật khẩu</div>
                            </div>
                        </div>
                        <div class="order-steps-item order-steps-item-wait">
                            <div class="order-steps-item-tail"></div>
                            <div class="order-steps-item-icon">
                                <span class="order-steps-icon">2</span>
                            </div>
                            <div class="order-steps-item-content">
                                <div class="order-steps-item-title">Xác thực</div>
                            </div>
                        </div>
                    </div>
                    <!-- End Step order -->
                </div>
                <div class="card-body card-body-forgot-password" style="padding: 24px;">

                    <!-- Start form Forgot Password order -->
                    <div id="f-forgot-password">
                        <f:form action="forgotuser"  method="post" id="forgotForm">
                            <div class="form-group">
                                <label>Email</label>
                                <input type="email" class="form-control email" id="user" name="user" aria-describedby="emailHelp"
                                       placeholder="Xin vui lòng điền địa chỉ email" required>
                            </div>
                            <div class="mg-bottom-10" style="display: flow-root;">
                                <a href="#" class="btn-register t_right">Đăng ký</a>
                                <span class="t_right">|</span>
                                <a href="#" class="btn-login t_right">Đăng nhập</a>
                            </div>
                            <div class="form-group no-margin">
                                <button type="submit"
                                        class="btn btn-outline-success my-2 my-sm-0 btn-order btn-custom"
                                        style="width: 100%;">
                                    <span>Quên mật khẩu</span>
                                </button>
                            </div>
                        </f:form>
                    </div>
                    <!-- End form Forgot Password order -->
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Forgot Password Order -->
</body>
<script type="text/javascript" src="/resources/js/jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/resources/js/popper/popper.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/js/custom.js"></script>
<script>
    /* Start code show password */
    $(function () {
        $("input[type='password'][data-eye]").each(function (i) {
            let $this = $(this);

            $this.wrap($("<div/>", {
                style: 'position:relative'
            }));
            $this.css({
                paddingRight: 60
            });
            $this.after($("<div/>", {
                html: 'show',
                class: 'btn btn-sm btn-custom-org',
                id: 'passeye-toggle-' + i,
                style: 'position:absolute;right:10px;top:50%;transform:translate(0,-50%);padding: 2px 7px;font-size:12px;cursor:pointer;'
            }));
            $this.after($("<input/>", {
                type: 'hidden',
                id: 'passeye-' + i
            }));
            $this.on("keyup paste", function () {
                $("#passeye-" + i).val($(this).val());
            });
            $("#passeye-toggle-" + i).on("click", function () {
                if ($this.hasClass("show")) {
                    $this.attr('type', 'password');
                    $this.removeClass("show");
                    $(this).addClass("btn-custom-org");
                    $(this).removeClass("btn-custom");
                    $('#passeye-toggle-' + i).html('show');
                } else {
                    $this.attr('type', 'text');
                    $this.val($("#passeye-" + i).val());
                    $this.addClass("show");
                    $(this).addClass("btn-custom");
                    $(this).removeClass("btn-custom-org");
                    $('#passeye-toggle-' + i).html('hide');
                }
            });
        });
    });
    /* End code show password */
    /* Start js for form */
    $('.btn-register').click(function (e) {
        resetFormInOrder();
        setTimeout(function () {
            $('#choose-register-order').css('display', '');
            $('.l-show-order').css('minHeight', '840px');
            $('#choose-register-order').animate({
                opacity: 1,
                marginLeft: 0,
                marginRight: 0
            }, 300);
        }, 300);
        e.preventDefault();
    });
    $('.btn-login').click(function (e) {
        resetFormInOrder();
        setTimeout(function () {
            $('#choose-login-order').css('display', '');
            $('.l-show-order').css('minHeight', '');
            $('#choose-login-order').animate({
                opacity: 1,
                marginLeft: 0,
                marginRight: 0
            }, 300);
        }, 300);
        e.preventDefault();
    });
    $('.btn-forgot-password').click(function (e) {
        /* Act on the event */
        resetFormInOrder();
        setTimeout(function () {
            $('#choose-forgot-password-order').css('display', '');
            $('.l-show-order').css('minHeight', '');
            $('#choose-forgot-password-order').animate({
                opacity: 1,
                marginLeft: 0,
                marginRight: 0
            }, 300);
        }, 300);
        e.preventDefault();
    });
    /* End js for form */
</script>
</html>
