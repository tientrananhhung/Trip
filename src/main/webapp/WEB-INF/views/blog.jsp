<%--
  Created by IntelliJ IDEA.
  User: Tien Tran
  Date: 11/2/2018
  Time: 7:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

            <c:forEach items="${listPost}" var="lPost" varStatus="lPostCount">
                <c:choose>
                    <c:when test="${lPostCount.count == 1}">
                        <div class="post-big">
                            <a class="city-tickets" href="#" style="background-image: url('/resources/images/${lPost.image}');">
                                <div class="ticket-relative">
                                    <div class="ticket-info">
                                        <div class="ticket-big-short">
                                            <h3>${lPost.title}</h3>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </c:when>
                    <c:otherwise>
                        <div class="post-small" style="border-bottom: 5px solid white;">
                            <a class="city-tickets" href="#" style="background-image: url('/resources/images/${lPost.image}');">
                                <div class="ticket-relative">
                                    <div class="ticket-info">
                                        <div class="ticket-small-short">
                                            <h3>${lPost.title}</h3>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </c:otherwise>
                </c:choose>
            </c:forEach>


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

                        <c:forEach items="${listPostTravel}" var="lPost" varStatus="lPostCount">
                            <c:choose>
                                <c:when test="${lPostCount.count == 1}">
                                    <div class="combo-big">
                                        <a class="city-tickets" href="#"
                                           style="background-image: url('/resources/images/${lPost.image}');">
                                            <div class="ticket-relative">
                                                <div class="ticket-info">
                                                    <div class="ticket-big-short">
                                                        <h3>${lPost.title}</h3>
                                                        <div class="blog-info">
                                                            <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> ${lPost.updatedAt}</span>
                                                            <span class="cfs-12"><i class="fa fa-eye"
                                                                                    aria-hidden="true"></i> ${lPost.view}</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </a>
                                    </div>
                                </c:when>
                                <c:otherwise>
                                    <div class="combo-small" style="margin-bottom: 6px;">
                                        <a class="city-tickets" href="#"
                                           style="background-image: url('/resources/images/${lPost.image}');">
                                            <div class="ticket-relative">
                                                <div class="ticket-info">
                                                    <div class="ticket-small-short">
                                                        <h3>${lPost.title}</h3>
                                                        <div class="blog-info">
                                                            <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> ${lPost.updatedAt}</span>
                                                            <span class="cfs-12"><i class="fa fa-eye"
                                                                                    aria-hidden="true"></i> ${lPost.view}</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </a>
                                    </div>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>

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

                        <c:forEach items="${listPostExperience}" var="lPost" varStatus="lPostCount">
                            <c:choose>
                                <c:when test="${lPostCount.count == 1}">
                                    <div class="combo-big">
                                        <a class="city-tickets" href="#"
                                           style="background-image: url('/resources/images/${lPost.image}');">
                                            <div class="ticket-relative">
                                                <div class="ticket-info">
                                                    <div class="ticket-big-short">
                                                        <h3>${lPost.title}</h3>
                                                        <div class="blog-info">
                                                            <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> ${lPost.updatedAt}</span>
                                                            <span class="cfs-12"><i class="fa fa-eye"
                                                                                    aria-hidden="true"></i> ${lPost.view}</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </a>
                                    </div>
                                </c:when>
                                <c:otherwise>
                                    <div class="combo-small" style="margin-bottom: 6px;">
                                        <a class="city-tickets" href="#"
                                           style="background-image: url('/resources/images/${lPost.image}');">
                                            <div class="ticket-relative">
                                                <div class="ticket-info">
                                                    <div class="ticket-small-short">
                                                        <h3>${lPost.title}</h3>
                                                        <div class="blog-info">
                                                            <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> ${lPost.updatedAt}</span>
                                                            <span class="cfs-12"><i class="fa fa-eye"
                                                                                    aria-hidden="true"></i> ${lPost.view}</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </a>
                                    </div>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>


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

                        <c:forEach var="lPost" items="${listPostFood}" varStatus="lPostCount">
                            <c:choose>
                                <c:when test="${lPostCount.count == 1}">
                                    <div class="combo-big">
                                        <a class="city-tickets" href="#"
                                           style="background-image: url('/resources/images/${lPost.image}');">
                                            <div class="ticket-relative">
                                                <div class="ticket-info">
                                                    <div class="ticket-big-short">
                                                        <h3>${lPost.title}</h3>
                                                        <div class="blog-info">
                                                            <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> ${lPost.updatedAt}</span>
                                                            <span class="cfs-12"><i class="fa fa-eye"
                                                                                    aria-hidden="true"></i> ${lPost.view}</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </a>
                                    </div>
                                </c:when>
                                <c:otherwise>
                                    <div class="combo-small" style="margin-bottom: 6px;">
                                        <a class="city-tickets" href="#"
                                           style="background-image: url('/resources/images/${lPost.image}');">
                                            <div class="ticket-relative">
                                                <div class="ticket-info">
                                                    <div class="ticket-small-short">
                                                        <h3>${lPost.title}</h3>
                                                        <div class="blog-info">
                                                            <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> ${lPost.updatedAt}</span>
                                                            <span class="cfs-12"><i class="fa fa-eye"
                                                                                    aria-hidden="true"></i> ${lPost.view}</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </a>
                                    </div>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>


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
                        <c:forEach items="${listPost}" var="lPosst" end="2">
                            <article class="blog-post-item">
                                <div class="blog-media-object">
                                    <a class="blog-image-holder" href="#">
                                        <img src="/resources/images/${lPosst.image}" alt="">
                                    </a>
                                    <div class="blog-post-content">
                                        <h3 class="blog-post-title cfs-15">
                                            <a href="#">${lPosst.title}</a>
                                        </h3>
                                        <div class="blog-post-description cfs-12">
                                            ${lPosst.content}
                                        </div>
                                        <div class="blog-post-meta">
                                            <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> ${lPosst.updatedAt}</span>
                                            <span class="cfs-12"><i class="fa fa-eye" aria-hidden="true"></i> ${lPosst.view}</span>
                                        </div>
                                    </div>
                                </div>
                            </article>
                        </c:forEach>

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

                        <c:forEach items="${listPostView}" var="lPost">
                            <article class="blog-post-item">
                                <div class="blog-media-object">
                                    <a class="blog-image-holder" href="#">
                                        <img src="/resources/images/${lPost.image}" alt="">
                                    </a>
                                    <div class="blog-post-content">
                                        <h3 class="blog-post-title cfs-15">
                                            <a href="#">${lPost.title}</a>
                                        </h3>
                                        <div class="blog-post-description cfs-12">
                                            ${lPost.content}
                                        </div>
                                        <div class="blog-post-meta">
                                            <span class="cfs-12"><i class="fa fa-clock-o" aria-hidden="true"></i> ${lPost.updatedAt}</span>
                                            <span class="cfs-12"><i class="fa fa-eye" aria-hidden="true"></i> ${lPost.view}</span>
                                        </div>
                                    </div>
                                </div>
                            </article>
                        </c:forEach>

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
<script type="text/javascript" src="/resources/js/jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/resources/js/popper/popper.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap/util.js"></script>
<script type="text/javascript" src="/resources/js/custom.js"></script>
<!-- End Import Script -->

<!-- Start custom script-->
<script>
    $(document).ready(function () {

        navbarSubMenu();

    });
</script>
<!-- End custom script-->

</body>
</html>
