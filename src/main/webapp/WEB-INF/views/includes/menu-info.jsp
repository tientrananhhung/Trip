<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: T
  Date: 12/2/2018
  Time: 1:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<section class="left-body-info">
    <ul class="menu-left-info pd-0">
        <li class="li-menu-info">
            <a href="/quan-ly/thong-tin">
                <div class="menu-left-item">
                    <i class="fa fa-user fa-fw" aria-hidden="true"></i>
                    <span>Tài khoản</span>
                </div>
            </a>
        </li>
        <c:if test="${userInfo.role == 2}">
            <li class="li-menu-info">
                <a href="/quan-ly/tour">
                    <div class="menu-left-item">
                        <i class="fa fa-check-square fa-fw" aria-hidden="true"></i>
                        <span>Quản lý tour</span>
                    </div>
                </a>
            </li>
        </c:if>
        <c:if test="${userInfo.role == 2}">
            <li class="li-menu-info">
                <a href="/quan-ly/bai-viet">
                    <div class="menu-left-item">
                        <i class="fa fa-check-square fa-fw" aria-hidden="true"></i>
                        <span>Quản lý bài viết</span>
                    </div>
                </a>
            </li>
            <li class="li-menu-info">
                <a href="/quan-ly/bai-viet-da-xoa">
                    <div class="menu-left-item">
                        <i class="fa fa-check-square fa-fw" aria-hidden="true"></i>
                        <span>Quản lý bài viết đã xóa</span>
                    </div>
                </a>
            </li>
            <li class="li-menu-info">
                <a href="/quan-ly/don-hang-doi-tac">
                    <div class="menu-left-item">
                        <i class="fa fa-check-square fa-fw" aria-hidden="true"></i>
                        <span>Đơn hàng đối tác</span>
                    </div>
                </a>
            </li>
            <li class="li-menu-info">
                <a href="/quan-ly/don-hang-doi-tac-da-thanh-toan">
                    <div class="menu-left-item">
                        <i class="fa fa-check-square fa-fw" aria-hidden="true"></i>
                        <span>Đơn hàng đối tác đã thanh toán</span>
                    </div>
                </a>
            </li>
            <li class="li-menu-info">
                <a href="/quan-ly/don-hang-doi-tac-da-huy">
                    <div class="menu-left-item">
                        <i class="fa fa-check-square fa-fw" aria-hidden="true"></i>
                        <span>Đơn hàng đối tác đã hủy</span>
                    </div>
                </a>
            </li>
            <li class="li-menu-info">
                <a href="/quan-ly/don-hang-doi-tac-da-thanh-toan">
                    <div class="menu-left-item">
                        <i class="fa fa-check-square fa-fw" aria-hidden="true"></i>
                        <span>Quản lý đơn hàng đối tác</span>
                    </div>
                </a>
            </li>
        </c:if>
        <li class="li-menu-info">
            <a href="/quan-ly/don-hang">
                <div class="menu-left-item">
                    <i class="fa fa-check-square fa-fw" aria-hidden="true"></i>
                    <span>Đơn hàng chờ thanh toán</span>
                </div>
            </a>
        </li>
        <li class="li-menu-info">
            <a href="/quan-ly/don-hang-da-thanh-toan">
                <div class="menu-left-item">
                    <i class="fa fa-check-square fa-fw" aria-hidden="true"></i>
                    <span>Đơn hàng đã thanh toán</span>
                </div>
            </a>
        </li>
        <li class="li-menu-info">
            <a href="/quan-ly/don-hang-da-huy">
                <div class="menu-left-item">
                    <i class="fa fa-check-square fa-fw" aria-hidden="true"></i>
                    <span>Đơn hàng đã hủy</span>
                </div>
            </a>
        </li>
        <li class="li-menu-info">
            <a href="/dang-xuat/">
                <div class="menu-left-item">
                    <i class="fa fa-check-square fa-fw" aria-hidden="true"></i>
                    <span>Đăng xuất</span>
                </div>
            </a>
        </li>
    </ul>
</section>