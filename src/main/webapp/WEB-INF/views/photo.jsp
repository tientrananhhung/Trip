<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="c" uri=""%>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show uploaded photos</title>
</head>
<body>
<c:forEach var="photo" items="${imgPathList}">
    <img src="${photo}" style="max-width: 50%; max-height: 50%">
</c:forEach>

</body>
</html>
