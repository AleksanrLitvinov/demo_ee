<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - TEST</title>
</head>
<body>
    <h1>
        Testing JSP
    </h1>
<p>
    <%@page import="java.util.Date, ru.maxima.TestClass" %>
    <% TestClass testClass = new TestClass(); %>

    <%= testClass.getInfo() %>
    <br>
    <%=new Date() %>
</p>
</body>
</html>
