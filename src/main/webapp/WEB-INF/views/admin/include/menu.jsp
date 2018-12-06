<%--
  Created by IntelliJ IDEA.
  User: kuminhdey
  Date: 10/27/2018
  Time: 3:47 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="sidebar sidebar-offcanvas" id="sidebar">
    <ul class="nav">
        <li class="nav-item nav-profile">
              <span class="nav-link" href="#">
                <div class="profile-image online">
                  <img src="<c:url value="/resources/images/${userInfo.avatar}"/> ">
                </div>
                <p>
                  ${userInfo.name}
                </p>
                <p>
                    ${userInfo.email}
                </p>
                <div class="d-flex justify-content-center mt-4 mb-2">
                  <i class="mdi mdi-gmail mr-3"></i>
                  <i class="mdi mdi-account"></i>
                </div>
              </span>
        </li>
        <li class="nav-item nav-category">
            <span class="nav-link">Main</span>
        </li>
        <li class="nav-item active">
            <a class="nav-link" href="/admin/">
                <i class="mdi mdi-compass-outline menu-icon"></i>
                <span class="menu-title">Dashboard</span>
            </a>
        </li>

        <li class="nav-item">
            <a class="nav-link" href="/admin/quan-ly-nguoi-dung">
                <i class="mdi mdi-account" data-name="mdi-account" style="margin-right: 20px;"></i>
                <span class="menu-title">Quản lý người dùng</span>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/admin/quan-ly-tour">
                <i class="mdi mdi-bus" data-name="mdi-bus" style="margin-right: 20px;"></i>
                <span class="menu-title">Quản lý tour</span>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/admin/quan-ly-doi-tac">
                <i class="mdi mdi-account-multiple" data-name="mdi-account-multiple" style="margin-right: 20px;"></i>
                <span class="menu-title">Quản lý đối tác</span>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/admin/quan-ly-dia-diem">
                <i class="mdi mdi-map-marker-radius" data-name="mdi-map-marker-radius" style="margin-right: 20px;"></i>
                <span class="menu-title">Quản lý địa điểm</span>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/admin/quan-ly-quan">
                <i class="mdi mdi-google-maps" data-name="mdi-google-maps" style="margin-right: 20px;"></i>
                <span class="menu-title">Quản lý quận</span>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/admin/quan-ly-danh-muc-bai-viet">
                <i class="mdi mdi-book-multiple" data-name="mdi-book-multiple" style="margin-right: 20px;"></i>
                <span class="menu-title">Q.lý danh mục bài viết</span>
            </a>
        </li><li class="nav-item">
        <a class="nav-link" href="/admin/quan-ly-danh-muc-dia-diem">
            <i class="mdi mdi-map-marker-multiple" data-name="mdi-map-marker-multiple" style="margin-right: 20px;"></i>
            <span class="menu-title">Q.lý danh mục địa điểm</span>
        </a>
    </li>
        <li class="nav-item">
            <a class="nav-link" href="pages/widgets.html">
                <i class="mdi mdi-home" data-name="mdi-home" style="margin-right: 20px;"></i>
                <span class="menu-title">Quản lý trang chủ</span>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/admin/quan-ly-uu-dai">
                <i class="mdi mdi-star" data-name="mdi-star" style="margin-right: 20px;"></i>
                <span class="menu-title">Quản lý ưu đãi</span>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/admin/quan-ly-bai-viet">
                <i class="mdi mdi-book-variant" data-name="mdi-book-variant" style="margin-right: 20px;"></i>
                <span class="menu-title">Quản lý bài viết</span>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/admin/quan-ly-hoa-don">
                <i class="mdi mdi-cart-outline"></i>
                <span class="menu-title">Quản lý hóa đơn</span>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link collapsed" data-toggle="collapse" href="#page-layouts" aria-expanded="false" aria-controls="page-layouts">
                <i class="mdi mdi-chart-histogram" data-name="mdi-chart-histogram" style="margin-right: 20px;"></i>
                <span class="menu-title">Thống kê</span>
                <i class="mdi mdi-chevron-right menu-arrow"></i>
            </a>
            <div class="collapse" id="page-layouts" style="">
                <ul class="nav flex-column sub-menu">
                    <li class="nav-item"> <a class="nav-link" href="pages/layout/boxed-layout.html">Thống kê tổng</a></li>
                    <li class="nav-item"> <a class="nav-link" href="pages/layout/rtl-layout.html">RTL</a></li>
                    <li class="nav-item"> <a class="nav-link" href="pages/layout/horizontal-menu.html">Horizontal Menu</a></li>
                </ul>
            </div>
        </li>
























    </ul>
</nav>