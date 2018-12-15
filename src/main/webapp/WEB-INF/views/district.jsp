<%--
  Created by IntelliJ IDEA.
  User: T
  Date: 11/2/2018
  Time: 7:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Category Blog - Smart Trip</title>
    <!-- Icon -->
    <link rel="icon" href="/resources/images/favicon.ico">
    <!-- Bootstrap css -->
    <link rel="stylesheet" href="/resources/css/bootstrap/bootstrap.min.css">
    <!-- Star rating -->
    <link rel="stylesheet" href="/resources/css/starrating/fontawesome-stars-o.css">
    <!-- Fontawesome -->
    <link rel="stylesheet" href="/resources/css/fontawesome/font-awesome.min.css">
    <!-- Popup form login style -->
    <link rel="stylesheet" href="/resources/css/popupform/style.css">
    <!-- My css -->
    <link rel="stylesheet" href="/resources/css/custom.css">
</head>
<body style="background: #eee;">

<jsp:include page="includes/navbar.jsp"/>

<jsp:include page="includes/form-navbar.jsp"/>

<!-- Start điểm du lịch -->
<section class="box-content-fluid mg-top-20">
    <div class="box-body">
        <c:forEach items="${lTop5FoodD}" var="lFoodTop5" varStatus="lFoodCount">
            <c:choose>
                <c:when test="${lFoodCount.count == 1}">
                    <div class="post-big">
                        <a class="city-tickets" href="/food/${lFoodTop5.piid}" style="background-image: url('/resources/images/${lFoodTop5.piimage}');">
                            <div class="ticket-relative">
                                <div class="ticket-info">
                                    <div class="ticket-big-short">
                                        <h3>${lFoodTop5.piname}</h3>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                </c:when>
                <c:otherwise>
                    <div class="post-small" style="border-bottom: 5px solid white;">
                        <a class="city-tickets" href="/food/${lFoodTop5.piid}" style="background-image: url('/resources/images/${lFoodTop5.piimage}');">
                            <div class="ticket-relative">
                                <div class="ticket-info">
                                    <div class="ticket-small-short">
                                        <h3>${lFoodTop5.piname}</h3>
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


<section class="box-content-fluid mg-top-20">
    <div class="row">
        <!-- Start Content left -->
        <div class="col-lg-8">
            <!-- Start box 1 -->
            <div class="box-blog-left">
                <div class="box-blog-title">
                    <h3 class="blog-title"><a href="#">Danh sách ẩm thực trong quận</a></h3>
                </div>
                <!-- Start blog content -->
                <div class="box-blog-content">
                    <c:forEach items="${lFoodD}" var="lFoodD">
                        <article class="category-post-item">
                            <div class="article-content">
                                <div class="entry-media-img">
                                    <a href="/food/${lFoodD.piid}" class="penci-link-post penci-image-holder penci-lazy"
                                       style="display: block; background-image: url('/resources/images/${lFoodD.piimage}'); max-height: 200px;"></a>
                                </div>
                                <div class="entry-media-text">
                                    <header class="entry-header">
                                        <h2 class="entry-title">
                                            <a href="/food/${lFoodD.piid}">${lFoodD.piname}</a>
                                        </h2>
                                        <div class="entry-meta">
                                            <h4>${lFoodD.piname}</h4>
                                            <span class="entry-meta-item penci-posted-on">
                                                <i class="fa fa-clock-o" aria-hidden="true"></i>
                                                <span>${lFoodD.fopentime}</span>
                                            </span>
                                            <span class="entry-meta-item penci-post-countview">
                                                <i class="fa fa-eye" aria-hidden="true"></i>
                                                <span>${lFoodD.piaddress}</span>
                                            </span>
                                        </div>
                                    </header>
                                </div>
                            </div>
                        </article>
                    </c:forEach>
                </div>
                <div class="center mg-top-10">
                    <nav aria-label="navigation" style="overflow: hidden; display: inline-block;">
                        <ul class="pagination">
                            <li class="page-item disabled">
                                <a class="page-link" href="#">
                                    <i class="fa fa-angle-left" aria-hidden="true"></i>
                                </a>
                            </li>
                            <li class="page-item active">
                                <a class="page-link" href="#">1</a>
                            </li>
                            <li class="page-item">
                                <a class="page-link" href="#">2</a>
                            </li>
                            <li class="page-item">
                                <a class="page-link" href="#">
                                    <i class="fa fa-angle-right" aria-hidden="true"></i>
                                </a>
                            </li>
                        </ul>
                    </nav>
                </div>
                <!-- End blog content -->
            </div>
            <!-- End box 1 -->
        </div>
        <!-- End Content left -->
        <!-- Start Content Right -->
        <div class="col-lg-4">
            <div class="box-blog-right">
                <div class="box-blog-title">
                    <h3 class="blog-title">
                        <a href="#">danh sách quận</a>
                    </h3>
                </div>
                <div class="box-blog-content">
                    <ul>
                        <c:forEach items="${lDistrict}" var="listDistrict">
                            <li class="cat-item">
                                <a href="/${listDistrict.id}/district">
                                        ${listDistrict.name}
                                </a>
                                <span class="category-item-count">34</span>
                            </li>
                        </c:forEach>
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
                    <c:forEach items="${listPost}" var="lPostFood">
                        <article class="blog-post-item">
                            <div class="blog-media-object">
                                <a class="blog-image-holder" href="/blog/${lPostFood.id}">
                                    <img src="/resources/images/${lPostFood.image}" alt="">
                                </a>
                                <div class="blog-post-content">
                                    <h3 class="blog-post-title cfs-15">
                                        <a href="/blog/${lPostFood.id}">${lPostFood.title}</a>
                                    </h3>
                                    <div class="blog-post-meta">
                                    <span class="cfs-12"><i class="fa fa-clock-o"
                                                            aria-hidden="true"></i>${lPostFood.updatedAt}</span>
                                        <span class="cfs-12"><i class="fa fa-eye" aria-hidden="true"></i>${lPostFood.view}</span>
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
