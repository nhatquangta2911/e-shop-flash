<%--
  Created by IntelliJ IDEA.
  User: ryan-ta
  Date: 4/22/19
  Time: 1:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get user</title>
</head>
<body>
<form action="/getUser" method="post">
    Id: <input type="text" name="userId">
    <input type="submit" value="Get user">
</form>
</body>
</html>
