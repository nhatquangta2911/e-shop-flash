<%--
  Created by IntelliJ IDEA.
  User: ryan-ta
  Date: 4/1/19
  Time: 7:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<html>
<head>
    <title>Welcome</title>
</head>
<body>
<c:choose>
    <c:when test="${not empty username}">
        Chao mung ${username} den voi website cua minh
        <br>
        <a href="/logout">Logout</a>
    </c:when>
    <c:otherwise>
        Vui long dang ky hoac dang nhap
        <br>
        <a href="/register">Dang ky</a>
        <a href="/login">Dang nhap</a>
    </c:otherwise>
</c:choose>
</body>
</html>
