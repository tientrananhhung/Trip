<%--
  Created by IntelliJ IDEA.
  User: kuminhdey
  Date: 10/27/2018
  Time: 3:46 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
    <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
        <a class="navbar-brand brand-logo" href="/admin"><img src="<c:url value="/resources/images/logo_admin.png"/>" style="width: 150px; height: 100%;"  alt="Smarttrip"></a>
        <a class="navbar-brand brand-logo-mini" href="/admin"><img src="<c:url value="/resources/images/logo_admin1.jpg"/>" alt="S"></a>
    </div>
    <div class="navbar-menu-wrapper d-flex align-items-stretch">
        <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
            <span class="mdi mdi-equal"></span>
        </button>
        <form class="form-inline d-none d-lg-block search my-auto">
            <div class="input-group">
                <input type="text" class="form-control" placeholder="Search here...">
                <div class="input-group-append">
                    <i class="mdi mdi-magnify"></i>
                </div>
            </div>
        </form>
        <ul class="navbar-nav navbar-nav-right">

            <li class="nav-item dropdown">
                <a class="nav-link count-indicator dropdown-toggle" id="notificationDropdown" href="#" data-toggle="dropdown" aria-expanded="false">
                    <i class="mdi mdi-bell-outline"></i>
                    <span class="count"></span>
                </a>
                <div class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list" aria-labelledby="notificationDropdown">
                    <h6 class="p-3 mb-0 bg-white">Notifications</h6>
                    <a class="dropdown-item preview-item">
                        <div class="preview-thumbnail">
                            <div class="preview-icon bg-success">
                                <i class="mdi mdi-calendar"></i>
                            </div>
                        </div>
                        <div class="preview-item-content">
                            <p class="text-small text-muted text-right mb-0">4:10 PM</p>
                            <p class="preview-subject">Event today</p>
                            <p class="text-muted text-small ellipsis">
                                Just a reminder that you have an event today
                            </p>
                        </div>
                    </a>
                    <a class="dropdown-item preview-item">
                        <div class="preview-thumbnail">
                            <div class="preview-icon bg-warning">
                                <i class="mdi mdi-settings"></i>
                            </div>
                        </div>
                        <div class="preview-item-content">
                            <p class="text-small text-muted text-right mb-0">4:10 PM</p>
                            <p class="preview-subject">Settings</p>
                            <p class="text-muted text-small ellipsis">
                                Update dashboard
                            </p>
                        </div>
                    </a>
                    <h6 class="p-3 mb-0 text-center bg-white">See all notifications</h6>
                </div>
            </li>


            <li class="nav-item nav-item-highlight">
                <a class="nav-link" href="/dang-xuat/">
                    <i class="mdi mdi-logout"></i>
                </a>
            </li>
        </ul>
        <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="offcanvas">
            <span class="mdi mdi-equal"></span>
        </button>
    </div>
</nav>
