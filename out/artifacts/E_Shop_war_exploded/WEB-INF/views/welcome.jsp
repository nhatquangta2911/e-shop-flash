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
            margin-bottom: 20px;
        }

        .wrapper {
            display: flex;
            flex-wrap: wrap;
        }

        .my-btn {
            width: 150px;
            margin: 20px 0;
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
        <div class="wrapper">
            <div class="my-btn">
                <a href="/login">Log In</a>
            </div>
            <div class="my-btn">
                <a href="/register">Register</a>
            </div>
            <div class="my-btn">
                <a href="/getAllUsers">Show All Users</a>
            </div>
            <div class="my-btn">
                <a href="/getUser">Show User</a>
            </div>
            <div class="my-btn">
                <a href="/addUser">Add User</a>
            </div>
            <div class="my-btn">
                <a href="/deleteUser">Delete User</a>
            </div>
        </div>
    </c:otherwise>
</c:choose>
</body>
</html>
