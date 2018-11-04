<%--
  Created by IntelliJ IDEA.
  User: T
  Date: 11/2/2018
  Time: 7:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tour detail - Smart Trip</title>
    <!-- Icon -->
    <link rel="icon" href="/resources/images/favicon.ico">
    <!-- Bootstrap css -->
    <link rel="stylesheet" href="/resources/css/bootstrap/bootstrap.min.css">
    <!-- OwlCarousel css -->
    <link rel="stylesheet" href="/resources/css/owlcarousel/owl.carousel.min.css">
    <link rel="stylesheet" href="/resources/css/owlcarousel/owl.theme.default.min.css">
    <!-- Star rating -->
    <link rel="stylesheet" href="/resources/css/starrating/fontawesome-stars-o.css">
    <!-- Fontawesome -->
    <link rel="stylesheet" href="/resources/css/fontawesome/font-awesome.min.css">
    <!-- My css -->
    <link rel="stylesheet" href="/resources/css/custom.css">
</head>
<body>
<jsp:include page="includes/navbar.jsp"/>
<!-- Start Carousel Slide -->
<div class="loop owl-carousel owl-theme owl-loaded owl-drag">
    <a tabindex="-1">
        <div class="image-slider container-image" style="background-image: url('/resources/images/detail1.jpg');"></div>
    </a>
    <a tabindex="-1">
        <div class="image-slider container-image" style="background-image: url('/resources/images/detail2.jpg');"></div>
    </a>
    <a tabindex="-1">
        <div class="image-slider container-image" style="background-image: url('/resources/images/detail3.jpeg');"></div>
    </a>
    <a tabindex="-1">
        <div class="image-slider container-image" style="background-image: url('/resources/images/detail4.jpg');"></div>
    </a>
    <a tabindex="-1">
        <div class="image-slider container-image" style="background-image: url('/resources/images/detail5.jpg');"></div>
    </a>
    <a tabindex="-1">
        <div class="image-slider container-image" style="background-image: url('/resources/images/detail6.jpg');"></div>
    </a>
</div>
<!-- End Carousel Slide -->
<!-- Start Information of Tour -->
<div class="container-fluid">
    <div class="box-content-fluid">
        <div class="row">
            <div class="col-lg-8 col-md-8 col-sm-12">
                <h1>Bà Nà Hills - Đường Lên Tiên Cảnh</h1>
                <div class="cfs-14 critical-info">
                    <i class="fa fa-map-marker c_orange" aria-hidden="true"></i> Địa điểm: <span>An Sơn - Hòa Ninh - Hòa Vang - Đà Nẵng</span>
                </div>
                <div class="cfs-14 critical-info">
                    <i class="fa fa-check-square-o c_orange" aria-hidden="true"></i> Đối tác dịch vụ: <span>Bà Nà Hills - Đường Lên Tiên Cảnh</span>
                </div>
                <div class="properties">
                    <table class="table table-bordered">
                        <tbody>
                        <tr>
                            <td class="center">
                                <div class="cfs-16">
                                    <i class="fa fa-eye c_orange m_right_10 c_orange" aria-hidden="true"></i> Lượt đặt
                                </div>
                                <div class="cfs-14 pd-top-10">100</div>
                            </td>
                            <td class="center">
                                <div class="cfs-16">
                                    <i class="fa fa-hourglass-half c_orange" aria-hidden="true"></i> Trạng thái
                                </div>
                                <div class="cfs-14 pd-top-10">Có sẵn hôm nay</div>
                            </td>
                            <td class="center">
                                <div class="cfs-16">
                                    <i class="fa fa-check-circle-o c_orange" aria-hidden="true"></i> Xác nhận
                                </div>
                                <div class="cfs-14 pd-top-10">Xác nhận ngay</div>
                            </td>
                        </tr>
                        <tr>
                            <td class="center">
                                <div class="cfs-16">
                                    <i class="fa fa-times-circle c_orange" aria-hidden="true"></i> Chính sách huỷ
                                </div>
                                <div class="cfs-14 pd-top-10">Trước 48 tiếng</div>
                            </td>
                            <td class="center">
                                <div class="cfs-16">
                                    <i class="fa fa-qrcode c_orange" aria-hidden="true"></i> Hình thức
                                </div>
                                <div class="cfs-14 pd-top-10">Vé điện tử</div>
                            </td>
                            <td class="center">
                                <div class="cfs-16">
                                    <i class="fa fa-ticket c_orange" aria-hidden="true"></i> Vé
                                </div>
                                <div class="cfs-14 pd-top-10">Cố định</div>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="col-lg-4 col-md-4 col-sm-12">
                <div class="tour-order">
                    <div class="card text-white bg-dark mb-3" style="border-radius: 1px; border: 1px solid #e8e8e8;">
                        <div class="card-header">
                            <h2>681,000 ₫</h2>
                            <span class="price-sale">700,000 ₫</span>
                        </div>
                        <div class="card-body" style="padding: 10px; background: #fff;">
                            <p class="card-text" style="color: rgba(0,0,0,0.65);">Bạn sẽ nhận được thư xác nhận sau khi
                                thanh toán.</p>
                            <button type="button" class="btn btn-outline-success my-2 my-sm-0 btn-custom"
                                    style="width: 100%;">
                                <span>Đặt ngay</span>
                            </button>
                            <div class="pd-top-10">
                                <a href="#" class="btn btn-outline-success my-2 my-sm-0 btn-outline-custom"
                                   target="_blank" style="width: 100%;">
                                    <i class="fa fa-commenting-o m_right_10"></i> Tư vấn dịch vụ
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Information of Tour -->
<!-- Start Services -->
<div class="packages" style="background: rgb(236, 236, 236);">
    <div class="container-fluid">
        <div class="box-content-fluid">
            <div class="row">
                <div class="col-lg-8 col-md-8 col-sm-12">
                    <section class="info-section">
                        <h2 class="title-section">Các gói của vé.</h2>
                        <input type="text">
                        <div class="ticket-package-detail">
                            <div class="ticket-package-detail-body">
                                <div class="df-ticket-package">
                                    <div class="row">
                                        <div class="col-lg-8">
                                            <h2>Vé cáp treo</h2>
                                        </div>
                                        <div class="col-lg-4">
                                            <div class="g-right">
                                                <div class="dp-ib">
                                                    <p class="cfs-16 c_black" style="margin: 0px;">
                                                        <strong>681,000 ₫</strong>
                                                    </p>
                                                    <p class="cfs-14 price-sale c_gray" style="margin: 0px;">700,000
                                                        ₫</p>
                                                </div>
                                                <span>
                                                        <span>
                                                            <button type="button"
                                                                    class="btn btn-outline-success my-2 my-sm-0 btn-custom"
                                                                    style="vertical-align: top;">
                                                                <span>Chọn</span>
                                                    </button>
                                                    </span>
                                                    </span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="package-detail-more">
                                        <button class="btn btn-detail">
                                            <i class="fa fa-angle-right" aria-hidden="true"></i> Thông tin chi tiết
                                        </button>
                                        <div class="service-detail">
                                            * Bao gồm: <br>
                                            - Vé vào cổng Bà Nà Hills <br>
                                            - Vé cáp treo Bà Nà Hills 2 chiều <br>
                                            - Vé vui chơi 105 trò chơi ở Khu vui chơi giải trí Fantasy Park và máng
                                            trượt Hiệp sỹ thần thoại <br>
                                            - Vé tàu hỏa leo núi <br>
                                            - Vé tham quan 9 vườn hoa, tham quan hầm rượu Debay. <br><br><br>
                                            *Không bao gồm: <br>
                                            - Vé tham quan Bảo tàng tượng sáp <br>
                                            - Không bao gồm các trò chơi: gắp thú bông, kỹ năng carnival tại khu vui
                                            chơi giải trí Fantasy Park <br>
                                            - Các chi phí cá nhân <br>
                                            - Bữa trưa, chi phí ăn uống. <br>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </section>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Services -->
<!-- Start Content Tour Detail -->
<div class="container-fluid">
    <div class="box-content-fluid">
        <div class="row">
            <div class="col-lg-8 col-md-8 col-sm-12">
                <!-- Start Content Tour -->
                <section class="tour-content">
                    <div id="tour-services">
                        <div class="info-section">
                            <h2 class="section-title">Thông tin dịch vụ.</h2>
                            <p>
                                <b>TỔNG QUAN</b>
                            <p>
                                Rất nhiều người luôn có mơ ước đi du lịch ở trời Âu, để cảm nhận được sự lộng lẫy của
                                những tòa lâu đài cổ kính. Nhưng mọi thứ sẽ được “hiện thực hóa” nếu du khách đặt chân
                                lên khu nghỉ dưỡng Bà Nà Hill ở Đà Nẵng
                            </p>
                            <b>BẠN TRẢI NGHIỆM NHỮNG GÌ ?</b><br><br>
                            <p>
                                Một trải nghiệm tuyệt vời đầu tiên tại Bà Nà Hills là thưởng ngoạn cảnh sắc tuyệt diệu
                                của núi rừng trong hành trình lên đỉnh Bà Nà bằng cáp treo. Mang đến cảm giác khoan
                                thai, tự tại là một trong những điều làm nên sức hút của Bà Nà.
                            </p>
                            <p>
                                Sau khi đã lên đến đỉnh Bà Nà, du khách có thể viếng thăm chùa Linh Ứng Bà Nà – một
                                trong những ngôi chùa nổi tiếng nhất Đà Nẵng. Đến đây, du khách sẽ được tận hưởng không
                                khí mát mẻ, trong lành và tĩnh lặng nơi cửa Phật. Tiếp đến, du khách có thể khám phá khu
                                làng Pháp cổ. Nơi đây là một địa điểm hấp dẫn nhất không thể bỏ qua tại Bà Nà Hills. Khu
                                làng Pháp cổ sẽ đưa du khách bước vào một không gian kiến trúc đậm chất cổ điển châu Âu
                                thế kỷ XIX. Sau khi tham quan khu làng Pháp, du khách có thể dạo bước qua vườn hoa Le
                                Jardin D’Amour, thưởng thức rượu vang tại hầm rượu Debay, ngắm nhìn các tác phẩm phiên
                                bản người nổi tiếng bằng tượng sáp tại Bảo tàng tượng sáp… Đặc biệt nếu du khách là
                                người yêu thích những trò chơi mạo hiểm, cảm giác mạnh thì khu vui chơi – giải trí trong
                                nhà Fantasy Park trên Bà Nà Hills sẽ là một địa điểm hấp dẫn.
                            </p>
                            <b>Ngắm cảnh khi đi cáp treo Bà Nà Hills</b><br><br>
                            <p>
                                Từ cabin của cáp treo các bạn có thể ngắm toàn bộ không gian rộng lớn của Bà Nà với mây,
                                núi, rừng rậm, thác nước… đẹp không kém những khung cảnh được nhìn từ những cáp treo nổi
                                tiếng ở Nam Phi, Hong Kong hay Langkawi…<br>
                                Cabin cáp treo Bà Nà khá đẹp, có nhiều màu sắc sinh động và vui mắt, mỗi cabin ngồi được
                                khoảng 6 -8 người lớn, rộng rãi và thoải mái.
                            </p>
                            <b>Đi tàu hỏa leo núi Bà Nà Hills</b><br><br>
                            <p>
                                Dịch vụ tàu hỏa leo núi khá thú vị để các bạn có thể tới được khu vực Le Jardin D’Amour,
                                và hầm rượu Debay hay Nhà Tịnh tâm…Tàu hỏa leo núi này có sức chứa 80 người, cứ 15’ có 1
                                chuyến, chạy trên tuyến cáp dài 400m trên sườn núi đem lại cảm giác khá mới mẻ cho các
                                bạn, mặc dù đông người đi nhưng cũng không phải chờ đợi quá lâu.
                            </p>
                            <b>Ghé vườn hoa Le Jardin D’Amour Bà Nà Hills</b><br><br>
                            <p>
                                Đây là 1 khu vực mà chắc chắn các bạn thích chụp ảnh sẽ ở đây lâu nhất. Vì đây là một
                                vườn hoa lớn được chia thành 9 vườn hoa nhỏ thiết kế theo phong cách Châu Âu, lãng mạn,
                                cổ kính với các loài hoa đẹp, rực rỡ và tráng lệ. Mỗi vườn hoa nhỏ mang một chủ đề và
                                cách bài trí khác nhau quả thật rất thú vị đối với khách du lịch.Trong vườn hoa Le
                                Jardin D’Amour còn có cả 1 mê cung kỳ bí vô cùng râm mát, yên tĩnh để các bạn có thể dạo
                                chơi.
                            </p>
                            <b>Tới chùa Linh Ứng Bà Nà Hills</b><br><br>
                            <p>
                                Đây là một trong 3 ngôi chùa Linh Ứng ở Đà Nẵng, ngôi chùa có tượng Phật Thích Ca cao
                                tới 27m, đế tượng được thiết kế 8 mặt thể hiện 8 giai đoạn trong cuộc đời Đức Phật. Chùa
                                còn có vườn Lộc uyển – nơi Phật thuyết giáo lần đầu tiên.
                            </p>
                            <b>Thưởng thức rượu ở hầm rượu Debay Bà Nà Hills</b><br><br>
                            <p>
                                Hầm rượu được người Pháp xây dựng từ năm 1923, với mục đích cất giữ các loại rượu, đặc
                                biệt là các loại rượu vang. Hầm rượu rất đặc biệt được xây dựng bằng đá nguyên khối sâu
                                trong lòng hang nên trải qua bao nhiêu năm nhưng hầm rượu vẫn còn khá nguyên vẹn tại Bà
                                Nà..
                            </p>
                            <b>Thăm quan bảo tàng tượng sáp Bà Nà Hills</b><br><br>
                            <p>
                                Nơi đây trưng bày bản sao của các chính trị gia, người nổi tiếng từ khắp các nước trên
                                thế giới. Sẽ rất thú vị khi bạn có thể được gặp và chụp hình với những nhà khoa học như
                                Albert Einstein, tổng thống Obama, các diễn viên, ngôi sao bóng đá, bóng rổ nổi tiếng:
                                David Backham, Lionel Messi, các ngôi sao điện ảnh Jacky Chan… Giá vé vào cửa là
                                100.000/ lượt cho người lớn, và trẻ em trên 1,3m. Trẻ em dưới 1,3m sẽ được miễn phí vé.
                            </p>
                            <b>Chơi hơn 105 trò chơi miễn phí ở khu Fantasy Land</b><br><br>
                            <p>
                                Khu vui chơi Fantasy Land rộng hơn 21000 mét vuông và được xây dựng theo những câu
                                chuyện viễn tưởng của nhà văn June Verne. Đến đây bạn sẽ có cơ hội tham gia thám hiểm 2
                                vạn dặm dưới đáy biển, phiêu lưu trong 80 ngày vòng quanh thế giới, hay tham gia hành
                                trình vào trung tâm trái đất. Với vé Bà Nà Hills, bạn có cơ hội vui chơi thoải mái với
                                hơn 105 trò chơi trong khu vực.
                            </p>
                            <b>Một số trò chơi nổi bật:</b>
                            <p>
                                <b>+ Rạp chiếu phim 3D Mega</b> 360 độ với công nghệ hiện đại nhất mang đến cho bạn
                                những bộ phim chân thực đến từng khung hình.
                            </p>
                            <p>
                                <b>+ Vòng đua tử thần 4D</b> và bắn súng miền tây hoang dã 5Di sẽ và sẽ mang đến cho bạn
                                những trải nghiệm tương tác lần đầu tiên xuất hiện ở Việt Nam.
                            </p>
                            <p>
                                <b>+ Tháp rơi tự do trong nhà</b> cao nhất Việt Nam, nơi bạn trải nghiệm cảm giác được
                                nâng lên cao và rơi tự do xuống từ độ cao 29m.
                            </p>
                            <p>
                                <b>+ Hành trình trở về kỷ Jura</b> - chuyến thám hiểm về thời đại của loài bò sát khổng
                                lồ và đầy nguy hiểm dành cho những ai mê khám phá
                            </p>
                            <p>
                                <b>+ Cuộc du hành vào lòng đất</b> - hành trình độc đáo và duy nhất trên thế giới cho
                                bạn cơ hội đến thăm, mạo hiểm và chinh phục thế giới dưới lòng đất.
                            </p>
                            <b>Các show diễn ở Bà Nà Hills</b><br><br>
                            <p>
                                + Lễ hội đường phố (Carnival show): 10h30: – 11:00 và 13:30 – 14:00 <br>
                                + Ban nhạc đường phố (Sân khấu hồ cá) 11:00 – 11:30; 14:00 – 14:30 và 15:00 – 15:30 <br>
                                + Minishow (Sân khấu chính) 11:30 – 12:00 và 14:30 – 15h00 <br>
                            </p>
                            <i>Lịch diễn có thể thay đổi vì lý do thời tiết</i>
                            </p>
                        </div>
                    </div>
                </section>
                <!-- End Content Tour -->
                <!-- Start Review and Comment -->
                <div id="tour-review">
                    <div class="info-section">
                        <div class="row">
                            <div class="col-lg-9">
                                <h2 class="ticket-title">Đánh giá (20 Nhận xét)</h2>
                            </div>
                            <div class="col-lg-3" style="margin: auto;">
                                <select class="star-rating" name="rating" data-current-rating="3" style="float: right;">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <!-- Start Reviews -->
                    <div class="pd-left-20">
                        <div>
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo" style="background-image: url('/resources/images/user1.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Văn Huệ Võ</h5>
                                    <div class="product-star">
                                        <div class="row">
                                            <div class="col-lg-2">
                                                <select class="star-rating" name="rating" data-current-rating="3"
                                                        style="float: right;">
                                                    <option value="1">1</option>
                                                    <option value="2">2</option>
                                                    <option value="3">3</option>
                                                    <option value="4">4</option>
                                                    <option value="5">5</option>
                                                </select>
                                            </div>
                                            <div class="col-lg-3">
                                                <span>12/09/2018 09:46</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Đây là địa điểm rất tốt để đi du lịch với gia đình. Gia đình mình đi 4 người và
                                        1 em bé nên tiết kiệm được 1 ít tiền và thời gian khi mua vé qua ứng dụng
                                        donkeyfun.
                                    </p>
                                </div>
                            </div>
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo" style="background-image: url('/resources/images/user2.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Thành Nhân Võ</h5>
                                    <div class="product-star">
                                        <div class="row">
                                            <div class="col-lg-2">
                                                <select class="star-rating" name="rating" data-current-rating="3"
                                                        style="float: right;">
                                                    <option value="1">1</option>
                                                    <option value="2">2</option>
                                                    <option value="3">3</option>
                                                    <option value="4">4</option>
                                                    <option value="5">5</option>
                                                </select>
                                            </div>
                                            <div class="col-lg-3">
                                                <span>12/09/2018 05:32</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Mua vé ở đây tuy giá rẻ không hơn bao nhiêu nhưng lại đỡ mất công đi lại, chờ
                                        đợi mua vé. Vé đi Bà Nà rất suôn sẻ, nhóm bạn mình đã cảm thấy tiết kiệm thời
                                        gian hơn rất nhiều để có nhiều time vui chơi hơn.
                                    </p>
                                </div>
                            </div>
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo" style="background-image: url('/resources/images/user3.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Ngọc Tuân Nguyễn</h5>
                                    <div class="product-star">
                                        <div class="row">
                                            <div class="col-lg-2">
                                                <select class="star-rating" name="rating" data-current-rating="3"
                                                        style="float: right;">
                                                    <option value="1">1</option>
                                                    <option value="2">2</option>
                                                    <option value="3">3</option>
                                                    <option value="4">4</option>
                                                    <option value="5">5</option>
                                                </select>
                                            </div>
                                            <div class="col-lg-3">
                                                <span>11/09/2018 09:36</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Đây là lần thứ 2 mình đi Bà Nà, lần đầu mình lên đến nơi mới mua vé nên rất mất
                                        thời gian. Lần 2 này mình đặt vé qua donkeyfun giá tuy không rẻ hơn bao nhiêu
                                        nhưng lại nhanh chóng tiện lợi, nhân viên lại tư vấn nhiệt tình và rất vui vẻ.
                                    </p>
                                </div>
                            </div>
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo" style="background-image: url('/resources/images/user4.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Thị Thanh Tài Võ</h5>
                                    <div class="product-star">
                                        <div class="row">
                                            <div class="col-lg-2">
                                                <select class="star-rating" name="rating" data-current-rating="3"
                                                        style="float: right;">
                                                    <option value="1">1</option>
                                                    <option value="2">2</option>
                                                    <option value="3">3</option>
                                                    <option value="4">4</option>
                                                    <option value="5">5</option>
                                                </select>
                                            </div>
                                            <div class="col-lg-3">
                                                <span>11/09/2018 06:12</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Đặt vé tại donkeyfun nên không mất quá nhiều thời gian, 1 ngày có thể tham quan
                                        hết Bà Nà Hills,,đồ ăn ở các nhà hàng ở Bà Nà cũng rất được.
                                    </p>
                                </div>
                            </div>
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo" style="background-image: url('/resources/images/user5.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Văn Nhớ Trần</h5>
                                    <div class="product-star">
                                        <div class="row">
                                            <div class="col-lg-2">
                                                <select class="star-rating" name="rating" data-current-rating="3"
                                                        style="float: right;">
                                                    <option value="1">1</option>
                                                    <option value="2">2</option>
                                                    <option value="3">3</option>
                                                    <option value="4">4</option>
                                                    <option value="5">5</option>
                                                </select>
                                            </div>
                                            <div class="col-lg-3">
                                                <span>11/09/2018 04:41</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Mua vé ở Donkeyfun rất tiện lợi, nhưng đi vào dịp lễ rất đông người nên phải
                                        đứng đợi rất rất lâu mới vào được cổng, người thì rất đông, nhưng lại không có
                                        quạt gió, thời tiết lại nóng nên tạo cảm giác rất mỏi mệt khi chờ đợi để được
                                        vào cổng.
                                    </p>
                                </div>
                            </div>
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo" style="background-image: url('/resources/images/user6.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Tnkt Truong</h5>
                                    <div class="product-star">
                                        <div class="row">
                                            <div class="col-lg-2">
                                                <select class="star-rating" name="rating" data-current-rating="3"
                                                        style="float: right;">
                                                    <option value="1">1</option>
                                                    <option value="2">2</option>
                                                    <option value="3">3</option>
                                                    <option value="4">4</option>
                                                    <option value="5">5</option>
                                                </select>
                                            </div>
                                            <div class="col-lg-3">
                                                <span>10/09/2018 18:03</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Nghe danh Bà Nà Hills đã lâu, là niềm ao ước của ai khi đến Đà Nẵng,. Khí hậu
                                        rất tuyệt để trốn cái nắng của Đà Thành, cảnh đẹp rừng núi với những tòa lâu đài
                                        rất tuyệt vời. Mình và nhóm bạn thân của mình đã có những giây phút vui chơi ở
                                        đây rất vui vẻ và đặc biệt có rất nhiều hình ảnh so deep sau chuyến đi. 😊
                                    </p>
                                </div>
                            </div>
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo" style="background-image: url('/resources/images/user7.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Văn Dũng Võ</h5>
                                    <div class="product-star">
                                        <div class="row">
                                            <div class="col-lg-2">
                                                <select class="star-rating" name="rating" data-current-rating="3"
                                                        style="float: right;">
                                                    <option value="1">1</option>
                                                    <option value="2">2</option>
                                                    <option value="3">3</option>
                                                    <option value="4">4</option>
                                                    <option value="5">5</option>
                                                </select>
                                            </div>
                                            <div class="col-lg-3">
                                                <span>10/09/2018 08:51</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Mình mua vé qua donkeyfun rất nhanh, đến ngày đi vì thời tiết không được tốt lắm
                                        nên càng ít khách không phải chờ đợi lâu, dù trời mưa không được đẹp như ngày
                                        nắng nhưng nhóm bạn mình cũng quẩy banh nóc đến chiều tối mới chịu quay về.
                                    </p>
                                </div>
                            </div>
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo" style="background-image: url('/resources/images/user8.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Hồng Triệu Nguyễn</h5>
                                    <div class="product-star">
                                        <div class="row">
                                            <div class="col-lg-2">
                                                <select class="star-rating" name="rating" data-current-rating="3"
                                                        style="float: right;">
                                                    <option value="1">1</option>
                                                    <option value="2">2</option>
                                                    <option value="3">3</option>
                                                    <option value="4">4</option>
                                                    <option value="5">5</option>
                                                </select>
                                            </div>
                                            <div class="col-lg-3">
                                                <span>10/09/2018 06:06</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Có rất nhiều nơi tuyệt vời ở Đà Nẵng, đúng là không lãng phí thanh xuân khi đã
                                        chọn Đà Nẵng là địa điểm du lịch hè. Đặt vé qua donkeyfun tiết kiệm được một
                                        chút ít chi phí của chuyến đi. Rất tiện ích.
                                    </p>
                                </div>
                            </div>
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo" style="background-image: url('/resources/images/user9.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Tiến Nam Vũ</h5>
                                    <div class="product-star">
                                        <div class="row">
                                            <div class="col-lg-2">
                                                <select class="star-rating" name="rating" data-current-rating="3"
                                                        style="float: right;">
                                                    <option value="1">1</option>
                                                    <option value="2">2</option>
                                                    <option value="3">3</option>
                                                    <option value="4">4</option>
                                                    <option value="5">5</option>
                                                </select>
                                            </div>
                                            <div class="col-lg-3">
                                                <span>09/09/2018 05:57</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Bà Nà Hills rất đẹp, ba mẹ và gia đình mình rất hài lòng với chuyến đi chơi này.
                                        Giá cả cũng rẻ và nhanh chóng hơn so với việc đợi và mua tại quầy.
                                    </p>
                                </div>
                            </div>
                            <div class="review-item">
                                <div class="editer">
                                    <div class="editer-logo" style="background-image: url('/resources/images/user10.jpg');"></div>
                                </div>
                                <div class="review-content">
                                    <h5 class="cfs-16">Lương Trần</h5>
                                    <div class="product-star">
                                        <div class="row">
                                            <div class="col-lg-2">
                                                <select class="star-rating" name="rating" data-current-rating="3"
                                                        style="float: right;">
                                                    <option value="1">1</option>
                                                    <option value="2">2</option>
                                                    <option value="3">3</option>
                                                    <option value="4">4</option>
                                                    <option value="5">5</option>
                                                </select>
                                            </div>
                                            <div class="col-lg-3">
                                                <span>02/09/2018 05:15</span>
                                            </div>
                                        </div>
                                    </div>
                                    <p class="cfs-14">
                                        Bà Nà đẹp như người ta vẫn nói “đường lên tiên cảnh”, đáng với đồng tiền bỏ ra.
                                    </p>
                                </div>
                            </div>
                            <div class="center mg-top-10">
                                <nav aria-label="navigation" style="overflow: hidden; display: inline-block;">
                                    <ul class="pagination">
                                        <li class="page-item disabled">
                                            <a class="page-link" href="#">
                                                <i class="fa fa-angle-left" aria-hidden="true"></i>
                                            </a>
                                        </li>
                                        <li class="page-item active"><a class="page-link" href="#">1</a></li>
                                        <li class="page-item"><a class="page-link" href="#">2</a></li>
                                        <li class="page-item">
                                            <a class="page-link" href="#">
                                                <i class="fa fa-angle-right" aria-hidden="true"></i>
                                            </a>
                                        </li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                    </div>
                    <!-- End Reviews -->
                </div>
                <!-- End Review and Comment -->
            </div>
        </div>
    </div>
</div>
<!-- End Content Tour Detail -->

<jsp:include page="includes/footer.jsp"/>

<!-- Start Import Script -->
<script type="text/javascript" src="js/jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="js/owlcarousel/owl.carousel.js"></script>
<script type="text/javascript" src="js/popper/popper.min.js"></script>
<script type="text/javascript" src="js/bootstrap/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="js/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap/util.js"></script>
<script type="text/javascript" src="js/owlcarousel/highlight.js"></script>
<script type="text/javascript" src="js/owlcarousel/app.js"></script>
<script type="text/javascript" src="js/starrating/jquery.barrating.min.js"></script>
<script type="text/javascript" src="js/sticky/jquery.sticky.js"></script>
<!-- End Import Script -->
<!-- Start All Script -->
<!-- Start Owl Carousel Slide for post -->
<script>
    $(document).ready(function () {
        $('.loop').owlCarousel({
            center: true,
            loop: true,
            responsive: {
                0: {
                    items: 1,
                    margin: 10
                },
                600: {
                    items: 2,
                    margin: 10
                },
                1000: {
                    items: 2,
                    margin: 10
                }
            }
        })
    })
</script>
<!-- End Owl Carousel Slide for post -->
<script type="text/javascript">

    //Tooltip
    $(function () {
        $('[data-toggle="tooltip"]').tooltip()
    })

    //Đánh giá
    $(function () {
        $('.star-rating').barrating({
            theme: 'fontawesome-stars-o',
            readonly: true,
            initialRating: 3.5
        });
    });

    //Hide detail
    $(function() {

        //Cho nội dung thu lên
        $('.service-detail').slideUp();

        $('.btn-detail').click(function(event) {
            /* Act on the event */
            var a = $(this).attr('class');
            if (a != '' && a != undefined) {
                a = a.split(' ');
            } else {
                a = [];
            }
            // inArray là lệnh tìm kiếm active trong mảng a.
            if ($.inArray('active', a) >= 0) {
                $(this).children('.fa').removeClass('fa-angle-down').addClass('fa-angle-right');
                $(this).removeClass('active');
                $('.service-detail').slideUp();
            } else {
                $('.btn-detail').children('.fa').removeClass('fa-angle-down').addClass('fa-angle-right');
                $(this).children('.fa').removeClass('fa-angle-right').addClass('fa-angle-down');
                $('.service-detail').slideUp();
                $(this).next().slideToggle();
                $('.btn-detail').removeClass('active');
                $(this).addClass('active');
            }
        });
    });

    // Sticky đặt vé
    $(document).ready(function () {
        $(".tour-order").sticky({
            topSpacing: 0,
            zIndex: 9999
        });
    });
</script>
<!-- Start All Script -->
</body>
</html>
