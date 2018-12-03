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
    <title>Khôi phục tài khoản - Smart Trip</title>
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
                <div class="card-header bg-light order-card-head">Khôi phục tài khoản Smart
                    Trip
                </div>
                <div class="card-body card-body-login" style="padding: 24px;">

                    <!-- Start form Recover Password order -->
                    <div id="f-recover-password">
                        <form method="POST" action="/recover">
                            <input type="hidden" value="${id}" name="id" id="id"/>
                            <div class="form-group">
                                <label>Mật khẩu mới</label>
                                <input type="password" id="password"  name="password" class="form-control password"
                                        placeholder="Xin vui lòng điền mật khẩu"
                                       required data-eye>
                            </div>
                            <div class="form-group">
                                <label>Nhập lại mật khẩu</label>
                                <input type="password" class="form-control password"
                                       placeholder="Nhập lại mật khẩu"
                                       required data-eye>
                            </div>
                            <div class="mg-bottom-10" style="display: flow-root;">
                                <a href="/dangnhap" class="btn-register t_right">Đăng ký</a>
                                <span class="t_right">|</span>
                                <a href="/dangky" class="btn-login t_right">Đăng nhập</a>
                            </div>
                            <div class="form-group no-margin">
                                <button type="submit"
                                        class="btn btn-outline-success my-2 my-sm-0 btn-order btn-custom"
                                        style="width: 100%;">
                                    <span>Khôi phục tài khoản</span>
                                </button>
                            </div>
                        </form>
                    </div>
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
</script>
</html>
