<%--
  Created by IntelliJ IDEA.
  User: Tien Tran
  Date: 11/2/2018
  Time: 7:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!-- Start Navbar Menu -->
<nav class="navbar navbar-expand-lg navbar-light bg-light" style="padding: 0px;">
    <div class="container-fluid box-content-fluid">
        <a class="navbar-brand" href="#">
            <img src="/resources/images/logo.png" alt="" style="height: 65px;">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav flex-row ml-md-auto d-none d-md-flex cnav-mb">
                <a href="/" class="nav-item menu-item">
                    <li class="nav-link">Trang Chủ</li>
                </a>
                <a href="/blog/" class="nav-item menu-item">
                    <li class="nav-link">Blog Du Lịch</li>
                </a>
                <a href="#" class="nav-item menu-item">
                    <li class="nav-link">Trở thành đối tác</li>
                </a>
                <a href="" class="nav-item menu-item" data-toggle="modal" data-target="#loginFormModal">
                    <li class="nav-link">Đăng nhập</li>
                </a>
                <a href="" class="nav-item menu-item" data-toggle="modal" data-target="#signupFormModal">
                    <li class="nav-link">Đăng ký</li>
                </a>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Tìm kiếm..." aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0 btn-custom-org" type="submit">Tìm kiếm</button>
            </form>
        </div>
    </div>
</nav>
<!-- Login Form Start -->
<div class="modal fade" id="loginFormModal" tabindex="-1" role="dialog" aria-labelledby="loginForm">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <div class="loginForm">
                <div class="mdl-card mdl-shadow--2dp">
                    <div class="mdl-card__title mdl-card--expand">
                        <div class="modal--logo">
                            <img src="/resources/images/logo.png" alt="">
                        </div>
                    </div>
                    <div class="mdl-card__supporting-text">
                        <%--<f:form action="/dang-nhap" method="post" id="loginForm" modelAttribute="login" >--%>
                            <%--<div class="form-group">--%>
                                <%--<label for="exampleInputEmail1">Tài khoản</label>--%>
                                <%--<input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">--%>
                            <%--</div>--%>
                            <%--<div class="form-group">--%>
                                <%--<label for="exampleInputPassword1">Mật khẩu</label>--%>
                                <%--<input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">--%>
                            <%--</div>--%>
                            <%--<div class="form-group form-check">--%>
                                <%--<input type="checkbox" class="form-check-input" id="exampleCheck1">--%>
                                <%--<label class="form-check-label" for="exampleCheck1">Nhớ mật khẩu</label>--%>
                            <%--</div>--%>
                            <%--<button type="submit" class="btn btn-primary  btn-custom">Đăng nhập</button>--%>
                        <%--</f:form>--%>
                    </div>
                    <div class="mdl-card__actions mdl-card--border clearfix">
                        <a href="#" class="pull-left mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" data-toggle="modal" data-target="#forgotFormModal" data-dismiss="modal">
                            Quên mật khẩu?
                        </a>
                        <a href="#" class="pull-right mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" data-toggle="modal" data-target="#signupFormModal" data-dismiss="modal">
                            Đăng ký
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Login Form End -->

<!-- Signup Form Start -->
<div class="modal fade" id="signupFormModal" tabindex="-1" role="dialog" aria-labelledby="signupFormModal">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <div class="signupForm">
                <div class="mdl-card mdl-shadow--2dp">
                    <div class="mdl-card__title mdl-card--expand">
                        <div class="modal--logo">
                            <img src="/resources/images/logo.png" alt="">
                        </div>
                    </div>
                    <div class="mdl-card__supporting-text">
                        <form action="#" method="post" id="signupForm">
                            <div class="form-group">
                                <label for="exampleInputEmail1">Tài khoản</label>
                                <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Mật khẩu</label>
                                <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                            </div>
                            <button type="submit" class="btn btn-primary  btn-custom">Đăng ký</button>
                        </form>
                    </div>
                    <div class="mdl-card__actions mdl-card--border clearfix">
                        <p class="pull-left">Bạn đã có tài khoản?&nbsp;<a href="#" class="pull-right mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" data-toggle="modal" data-target="#loginFormModal" data-dismiss="modal">
                            Đăng nhập
                        </a>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Signup Form End -->

<!-- Forgot Form Start -->
<div class="modal fade" id="forgotFormModal" tabindex="-1" role="dialog" aria-labelledby="signupFormModal">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <div class="forgotForm">
                <div class="mdl-card mdl-shadow--2dp">
                    <div class="mdl-card__title mdl-card--expand">
                        <div class="modal--logo">
                            <img src="/resources/images/logo.png" alt="">
                        </div>
                    </div>
                    <div class="mdl-card__supporting-text">
                        <form action="forgotuser"  method="post" id="forgotForm">
                            <div class="form-group">
                                <label for="exampleInputEmail1">Email</label>
                                <input type="text" class="form-control" id="user" name="user" aria-describedby="emailHelp" placeholder="Enter email" />
                            </div>
                            <button type="submit" class="btn btn-primary  btn-custom">Khôi phục mật khẩu</button>
                        </form>
                    </div>
                    <div class="mdl-card__actions mdl-card--border clearfix">
                        <p class="pull-left">Bạn đã có tài khoản?&nbsp;<a href="#" class="pull-right mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" data-toggle="modal" data-target="#signupFormModal" data-dismiss="modal">
                            Đăng ký
                        </a>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Forgot Form End -->
<!-- End Navbar Menu -->