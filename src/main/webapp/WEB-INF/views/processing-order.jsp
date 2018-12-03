<%--
  Created by IntelliJ IDEA.
  User: T
  Date: 11/24/2018
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Order - Smart Trip</title>
    <!-- Icon -->
    <link rel="icon" href="/resources/images/favicon.ico">
    <!-- Bootstrap css -->
    <link rel="stylesheet" href="/resources/css/bootstrap/bootstrap.min.css">
    <!-- Fontawesome -->
    <link rel="stylesheet" href="/resources/css/fontawesome/font-awesome.min.css">
    <!-- My css -->
    <link rel="stylesheet" href="/resources/css/custom.css">
</head>
<body>

<jsp:include page="includes/navbar.jsp"/>

<!-- Start Body Order -->
<div id="body-order" style="background: rgb(236, 236, 236);">

    <div class="box-content-fluid" style="max-width: 1150px;">
        <section class="box-order">
            <div class="row mg-0">

                <!-- Start Choose info order -->
                <c:choose>
                <c:when test="${empty sessionScope.userInfo}">
                <div class="col-lg-8 col-md-8 col-sm-8 col-xs-12 l-show-order s-order">
                    </c:when>
                    <c:otherwise>
                    <div class="col-lg-8 col-md-8 col-sm-8 col-xs-12 l-show-order">
                        </c:otherwise>
                        </c:choose>

                        <!-- Start Step order -->
                        <div class="order-steps order-steps order-steps-horizontal order-steps-small order-steps-label-horizontal pd-top-40"
                             style="padding-bottom: 20px;">
                            <div class="order-steps-item order-steps-item-process">
                                <div class="order-steps-item-icon">
                                    <span class="order-steps-icon">1</span>
                                </div>
                                <div class="order-steps-item-content">
                                    <div class="order-steps-item-title">Xác nhận thông tin.</div>
                                </div>
                            </div>
                            <div class="order-steps-item order-steps-item-wait">
                                <div class="order-steps-item-tail"></div>
                                <div class="order-steps-item-icon">
                                    <span class="order-steps-icon">2</span>
                                </div>
                                <div class="order-steps-item-content">
                                    <div class="order-steps-item-title">Thanh toán</div>
                                </div>
                            </div>
                            <div class="order-steps-item order-steps-item-wait">
                                <div class="order-steps-item-tail"></div>
                                <div class="order-steps-item-icon">
                                    <span class="order-steps-icon">3</span>
                                </div>
                                <div class="order-steps-item-content">
                                    <div class="order-steps-item-title">Hoàn thành</div>
                                </div>
                            </div>
                        </div>
                        <!-- End Step order -->

                        <c:choose>
                            <c:when test="${not empty sessionScope.userInfo}">
                                <!-- Start Choose Info -->
                                <div id="choose-info-order">

                                    <!-- Start payment form -->
                                    <div id="payment-form">

                                        <!-- Start Information user -->
                                        <div class="card bg-light">
                                            <div class="card-header bg-light order-card-head">Thông tin người đặt</div>
                                            <div class="card-body" style="padding: 24px;">
                                                <div class="row">
                                                    <div class="col-lg-5">
                                                        <label class="cfs-14 name-user"><span class="asterisk">*</span>Họ
                                                            và Tên:</label>
                                                        <p class="name-user"
                                                           id="name-user">${sessionScope.userInfo.name}</p>
                                                        <label class="cfs-14 email-user"><span class="asterisk">*</span>Email:</label>
                                                        <p class="email-user"
                                                           id="email-user">${sessionScope.userInfo.email}</p>
                                                        <label class="cfs-14 address-user"><span
                                                                class="asterisk">*</span>Địa chỉ:</label>
                                                        <p class="address-user"
                                                           id="address-user">${sessionScope.userInfo.address}</p>
                                                        <label class="cfs-14 phone-user"><span class="asterisk">*</span>Số
                                                            điện thoại: <a href="#">Thay đổi</a></label>
                                                        <input type="text" class="phone-user form-control"
                                                               id="phone-user"
                                                               placeholder="${sessionScope.userInfo.phone}"
                                                               value="${sessionScope.userInfo.phone}" disabled="">
                                                    </div>
                                                    <div class="col-lg-7">
                                                        <label class="cfs-14">Ghi chú:</label>
                                                        <textarea id="note" class="form-control"
                                                                  placeholder="Nhập những gì bạn muốn vào đây."
                                                                  rows="10"></textarea>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- End Information user -->

                                        <!-- Start offer -->
                                        <c:choose>
                                            <c:when test="${empty offer}">
                                                <div class="card bg-light mg-top-20 card-voucher">
                                                    <div class="card-header bg-light order-card-head">Sử dụng voucher
                                                    </div>
                                                    <div class="card-body card-body-voucher" style="padding: 24px;">

                                                        <div class="dropdown">
                                                            <div class="select">
                                                                <span>Bạn không có voucher nào</span>
                                                                <i class="fa fa-chevron-left"></i>
                                                            </div>
                                                        </div>

                                                    </div>
                                                </div>
                                            </c:when>
                                            <c:otherwise>
                                                <div class="card bg-light mg-top-20 card-voucher">
                                                    <div class="card-header bg-light order-card-head">Sử dụng voucher
                                                    </div>
                                                    <div class="card-body card-body-voucher"
                                                         style="padding: 24px; height: 240px;">

                                                        <div class="dropdown">
                                                            <div class="select">
                                                                <span>Áp dụng voucher</span>
                                                                <i class="fa fa-chevron-left"></i>
                                                            </div>
                                                            <input type="hidden" name="voucher">
                                                            <input class="order-val" type="hidden" code="0" price="0"
                                                                   v-id="0">
                                                            <ul class="dropdown-menu">
                                                                <li id="dontuse" price="0" v-id="0">Áp dụng voucher</li>
                                                                <c:forEach items="${offer}" var="offer">
                                                                    <li id="${offer.code}" price="${offer.deal}"
                                                                        v-id="${offer.id}">Mã: ${offer.code} -
                                                                        Giảm ${offer.deal} đ
                                                                    </li>
                                                                </c:forEach>
                                                            </ul>
                                                        </div>

                                                    </div>
                                                </div>
                                            </c:otherwise>
                                        </c:choose>
                                        <!-- End offer -->

                                    </div>
                                    <!-- End payment form -->

                                </div>
                                <!-- End Choose Info -->

                                <!-- Start choose payment-->
                                <div id="choose-payment-order" style="display: none;">
                                    <div class="card bg-light mg-top-20 card-payment">
                                        <div class="card-header bg-light order-card-head">Hình thức thanh toán</div>
                                        <div class="card-body card-body-payment" style="padding: 24px;">
                                            <section class="s-payment">
                                                <div>
                                                    <input type="radio" id="payment-transfer" class="payment"
                                                           name="payment" value="1">
                                                    <label for="payment-transfer" class="l-payment">
                                                        <h2 class="cfs-20 mg-top-20 fw-bolder">Chuyển khoản</h2>
                                                        <p class="cfs-14">
                                                            Chuyển khoản ngân hàng với nội dung: username &lt;khoảng
                                                            trắng&gt; thanh toán
                                                        </p>
                                                    </label>
                                                </div>
                                                <div>
                                                    <input type="radio" id="direct-payment" class="payment"
                                                           name="payment" value="2" checked>
                                                    <label for="direct-payment" class="l-payment" checked>
                                                        <h2 class="cfs-20 mg-top-20 fw-bolder">Thanh toán trực tiếp</h2>
                                                        <p class="cfs-14">Bạn có thể đến trực tiếp quầy giao dịch của
                                                            Smart Trip để nhận vé</p>
                                                    </label>
                                                </div>
                                                <div>
                                                    <input type="radio" id="payment-counter" class="payment"
                                                           name="payment" value="3">
                                                    <label for="payment-counter" class="l-payment">
                                                        <h2 class="cfs-20 mg-top-20 fw-bolder">Thanh toán tại quầy</h2>
                                                        <p class="cfs-14">Bạn có thể đến trực tiếp điểm du lịch để nhận
                                                            vé</p>
                                                    </label>
                                                </div>
                                            </section>
                                        </div>
                                    </div>
                                </div>
                                <!-- End choose payment-->

                                <!-- Start order complete-->
                                <div id="choose-complete-order" style="display: none;">
                                    <div class="card bg-light mg-top-20 card-payment">
                                        <div class="card-body card-body-complete" style="padding: 24px; text-align: center;">
                                            <h2>Bạn đã đặt vé thành công! Xin vui lòng thanh toán theo phương thức đã chọn</h2>
                                        </div>
                                    </div>
                                </div>
                                <!-- End order complete-->

                            </c:when>

                            <c:otherwise>

                                <!-- Start Login Order -->
                                <div id="choose-login-order">
                                    <div class="card bg-light mg-top-20 card-login">
                                        <div class="card-header bg-light order-card-head">Đăng nhập tài khoản Smart Trip
                                        </div>
                                        <div class="card-body card-body-login" style="padding: 24px;">

                                            <!-- Start form login order -->
                                            <div id="f-login">
                                                <c:if test="${not empty notify}">
                                                    <p class="font-weight-light c_red">${notify}</p>
                                                </c:if>
                                                    <%--<p class="font-weight-light c_red">Ahihi</p>--%>

                                                <f:form method="POST" modelAttribute="login" action="/order/login">
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
                                                <form>
                                                    <div class="form-group">
                                                        <label>Tên đăng nhập</label>
                                                        <input type="text" class="form-control username" name="username"
                                                               value="" placeholder="Xin vui lòng điền tên đăng nhập"
                                                               required autofocus>
                                                    </div>

                                                    <div class="form-group">
                                                        <label>Mật khẩu</label>
                                                        <input type="password" class="form-control password"
                                                               name="password" placeholder="Xin vui lòng điền mật khẩu"
                                                               required data-eye>
                                                    </div>

                                                    <div class="form-group">
                                                        <label>Email</label>
                                                        <input type="email" class="form-control email" name="email"
                                                               placeholder="Xin vui lòng điền địa chỉ email" required>
                                                    </div>

                                                    <div class="form-group">
                                                        <label>Họ và Tên</label>
                                                        <input type="text" class="form-control name" name="name"
                                                               value="" placeholder="Xin vui lòng điền họ và tên"
                                                               required>
                                                    </div>

                                                    <div class="form-group">
                                                        <label>Số điện thoại</label>
                                                        <input type="tel" pattern="[0-9]{10}" class="form-control phone"
                                                               name="phone"
                                                               placeholder="Xin vui lòng điền số điện thoại" value=""
                                                               required>
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
                                                </form>
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
                                                <form>
                                                    <div class="form-group">
                                                        <label>Email</label>
                                                        <input type="email" class="form-control email" name="email"
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
                                                            <span>Đăng ký</span>
                                                        </button>
                                                        <center class="cfs-14 c_gray" style="padding: 0px 40px;">Khi tạo
                                                            tài khoản Smart Trip xem như bạn đã đồng ý với điều khoản
                                                            dịch vụ
                                                        </center>
                                                    </div>
                                                </form>
                                            </div>
                                            <!-- End form Forgot Password order -->

                                        </div>
                                    </div>
                                </div>
                                <!-- End Forgot Password Order -->

                            </c:otherwise>

                        </c:choose>

                    </div>
                    <!-- End Choose info order -->

                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">

                        <!-- Start Card order-->
                        <div class="card">
                            <img class="card-img-top"
                                 src="<c:url value="/resources/images/${sessionScope.processOrder.picture}" />"
                                 alt="Card image cap">
                            <div class="card-body">

                                <div class="card bg-light">
                                    <div class="card-header bg-light order-card-head">
                                        <h4 class="cfs-20"
                                            style="font-weight: bolder;">${sessionScope.processOrder.tour}</h4>
                                    </div>
                                    <div class="card-body card-order">
                                        <div class="row pd-bottom-10 mg-0">
                                            <div class="col-lg-12 pd-0">
                                                <h4 class="c_gray cfs-14"><i class="fa fa-plane" aria-hidden="true"></i>
                                                    Gói dịch vụ</h4>
                                            </div>
                                            <div class="col-lg-12 pd-0">
                                                <h4 class="c_black cfs-14 mg-0">${sessionScope.processOrder.nameService}</h4>
                                            </div>
                                        </div>
                                        <div class="row l_top pd-bottom-10 pd-top-10 mg-0">
                                            <div class="col-lg-12 pd-0">
                                                <h4 class="c_gray cfs-14"><i class="fa fa-calendar"
                                                                             aria-hidden="true"></i> Ngày</h4>
                                            </div>
                                            <div class="col-lg-12 pd-0">
                                                <h4 class="c_black cfs-14 mg-0">${sessionScope.processOrder.dateTicket}</h4>
                                            </div>
                                        </div>
                                        <div class="row l_top pd-bottom-10 pd-top-10 mg-0">
                                            <div class="col-lg-12 pd-0">
                                                <h4 class="c_gray cfs-14"><i class="fa fa-users" aria-hidden="true"></i>
                                                    Số lượng</h4>
                                            </div>
                                        </div>
                                        <div class="row mg-0">

                                            <c:forEach items="${sessionScope.processOrder.ticketDetail}"
                                                       var="ticketDetail">
                                                <div class="row pd-top-10 pd-bottom-10 mg-0" style="width: 100%;">
                                                    <div class="col-lg-6 col-sm-9 pd-0 service-name">
                                                        <h4 class="c_black cfs-14">${ticketDetail.nameTicket}</h4>
                                                    </div>
                                                    <div class="col-lg-2 col-sm-3 center pd-0 service-quantity">
                                                        <h4 class="c_black cfs-14">x${ticketDetail.quantityTicket}</h4>
                                                    </div>
                                                    <div class="col-lg-4 col-sm-12 pd-0 service-price">
                                                        <h4 class="c_black t_right cfs-14">${ticketDetail.priceTicket}
                                                            ₫</h4>
                                                    </div>
                                                </div>
                                            </c:forEach>

                                            <div class="row pd-top-10 pd-bottom-10 mg-0" style="width: 100%">
                                                <div class="col-lg-8 pd-0">Tổng tiền thanh toán</div>
                                                <div class="col-lg-4 pd-0">
                                                    <b class="c_orange cfs-16 t_right totalPriceVal">${sessionScope.processOrder.totalPrice}
                                                        ₫</b>
                                                    <input type="hidden"
                                                           value="${sessionScope.processOrder.totalPrice}">
                                                </div>
                                            </div>

                                            <div class="row l_top pd-top-10 mg-0">
                                                <div class="col-lg-12 c_orange cfs-14 pd-0 package-voucher">
                                                    <i class="fa fa-gift" aria-hidden="true"></i>
                                                    Bạn chưa sử dụng voucher cho đơn này
                                                </div>
                                            </div>

                                        </div>
                                    </div>
                                </div>

                            </div>
                        </div>
                        <!-- End Card order-->

                        <c:if test="${not empty sessionScope.userInfo}">
                            <!-- Start Button Order-->
                            <div class="package-btn-order">
                                <button type="button" id="btn-order"
                                        class="btn btn-outline-success my-2 my-sm-0 btn-order btn-custom"
                                        style="width: 100%;">
                                    <span>Đặt ngay</span>
                                </button>
                                <button type="button" id="btn-payment-order"
                                        class="btn btn-outline-success my-2 my-sm-0 btn-order btn-custom"
                                        style="width: 100%; display: none;">
                                    <span>Thanh toán</span>
                                </button>
                            </div>
                            <!-- End Button Order-->
                        </c:if>

                    </div>
                </div>
        </section>
    </div>

</div>
<!-- End Body Order -->

<!-- Start Modal -->
<div class="modal fade" id="notifyModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Quá hạn thanh toán</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                Đơn hàng này đã quá hạn thanh toán hoặc đã được xử lý vui lòng đặt lại.
            </div>
            <div class="modal-footer" style="justify-content: center;">
                <a href="/" class="btn btn-custom">Tôi đã hiểu!</a>
            </div>
        </div>
    </div>
</div>
<!-- End Modal -->

<div class="modalLoading"></div>

<jsp:include page="includes/footer.jsp"/>

<!-- Start Import Script -->
<script type="text/javascript" src="/resources/js/jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/resources/js/popper/popper.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/js/custom.js"></script>
<!-- End Import Script -->
<!-- Start All Script -->
<script>

    <c:if test="${empty sessionScope.processOrder}">
    $(function () {
        $('#notifyModal').modal('show');
    });
    </c:if>

    /**
     * Thay đổi số điện thoại đăng ký của user
     **/
    var ck = 0; //Biến ck dùng để kiểm tra trạng thái của input phone

    $(function () {

        navbarSubMenu();

        $(document).on('click', 'label.phone-user a', function (event) {
            event.preventDefault();
            /* Act on the event */
            if (ck == 0) {
                $('input.phone-user').prop('disabled', false);
                $('input.phone-user').attr('value', '');
                $('label.phone-user a').html('Hủy');
                ck = 1;
            } else {
                $('input.phone-user').prop('disabled', true);
                $('input.phone-user').attr('value', $('input.phone-user').attr('placeholder'));
                $('label.phone-user a').html('Thay đổi');
                ck = 0;
            }

        });
    });


    /**
     * Custom menu của voucher
     **/
    /* Start Dropdown Menu */
    $('.dropdown').click(function () {
        $(this).attr('tabindex', 1).focus();
        $(this).toggleClass('active');
        $(this).find('.dropdown-menu').slideToggle(300);
    });
    $('.dropdown').focusout(function () {
        $(this).removeClass('active');
        $(this).find('.dropdown-menu').slideUp(300);
    });
    $('.dropdown .dropdown-menu li').click(function () {
        $(this).parents('.dropdown').find('span').text($(this).text());
        $(this).parents('.dropdown').find('input').attr('value', $(this).attr('id'));
        $(this).parents('.dropdown').children('.order-val').attr({
            'code': $(this).attr('id'),
            'price': $(this).attr('price'),
            'v-id': $(this).attr('v-id'),
        });
        $('.package-voucher').html(
            '<i class="fa fa-gift" aria-hidden="true"></i>' +
            ' Bạn đang sử dụng voucher ' + $(this).attr('id') +
            ' Giảm ' + formatNumber($(this).attr('price'), ".", ".") + ' ₫'
        );
        var number = $('.totalPriceVal').next().val().replace(/\./g, "");
        var total = parseInt(number) - parseInt($(this).attr('price'));
        $('.totalPriceVal').html(
            formatNumber(total, ".", ".") + ' ₫'
        );

    });
    $('.dropdown-menu li').click(function () {
        var input = '<strong>' + $(this).parents('.dropdown').find('input').val() + '</strong>';
    });
    /* End Dropdown Menu */

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

    $('#btn-order').click(function (e) {
        $('#choose-info-order').hide(500);
        $('#choose-payment-order').show(500);
        $('.order-steps-item-process .order-steps-item-icon span').html('');
        $('.order-steps-item-process .order-steps-item-icon span').addClass('anticon anticon-check');
        $('.order-steps-item-process').addClass('order-steps-item-finish');
        $('.order-steps-item-finish').removeClass('order-steps-item-process');
        $('.order-steps-item-finish').next().removeClass('order-steps-item-wait');
        $('.order-steps-item-finish').next().addClass('order-steps-item-process');
        $('#btn-payment-order').css('display', '');
        $(this).css('display', 'none');
    });

    $('#btn-payment-order').click(function () {
        var arOrder = [];
        var a = '${sessionScope.processOrder.totalPrice}';
        var number = a.replace(/\./g, "");
        var radioValue = $("input[name='payment']:checked").val();
        var note = 'Không ghi chú';

        <c:forEach items="${sessionScope.processOrder.ticketDetail}" var="ticketDetail">
        var fPriceTicket = '${ticketDetail.priceTicket}';
        var TicketDetail = {
            nameTicket: '${ticketDetail.nameTicket}',
            priceTicket: fPriceTicket.replace(/\./g, ""),
            quantityTicket: '${ticketDetail.quantityTicket}'
        };
        arOrder.push(TicketDetail);
        </c:forEach>

        if ($('#note').val() != '') {
            note = $('#note').val();
        }

        json = {};
        json['serviceName'] = '${sessionScope.processOrder.nameService}';
        json['serviceDate'] = '${sessionScope.processOrder.dateTicket}';
        json['voucherId'] = $('.card-body-voucher .dropdown .order-val').attr('v-id');
        json['voucherCode'] = $('.card-body-voucher .dropdown .order-val').attr('code');
        json['voucherPrice'] = $('.card-body-voucher .dropdown .order-val').attr('price');
        json['totalPriceAfter'] = parseInt(number) - parseInt($('.card-body-voucher .dropdown .order-val').attr('price'));
        json['totalPrice'] = number;
        json['payment'] = radioValue;
        json['phoneUser'] = $('#phone-user').val();
        json['note'] = note;
        json['ticketDetail'] = arOrder;

        $.ajax({
            url: '/process/order/${sessionScope.processOrder.services.id}/${sessionScope.userInfo.id}',
            type: 'POST',
            data: {
                dataJson: JSON.stringify(json)
            }
        })
            .done(function (data) {
                $('#choose-payment-order').css('display', 'none');
                $('#choose-complete-order').css('display', '');
                $('#btn-payment-order').css('display', 'none');
                $('.order-steps-item-process .order-steps-item-icon span').html('');
                $('.order-steps-item-process .order-steps-item-icon span').addClass('anticon anticon-check');
                $('.order-steps-item-process').addClass('order-steps-item-finish');
                $('.order-steps-item-finish').removeClass('order-steps-item-process');
                $('.order-steps-item-finish').next('.order-steps-item-wait').addClass('order-steps-item-process');
                $('.order-steps-item-finish').next('.order-steps-item-wait').removeClass('order-steps-item-wait');
            })
            .fail(function () {
                console.log("error");
            })
    });

    $(document).on({
        ajaxStart: function() { $('body').addClass("loading");},
        ajaxStop: function() { $('body').removeClass("loading"); }
    });

</script>
<!-- End All Script -->

</body>
</html>
