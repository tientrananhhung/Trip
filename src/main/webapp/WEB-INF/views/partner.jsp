<%--
  Created by IntelliJ IDEA.
  User: T
  Date: 12/1/2018
  Time: 3:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Partner - Smart Trip</title>
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
<div>
    <img src="images/Become-a-partner.png" alt="partner-smart-trip" class="partner-form-image">
</div>

<div class="container">

    <section class="mg-top-30">

        <h2 style="text-align: center; font-size: 36px; color: rgb(255, 87, 34); margin: 64px;">Tại sao nên trở thành đối tác của DonkeyFun?</h2>

        <p>
            Smart Trip là một dự án khởi nghiệp của những bạn trẻ năng động, tràn đầy đam mê và nhiệt huyết dành cho lĩnh vực Dịch vụ Du lịch.<br><br>
            Chúng tôi tập trung xây dựng nền tảng kết nối khách hàng là những người đi du lịch, mong muốn khám phá các địa điểm, thành phố du lịch nổi tiếng với các nhà cung cấp dịch vụ tại điểm đến.<br><br>
            <b>
                Thúc đẩy doanh thu dịch vụ trong ngành </b>
            Miễn phí quảng cáo trên các kênh chính thức của Smart Trip, cũng như cơ hội tiếp cận cộng đồng du lịch lớn nhất tại Việt Nam.<br><br>
            Hỗ trợ kỹ thuật, xử lý các giao dịch nhanh chóng.<br><br>
            Chi phí THẤP Đăng dịch vụ trên ứng dụng Smart Trip miễn phí vô thời hạn.<br><br>
            Chi phí khi nhà cung cấp dịch vụ nhận được thanh toán thành công: 10% trên tổng số tiền giao dịch.<br><br>
            Sự linh hoạt bậc nhất trong việc hợp tác.<br><br>
            Chúng tôi luôn đặt quyền lợi của bạn lên hàng đầu với chính sách cực kỳ ưu đãi, liên hệ với Smart Trip – Ứng dụng đặt dịch vụ du lịch bậc nhất Việt Nam để được tư vấn cụ thể nhất.<br><br>
            Chúng tôi đang tìm kiếm những đối tác đang hoạt động trong những mảng sau.<br><b>
            + Công ty du lịch lữ hành
        </b><br>
            <b>
                + Công ty du lịch cung cấp vé tham quan, trò chơi, hoạt động trải nghiệm
            </b><br>
            <b>
                + Công ty cho thuể xe máy
            </b><br>
            <b>
                + Cửa hàng đang kinh doanh ẩm thực, thời trang, spa, giải trí,..
            </b><br>
        </p>

        <div class="f-partner mg-top-30 mg-bottom-30">
            <form action="">
                <div class="form-row">
                    <div class="form-group col-md-5">
                        <label for="name">Tên hiển thị</label>
                        <input type="text" class="form-control" id="name" placeholder="Điền tên hiển thị">
                    </div>
                    <div class="form-group col-md-1"></div>
                    <div class="form-group col-md-5">
                        <label for="phone">Số điện thoại</label>
                        <input type="text" class="form-control" id="phone" placeholder="Điền số điện thoại">
                    </div>
                    <div class="form-group col-md-5">
                        <label for="address">Địa chỉ</label>
                        <input type="text" class="form-control" id="address" placeholder="Điền địa chỉ">
                    </div>
                    <div class="form-group col-md-1"></div>
                    <div class="form-group col-md-5">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" id="email" placeholder="Điền địa chỉ">
                    </div>
                </div>
                <div class="col-lg-12 mg-top-20" style="text-align: center">
                    <button type="submit" class="btn btn-outline-success my-2 my-sm-0 btn-custom btn-choose-ticket" style="vertical-align: top; width: 200px;">
                        <span>Đăng ký</span>
                    </button>
                    <p>Chúng tôi sẽ email cho bạn sau khi nhận được thông tin đăng ký.</p>
                </div>
            </form>
        </div>

    </section>

</div>

<!-- End Body Order -->

<jsp:include page="includes/footer.jsp"/>

<!-- Start Import Script -->

<!-- End Import Script -->
</body>
</html>
