<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<c:set var="baseURL" value="${pageContext.request.serverName}"/>
<html>
<head>
    <meta charset="utf-8" />
    <title>Bootstrap Upload Control Template | PrepBootstrap</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/dropify/dist/css/dropify.min.css" />">
    <script type="text/javascript" src="/resources/js/jquery/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="/resources/js/bootstrap/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/resources/css/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/css/style.css">
    <link rel="stylesheet" href="/resources/node_modules/mdi/css/materialdesignicons.min.css">
    <script src="/resources/js/clipboard.min.js"></script>
</head>
<body style="background: none;">

<div class="container-fluid">
        <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8">
            <div class="page-header">
                <h1>Website up ảnh Smarttrip</h1>
                <f:form action="/upload/uploadFile" modelAttribute="product" method="POST" enctype="multipart/form-data">
                    <f:input accept="image/*" path="fileData"  type="file" class="dropify" multiple="multiple" />
                    <input style="text-align: right; margin-top: 20px;" type="submit" value="Upload Files" class="btn btn-lg btn-primary" />
                </f:form>
            </div>

        </div>
        <div class="col-md-2"></div>
        </div>
        <div class="row" style="margin-top: 10px;">
            <div class="col-md-2"></div>
            <div class="col-md-8">
              <c:forEach var="item" varStatus="i" items="${listImg}">
                  <img style="width: 100%"  src="/resources/images/${item}">
                  <div style="margin-top: 10px;">
                      <p>Link ảnh: <a href="http://localhost:8080/resources/images/${item}" target="_blank" id="foo${i.count}">http://localhost:8080/resources/images/${item}</a>
                      <button class="btn1 btn-info icon-btn"  data-clipboard-target="#foo${i.count}">
                          <i class="mdi mdi-content-paste"></i>
                      </button>
                      </p>
                  </div>
              </c:forEach>
            </div>
            <div class="col-md-2"></div>
        </div>
</div>
<script>
    new ClipboardJS('.btn1');
</script>
<script type="text/javascript" src="/resources/js/jquery/jquery-3.3.1.min.js"></script>
<script src="<c:url value="/resources/node_modules/dropify/dist/js/dropify.min.js" />"></script>
<script src="<c:url value="/resources/js/dropify.js"/>"></script>

</body>
</html>