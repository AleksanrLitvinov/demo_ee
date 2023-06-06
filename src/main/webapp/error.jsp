<%--
  Created by IntelliJ IDEA.
  User: Zebra
  Date: 06.06.2023
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%--       Создать 3 сервлета, как на уроке с выдачей кукис, печатью кукис и удалением.--%>
<%--        Обработать ошибку , если кукис нет, выдавать html-страницу с информацией о том,--%>
<%--        что у вас кукис нет, нажмите, чтобы получить и выдавать ссылку на получение кукис,--%>
<%--        которая будет вести на страницу http://localhost:8080/get-cookies-servlet--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
</head>
<body>
      <a href="/set-cookies-servlet">Получить куки</a>

</body>
</html>
