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
        <a class="navbar-brand" href="/">
            <img src="/resources/images/logo.png" alt="" style="height: 65px;">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
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
                <a href="/doitac/dangky" class="nav-item menu-item">
                    <li class="nav-link">Trở thành đối tác</li>
                </a>
                <c:if test="${userInfo == null}">
                    <a href="/dang-nhap" class="nav-item menu-item">
                        <li class="nav-link">Đăng nhập</li>
                    </a>
                    <a href="/dang-ky" class="nav-item menu-item">
                        <li class="nav-link">Đăng ký</li>
                    </a>
                </c:if>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Tìm kiếm..." aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0 btn-custom-org" type="submit">Tìm kiếm</button>
            </form>
<c:if test="${userInfo != null}">
    <ul class="navbar-nav flex-row d-none d-md-flex cnav-mb nav-info-user">
        <li class="menu-item li-user-info">
            <a class="nav-item">
                <img src="/resources/images/avatar.png" alt="" class="img-avt rounded-circle">
            </a>
            <ul class="menu-dropdown-menu">
                <li class="menu-dropdown-menu-item">
                    <a href="/quan-ly/thong-tin">
                        <div class="dropdown-menu-item">
                            <i class="fa fa-user fa-fw " aria-hidden="true"></i>
                            <span>Tài khoản</span>
                        </div>
                    </a>
                </li>
               <c:if test="${userInfo.role == 2}">
                   <li class="menu-dropdown-menu-item">
                       <a href="/quan-ly/tour">
                           <div class="dropdown-menu-item">
                               <i class="fa fa-check-square fa-fw" aria-hidden="true"></i>
                               <span>Quản lý tour</span>
                           </div>
                       </a>
                   </li>
               </c:if>
                <li class="menu-dropdown-menu-item">
                    <a href="/quan-ly/don-hang">
                        <div class="dropdown-menu-item">
                            <i class="fa fa-check-square fa-fw" aria-hidden="true"></i>
                            <span>Quản lý đơn hàng</span>
                        </div>
                    </a>
                </li>
                <li class="menu-dropdown-menu-item">
                    <a href="/dang-xuat">
                        <div class="dropdown-menu-item">
                            <i class="fa fa-spinner fa-fw" aria-hidden="true"></i>
                            <span>Đăng xuất</span>
                        </div>
                    </a>
                </li>
            </ul>
        </li>
    </ul>
</c:if>
        </div>
    </div>
</nav>
<!-- Forgot Form End -->
<!-- End Navbar Menu -->