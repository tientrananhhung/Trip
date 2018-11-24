<%--
  Created by IntelliJ IDEA.
  User: T
  Date: 11/24/2018
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
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
            <div class="row">
                <div class="col-lg-8" style="padding: 30px 0px;">

                    <!-- Start Step order -->
                    <div class="order-steps order-steps order-steps-horizontal order-steps-small order-steps-label-horizontal"
                         style="padding-bottom: 30px;">
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

                    <!-- Start payment form -->
                    <div id="payment-form">

                        <!-- Start Information user -->
                        <div class="card bg-light">
                            <div class="card-header bg-light order-card-head">Thông tin người đặt</div>
                            <div class="card-body" style="padding: 24px;">
                                <div class="row">
                                    <div class="col-lg-5">
                                        <label class="cfs-14 name-user"><span class="asterisk">*</span>Họ và
                                            Tên:</label>
                                        <p class="name-user" id="name-user">Trần Anh Hưng Tiến</p>
                                        <label class="cfs-14 email-user"><span class="asterisk">*</span>Email:</label>
                                        <p class="email-user" id="email-user">tientah@fpt.edu.vn</p>
                                        <label class="cfs-14 address-user"><span class="asterisk">*</span>Địa
                                            chỉ:</label>
                                        <p class="address-user" id="address-user">137 Nguyễn Thị Thập</p>
                                        <label class="cfs-14 phone-user"><span class="asterisk">*</span>Số điện thoại:
                                            <a href="#">Thay đổi</a></label>
                                        <input type="text" class="phone-user form-control" id="phone-user"
                                               placeholder="0966575492" value="0966575492" disabled="">
                                    </div>
                                    <div class="col-lg-7">
                                        <label class="cfs-14">Ghi chú:</label>
                                        <textarea id="note" class="form-control"
                                                  placeholder="Nhập những gì bạn muốn vào đây." rows="10"></textarea>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- End Information user -->

                        <!-- Start payment -->
                        <div class="card bg-light mg-top-20">
                            <div class="card-header bg-light order-card-head">Hình thức thanh toán</div>
                            <div class="card-body" style="padding: 24px;">
                                <section class="s-payment">
                                    <div>
                                        <input type="radio" id="payment-transfer" class="payment" name="payment"
                                               value="1">
                                        <label for="payment-transfer" class="l-payment">
                                            <h2 class="cfs-20 mg-top-20 fw-bolder">Chuyển khoản</h2>
                                            <p class="cfs-14">
                                                Chuyển khoản ngân hàng với nội dung: username &lt;khoảng trắng&gt; thanh
                                                toán
                                            </p>
                                        </label>
                                    </div>
                                    <div>
                                        <input type="radio" id="direct-payment" class="payment" name="payment" value="2"
                                               checked>
                                        <label for="direct-payment" class="l-payment" checked>
                                            <h2 class="cfs-20 mg-top-20 fw-bolder">Thanh toán trực tiếp</h2>
                                            <p class="cfs-14">Bạn có thể đến trực tiếp quầy giao dịch của Smart Trip để
                                                nhận vé</p>
                                        </label>
                                    </div>
                                    <div>
                                        <input type="radio" id="payment-counter" class="payment" name="payment"
                                               value="3">
                                        <label for="payment-counter" class="l-payment">
                                            <h2 class="cfs-20 mg-top-20 fw-bolder">Thanh toán tại quầy</h2>
                                            <p class="cfs-14">Bạn có thể đến trực tiếp điểm du lịch để nhận vé</p>
                                        </label>
                                    </div>
                                </section>
                            </div>
                        </div>
                        <!-- End payment -->

                        <!-- Start offer -->
                        <div class="card bg-light mg-top-20">
                            <div class="card-header bg-light order-card-head">Sử dụng voucher</div>
                            <div class="card-body card-voucher" style="padding: 24px; height: 240px;">

                                <div class="dropdown">
                                    <div class="select">
                                        <span>Áp dụng voucher</span>
                                        <i class="fa fa-chevron-left"></i>
                                    </div>
                                    <input type="hidden" name="voucher">
                                    <ul class="dropdown-menu">
                                        <li id="n3g6g3n7m2n5">Mã: n3g6g3n7m2n5 - Giảm 20.000đ</li>
                                        <li id="n3g6g3n9n3g8">Mã: n3g6g3n9n3g8 - Giảm 50.000đ</li>
                                        <li id="h2d8g9y4e5k8">Mã: h2d8g9y4e5k8 - Giảm 100.000đ</li>
                                        <li id="k2g0n4k7n3j5">Mã: k2g0n4k7n3j5 - Giảm 150.000đ</li>
                                    </ul>
                                </div>

                            </div>
                        </div>
                        <!-- End offer -->

                    </div>
                    <!-- End payment form -->

                </div>
                <div class="col-lg-4">

                    <!-- Start Card order-->
                    <div class="card">
                        <img class="card-img-top" src="images/tour4.jpg" alt="Card image cap">
                        <div class="card-body">

                            <div class="card bg-light">
                                <div class="card-header bg-light order-card-head">
                                    <h4 class="cfs-20" style="font-weight: bolder;">Vinpearl Land Hội An</h4>
                                </div>
                                <div class="card-body card-order">
                                    <div class="row pd-bottom-10 mg-0">
                                        <div class="col-lg-12 pd-0">
                                            <h4 class="c_gray cfs-14"><i class="fa fa-plane" aria-hidden="true"></i> Gói
                                                dịch vụ</h4>
                                        </div>
                                        <div class="col-lg-12 pd-0">
                                            <h4 class="c_black cfs-14 mg-0">Vé vui chơi Vinpearl Land</h4>
                                        </div>
                                    </div>
                                    <div class="row l_top pd-bottom-10 pd-top-10 mg-0">
                                        <div class="col-lg-12 pd-0">
                                            <h4 class="c_gray cfs-14"><i class="fa fa-calendar" aria-hidden="true"></i>
                                                Ngày</h4>
                                        </div>
                                        <div class="col-lg-12 pd-0">
                                            <h4 class="c_black cfs-14 mg-0">25/11/2018</h4>
                                        </div>
                                    </div>
                                    <div class="row l_top pd-bottom-10 pd-top-10 mg-0">
                                        <div class="col-lg-12 pd-0">
                                            <h4 class="c_gray cfs-14"><i class="fa fa-users" aria-hidden="true"></i> Số
                                                lượng</h4>
                                        </div>
                                    </div>
                                    <div class="row mg-0">

                                        <div class="row pd-top-10 pd-bottom-10 mg-0" style="width: 100%;">
                                            <div class="col-lg-6 pd-0">
                                                <h4 class="c_black cfs-14">Trẻ em (1m - 1.4m)</h4>
                                            </div>
                                            <div class="col-lg-2 center pd-0">
                                                <h4 class="c_black cfs-14">x1</h4>
                                            </div>
                                            <div class="col-lg-4 pd-0">
                                                <h4 class="c_black t_right cfs-14">400.000 ₫</h4>
                                            </div>
                                        </div>
                                        <div class="row pd-top-10 pd-bottom-10 mg-0" style="width: 100%">
                                            <div class="col-lg-8 pd-0">Tổng tiền thanh toán</div>
                                            <div class="col-lg-4 pd-0">
                                                <b class="c_orange cfs-16 t_right">400.000 ₫</b>
                                            </div>
                                        </div>
                                        <div class="row l_top pd-top-10 mg-0">
                                            <div class="col-lg-12 c_orange cfs-14 pd-0">
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

                </div>
            </div>
        </section>
    </div>

</div>
<!-- End Body Order -->

<jsp:include page="includes/footer.jsp"/>

<!-- Start Import Script -->
<script type="text/javascript" src="/resources/js/jquery/jquery-3.3.1.min.js"></script>
<!-- End Import Script -->
<!-- Start All Script -->
<script>

    /**
     * Thay đổi số điện thoại đăng ký của user
     **/
    var ck = 0; //Biến ck dùng để kiểm tra trạng thái của input phone

    $(function () {
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
    });
    $('.dropdown-menu li').click(function () {
        var input = '<strong>' + $(this).parents('.dropdown').find('input').val() + '</strong>';
    });
    /* End Dropdown Menu */

</script>
<!-- End All Script -->

</body>
</html>
