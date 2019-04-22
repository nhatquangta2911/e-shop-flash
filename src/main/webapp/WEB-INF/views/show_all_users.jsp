<%--
  Created by IntelliJ IDEA.
  User: ryan-ta
  Date: 4/22/19
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Show all users</title>
</head>
<body>
<table border="1">
    <th>Id</th>
    <th>Full name</th>
    <th>Photo</th>
    <th>Email</th>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.fullName}</td>
            <td>${user.photo}</td>
            <td>${user.email}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>