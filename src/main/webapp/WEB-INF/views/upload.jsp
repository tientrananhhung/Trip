<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>Bootstrap Upload Control Template | PrepBootstrap</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/dropify/dist/css/dropify.min.css" />">
    <script type="text/javascript" src="/resources/js/jquery/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="/resources/js/bootstrap/bootstrap.min.js"></script>
</head>
<body>

<div class="container">

    <div class="page-header">
        <h1>Website up ảnh Smarttrip</h1>
    </div>

    <div class="container">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <f:form method="post" enctype="multipart/form-data">
                    <input accept="image/*" path="fileData"  type="file" class="dropify" multiple="multiple" />
                    <input type="submit" value="Upload Files" class="btn btn-lg btn-primary" />

            </f:form>
        </div>
        <div class="col-md-4"></div>
    </div>
</div>
<script src="<c:url value="/resources/node_modules/dropify/dist/js/dropify.min.js" />"></script>
<script src="<c:url value="/resources/js/dropify.js"/>"></script>
</body>
</html>