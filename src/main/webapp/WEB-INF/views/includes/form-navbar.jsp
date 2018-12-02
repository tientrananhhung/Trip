<%--
  Created by IntelliJ IDEA.
  User: T
  Date: 12/2/2018
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
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
                        <f:form action="/dang-nhap" method="post" id="loginForm" modelAttribute="login" >
                            <div class="form-group">
                                <label for="exampleInputEmail1">Tài khoản</label>
                                <f:input required="true" path="username" cssClass="form-control" aria-describedby="emailHelp"
                                         placeholder="Nhập tên đăng nhập"/>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Mật khẩu</label>
                                <f:password required="true" path="password" cssClass="form-control" placeholder="Nhập mật khẩu"/>
                            </div>
                            <div class="form-group form-check">
                                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                                <label class="form-check-label" for="exampleCheck1">Nhớ mật khẩu</label>
                            </div>
                            <button type="submit" class="btn btn-primary  btn-custom">Đăng nhập</button>
                        </f:form>
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