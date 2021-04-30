<%--
  Created by IntelliJ IDEA.
  User: Sunflower
  Date: 2021/4/25
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<%--  http://localhost:8080/WebBook_war_exploded/--%>
<form action="http://localhost:8080/WebBook_war_exploded/new" method="get">
    <input type="submit" value="doGet">
</form>
<form action="http://localhost:8080/WebBook_war_exploded/new" method="post">
    <input type="submit" value="doPost">
</form>
</body>
</html>
