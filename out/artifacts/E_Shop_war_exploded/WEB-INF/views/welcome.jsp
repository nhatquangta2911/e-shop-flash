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
    <title>Welcome Page</title>
    <style>
        * {
            font-family: sans-serif;
            color: #474747;
        }
        a {
            border: 1px solid forestgreen;
            color: #fff;
            background-color: forestgreen;
            padding: 5px 10px;
            border-radius: 4px;
            text-decoration: none;
        }
    </style>
</head>
<body>
<c:choose>
    <c:when test="${not empty user.getName()}">
        <p>Welcome <span style="color: forestgreen; font-weight: bold;">${user.getName()}</span> to my website!</p><br>
        <a href="/profile">View Profile</a>
        <a href="/logout">Log Out</a>
    </c:when>
    <c:otherwise>
        Please Log In or Register first!
        <br><br>
        <a href="/login">Log In</a>
        <a href="/register">Register</a>
    </c:otherwise>
</c:choose>
</body>
</html>
