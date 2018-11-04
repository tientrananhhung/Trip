<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Upload File Request Page</title>
    <!-- Bootstrap -->
    <link rel='stylesheet' href='/webjars/bootstrap/3.3.7/css/bootstrap.min.css'>
</head>
<body>
    <div class="container" style="margin-top: 60px;">
        <div class="row">
            <div class="col-md-6">
                <h2>Upload a file...</h2>
                <form:form action="/upload/uploadFile" modelAttribute="product" method="POST" enctype="multipart/form-data">
                    <div class="input-group">
                        <form:input path="name" class="form-control" placeholder="Name"/>
                    </div>
                    <div class="input-group">
                        <form:input path="price" class="form-control" placeholder="Price"/>
                    </div>
                    <div class="input-group">
                        <form:input path="fileData" type="file" class="form-control" multiple="true"/>
                    </div>
                    <br>
                    <button type="submit" class="btn btn-info">Upload</button>
                </form:form>
            </div>
        </div>
    </div>
</body>
</html>
