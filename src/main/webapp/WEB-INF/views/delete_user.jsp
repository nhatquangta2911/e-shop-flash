<%--
  Created by IntelliJ IDEA.
  User: ryan-ta
  Date: 4/22/19
  Time: 1:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete user</title>
</head>
<body>
<form action="/deleteUser" method="post">
    Id: <input type="text" name="userId">
    <input type="submit" value="Delete user">
</form>
</body>
</html>