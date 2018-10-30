<%--
  Created by IntelliJ IDEA.
  User: T
  Date: 10/28/2018
  Time: 7:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="kendo" uri="http://www.kendoui.com/jsp/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="k" tagdir="/WEB-INF/tags" %>
<html>
<head>
    <title>Test</title>
    <k:header/>
</head>
<body>
<div class="demo-section k-content">
    <h4>Show e-mails from:</h4>
    <kendo:datePicker name="datepicker" format="dd/MM/yyyy" value="${date}" style="width:100%" title="datepicker"></kendo:datePicker>
    <h4 style="margin-top: 2em;">Add to archive mail from:</h4>
    <kendo:datePicker name="monthpicker" title="monthpicker" dateInput="true" value="${month}" start="year" depth="year"
                      format="MMMM yyyy" style="width:100%">
    </kendo:datePicker>
</div>
<k:footer/>
</body>
</html>
