<%--
  Created by IntelliJ IDEA.
  User: Tien Tran
  Date: 11/2/2018
  Time: 7:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Blog - Smart Trip</title>
    <!-- Icon -->
    <link rel="icon" href="/resources/images/favicon.ico">
    <!-- Bootstrap css -->
    <link rel="stylesheet" href="/resources/css/bootstrap/bootstrap.min.css">
    <!-- Star rating -->
    <link rel="stylesheet" href="/resources/css/starrating/fontawesome-stars-o.css">
    <!-- Fontawesome -->
    <link rel="stylesheet" href="/resources/css/fontawesome/font-awesome.min.css">
    <!-- My css -->
    <link rel="stylesheet" href="/resources/css/custom.css">
</head>
<body style="background: #eee;">
<jsp:include page="includes/navbar.jsp"/>
<!-- Start Content website -->
<div class="container-fluid">

    <!-- Start Bài viết mới nhất -->
    <section class="box-content-fluid mg-top-20">
        <div class="box-body">
            <div class="post-big">
                <a class="city-tickets" href="#" style="background-image: url('/resources/images/post1.jpg');">
                    <div class="ticket-relative">
                        <div class="ticket-info">
                            <div class="ticket-big-short">
                                <h3>Ngất ngây trước 5 điểm sống ảo ở Đà Lạt khiến dân tình chao đảo</h3>
                            </div>
                        </div>
                    </div>
                </a>
            </div>
            <div class="post-small" style="border-bottom: 5px solid white;">
                <a class="city-tickets" href="#" style="background-image: url('/resources/images/post2.jpg');">
                    <div class="ticket-relative">
                        <div class="ticket-info">
                            <div class="ticket-small-short">
                                <h3>Ẩm thực Trần – Tinh hoa ẩm thực đặc sản xứ Quảng</h3>
                            </div>
                        </div>
                    </div>
                </a>
            </div>
            <div class="post-small" style="border-bottom: 5px solid white;">
                <a class="city-tickets" href="#" style="background-image: url('/resources/images/post3.jpg');">
                    <div class="ticket-relative">
                        <div class="ticket-info">
                            <div class="ticket-small-short">
                                <h3>Bỏ túi bí kíp, không còn lo du lịch Nha Trang nên đi đâu</h3>
                            </div>
                        </div>
                    </div>
                </a>
            </div>
            <div class="post-small">
                <a class="city-tickets" href="#" style="background-image: url('/resources/images/post4.jpg');">
                    <div class="ticket-relative">
                        <div class="ticket-info">
                            <div class="ticket-small-short">
                                <h3>Những đặc sản Hà Nội làm nức lòng khách du lịch Thủ Đô</h3>
                            </div>
                        </div>
                    </div>
                </a>
            </div>
            <div class="post-small">
                <a class="city-tickets" href="#" style="background-image: url('/resources/images/post5.jpg');">
                    <div class="ticket-relative">
                        <div class="ticket-info">
                            <div class="ticket-small-short">
                                <h3> Bỏ túi địa chỉ 5 món ngon ở Đà Nẵng nhất định bạn phải thử một lần</h3>
                            </div>
                        </div>
                    </div>
                </a>
            </div>
        </div>
    </section>
    <!-- End Bài viết mới nhất -->

    <!-- Start điểm du lịch -->
    <section class="box-content-fluid mg-top-50">
        <div class="row">
            <!-- Start Content left -->
            <div class="col-lg-8">
                <!-- Start box 1 -->
                <div class="box-blog-left">
                    <div class="box-blog-title">
                        <h3 class="blog-title">
                            <a href="#">điểm du lịch</a>
                        </h3>
                        <a class="blog-more" href="#">Xem thêm »</a>
                    </div>
                    <!-- Start blog content -->
                    <div class="box-blog-content">
                        <div class="combo-big">
                            <a class="city-tickets" href="#"
                               style="background-image: url('/resources/images/combo1.jpg');">
                                <div class="ticket-relative">
                                    <div class="ticket-info">
                                        <div class="ticket-big-short">
                                            <h3>Combo Du lịch Sapa xuất phát từ Hà Nội - Adam Hotel</h3>
                                            <div class="blog-info">
                                                <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> 04/10/2018</span>
                                                <span class="cfs-12"><i class="fa fa-eye"
                                                                        aria-hidden="true"></i> 59</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </div>
                        <div class="combo-small" style="margin-bottom: 6px;">
                            <a class="city-tickets" href="#"
                               style="background-image: url('/resources/images/combo2.jpg');">
                                <div class="ticket-relative">
                                    <div class="ticket-info">
                                        <div class="ticket-small-short">
                                            <h3>Combo Tour Đà Nẵng xuất phát từ HN/ HCM</h3>
                                            <div class="blog-info">
                                                <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> 04/10/2018</span>
                                                <span class="cfs-12"><i class="fa fa-eye"
                                                                        aria-hidden="true"></i> 59</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </div>
                        <div class="combo-small">
                            <a class="city-tickets" href="#"
                               style="background-image: url('/resources/images/combo3.jpg');">
                                <div class="ticket-relative">
                                    <div class="ticket-info">
                                        <div class="ticket-small-short">
                                            <h3>Combo Du lịch Nha Trang siêu tiết kiệm xuất phát từ HN/HCM</h3>
                                            <div class="blog-info">
                                                <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> 04/10/2018</span>
                                                <span class="cfs-12"><i class="fa fa-eye"
                                                                        aria-hidden="true"></i> 59</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <!-- End blog content -->
                </div>
                <!-- End box 1 -->

                <!-- Start box 2 -->
                <div class="box-blog-left mg-top-20" style="background: white;">
                    <div class="box-blog-title">
                        <h3 class="blog-title">
                            <a href="#">kinh nghiệm du lịch</a>
                        </h3>
                        <a class="blog-more" href="#">Xem thêm »</a>
                    </div>
                    <!-- Start blog content -->
                    <div class="box-blog-content">
                        <div class="combo-big">
                            <a class="city-tickets" href="#"
                               style="background-image: url('/resources/images/combo1.jpg');">
                                <div class="ticket-relative">
                                    <div class="ticket-info">
                                        <div class="ticket-big-short">
                                            <h3>Combo Du lịch Sapa xuất phát từ Hà Nội - Adam Hotel</h3>
                                            <div class="blog-info">
                                                <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> 04/10/2018</span>
                                                <span class="cfs-12"><i class="fa fa-eye"
                                                                        aria-hidden="true"></i> 59</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </div>
                        <div class="combo-small" style="margin-bottom: 6px;">
                            <a class="city-tickets" href="#"
                               style="background-image: url('/resources/images/combo2.jpg');">
                                <div class="ticket-relative">
                                    <div class="ticket-info">
                                        <div class="ticket-small-short">
                                            <h3>Combo Tour Đà Nẵng xuất phát từ HN/ HCM</h3>
                                            <div class="blog-info">
                                                <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> 04/10/2018</span>
                                                <span class="cfs-12"><i class="fa fa-eye"
                                                                        aria-hidden="true"></i> 59</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </div>
                        <div class="combo-small">
                            <a class="city-tickets" href="#"
                               style="background-image: url('/resources/images/combo3.jpg');">
                                <div class="ticket-relative">
                                    <div class="ticket-info">
                                        <div class="ticket-small-short">
                                            <h3>Combo Du lịch Nha Trang siêu tiết kiệm xuất phát từ HN/HCM</h3>
                                            <div class="blog-info">
                                                <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> 04/10/2018</span>
                                                <span class="cfs-12"><i class="fa fa-eye"
                                                                        aria-hidden="true"></i> 59</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <!-- End blog content -->
                </div>
                <!-- End box 2 -->

                <!-- Start box 3 -->
                <div class="box-blog-left mg-top-20" style="background: white;">
                    <div class="box-blog-title">
                        <h3 class="blog-title">
                            <a href="#">ẩm thực</a>
                        </h3>
                        <a class="blog-more" href="#">Xem thêm »</a>
                    </div>
                    <!-- Start blog content -->
                    <div class="box-blog-content">
                        <div class="combo-big">
                            <a class="city-tickets" href="#"
                               style="background-image: url('/resources/images/combo1.jpg');">
                                <div class="ticket-relative">
                                    <div class="ticket-info">
                                        <div class="ticket-big-short">
                                            <h3>Combo Du lịch Sapa xuất phát từ Hà Nội - Adam Hotel</h3>
                                            <div class="blog-info">
                                                <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> 04/10/2018</span>
                                                <span class="cfs-12"><i class="fa fa-eye"
                                                                        aria-hidden="true"></i> 59</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </div>
                        <div class="combo-small" style="margin-bottom: 6px;">
                            <a class="city-tickets" href="#"
                               style="background-image: url('/resources/images/combo2.jpg');">
                                <div class="ticket-relative">
                                    <div class="ticket-info">
                                        <div class="ticket-small-short">
                                            <h3>Combo Tour Đà Nẵng xuất phát từ HN/ HCM</h3>
                                            <div class="blog-info">
                                                <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> 04/10/2018</span>
                                                <span class="cfs-12"><i class="fa fa-eye"
                                                                        aria-hidden="true"></i> 59</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </div>
                        <div class="combo-small">
                            <a class="city-tickets" href="#"
                               style="background-image: url('/resources/images/combo3.jpg');">
                                <div class="ticket-relative">
                                    <div class="ticket-info">
                                        <div class="ticket-small-short">
                                            <h3>Combo Du lịch Nha Trang siêu tiết kiệm xuất phát từ HN/HCM</h3>
                                            <div class="blog-info">
                                                <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> 04/10/2018</span>
                                                <span class="cfs-12"><i class="fa fa-eye"
                                                                        aria-hidden="true"></i> 59</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <!-- End blog content -->
                </div>
                <!-- End box 3 -->

            </div>
            <!-- End Content left -->

            <!-- Start Content Right -->
            <div class="col-lg-4">

                <div class="box-blog-right">
                    <div class="box-blog-title">
                        <h3 class="blog-title">
                            <a href="#">danh mục bài viết</a>
                        </h3>
                    </div>

                    <div class="box-blog-content">
                        <ul>
                            <li class="cat-item">
                                <a href="#">
                                    Điểm du lịch
                                    <span class="category-item-count">(34)</span>
                                </a>
                            </li>
                            <li class="cat-item">
                                <a href="#">
                                    Kinh nghiệm du lịch
                                    <span class="category-item-count">(22)</span>
                                </a>
                            </li>
                            <li class="cat-item">
                                <a href="#">
                                    Ẩm thực
                                    <span class="category-item-count">(75)</span>
                                </a>
                            </li>
                        </ul>
                    </div>

                </div>
                <div class="box-blog-right mg-top-20">
                    <div class="box-blog-title">
                        <h3 class="blog-title">
                            <a href="#">bài viết gần đây</a>
                        </h3>
                        <a class="blog-more" href="#">Xem thêm »</a>
                    </div>
                    <div class="box-blog-content">

                        <article class="blog-post-item">
                            <div class="blog-media-object">
                                <a class="blog-image-holder" href="#">
                                    <img src="/resources/images/combo1.jpg" alt="">
                                </a>
                                <div class="blog-post-content">
                                    <h3 class="blog-post-title cfs-15">
                                        <a href="#">Tổng hợp 11 địa điểm du lịch không thể bỏ qua khi đi Sapa tự túc –
                                            P2</a>
                                    </h3>
                                    <div class="blog-post-meta">
                                        <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> 23/10/2018</span>
                                        <span class="cfs-12"><i class="fa fa-eye" aria-hidden="true"></i> 69</span>
                                    </div>
                                </div>
                            </div>
                        </article>

                        <article class="blog-post-item">
                            <div class="blog-media-object">
                                <a class="blog-image-holder" href="#">
                                    <img src="/resources/images/combo1.jpg" alt="">
                                </a>
                                <div class="blog-post-content">
                                    <h3 class="blog-post-title cfs-15">
                                        <a href="#">Tổng hợp 11 địa điểm du lịch không thể bỏ qua khi đi Sapa tự túc –
                                            P2</a>
                                    </h3>
                                    <div class="blog-post-meta">
                                        <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> 23/10/2018</span>
                                        <span class="cfs-12"><i class="fa fa-eye" aria-hidden="true"></i> 69</span>
                                    </div>
                                </div>
                            </div>
                        </article>

                        <article class="blog-post-item">
                            <div class="blog-media-object">
                                <a class="blog-image-holder" href="#">
                                    <img src="/resources/images/combo1.jpg" alt="">
                                </a>
                                <div class="blog-post-content">
                                    <h3 class="blog-post-title cfs-15">
                                        <a href="#">Tổng hợp 11 địa điểm du lịch không thể bỏ qua khi đi Sapa tự túc –
                                            P2</a>
                                    </h3>
                                    <div class="blog-post-meta">
                                        <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> 23/10/2018</span>
                                        <span class="cfs-12"><i class="fa fa-eye" aria-hidden="true"></i> 69</span>
                                    </div>
                                </div>
                            </div>
                        </article>

                    </div>
                </div>

                <div class="box-blog-right mg-top-20">
                    <div class="box-blog-title">
                        <h3 class="blog-title">
                            <a href="#">xem nhiều</a>
                        </h3>
                        <a class="blog-more" href="#">Xem thêm »</a>
                    </div>
                    <div class="box-blog-content">

                        <article class="blog-post-item">
                            <div class="blog-media-object">
                                <a class="blog-image-holder" href="#">
                                    <img src="/resources/images/combo1.jpg" alt="">
                                </a>
                                <div class="blog-post-content">
                                    <h3 class="blog-post-title cfs-15">
                                        <a href="#">Tổng hợp 11 địa điểm du lịch không thể bỏ qua khi đi Sapa tự túc –
                                            P2</a>
                                    </h3>
                                    <div class="blog-post-meta">
                                        <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> 23/10/2018</span>
                                        <span class="cfs-12"><i class="fa fa-eye" aria-hidden="true"></i> 69</span>
                                    </div>
                                </div>
                            </div>
                        </article>

                        <article class="blog-post-item">
                            <div class="blog-media-object">
                                <a class="blog-image-holder" href="#">
                                    <img src="/resources/images/combo1.jpg" alt="">
                                </a>
                                <div class="blog-post-content">
                                    <h3 class="blog-post-title cfs-15">
                                        <a href="#">Tổng hợp 11 địa điểm du lịch không thể bỏ qua khi đi Sapa tự túc –
                                            P2</a>
                                    </h3>
                                    <div class="blog-post-meta">
                                        <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> 23/10/2018</span>
                                        <span class="cfs-12"><i class="fa fa-eye" aria-hidden="true"></i> 69</span>
                                    </div>
                                </div>
                            </div>
                        </article>

                        <article class="blog-post-item">
                            <div class="blog-media-object">
                                <a class="blog-image-holder" href="#">
                                    <img src="/resources/images/combo1.jpg" alt="">
                                </a>
                                <div class="blog-post-content">
                                    <h3 class="blog-post-title cfs-15">
                                        <a href="#">Tổng hợp 11 địa điểm du lịch không thể bỏ qua khi đi Sapa tự túc –
                                            P2</a>
                                    </h3>
                                    <div class="blog-post-meta">
                                        <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> 23/10/2018</span>
                                        <span class="cfs-12"><i class="fa fa-eye" aria-hidden="true"></i> 69</span>
                                    </div>
                                </div>
                            </div>
                        </article>

                    </div>
                </div>

            </div>
            <!-- End Content Right -->
        </div>
    </section>
    <!-- End Điểm ăn uống -->

</div>
<!-- End Content website -->

<jsp:include page="includes/services.jsp"/>

<jsp:include page="includes/footer.jsp"/>

<!-- Start Import Script -->
<script type="text/javascript" src="js/jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="js/popper/popper.min.js"></script>
<script type="text/javascript" src="js/bootstrap/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="js/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap/util.js"></script>
<!-- End Import Script -->

</body>
</html>
