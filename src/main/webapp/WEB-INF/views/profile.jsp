<%--
  Created by IntelliJ IDEA.
  User: ryan-ta
  Date: 4/12/19
  Time: 2:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Profile</title>
    <style>
        * {
            font-family: sans-serif;
            color: #474747;
        }
        .info {
            color: forestgreen;
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
    <h2 style="color: forestgreen">My Profile</h2>
    <table width="400px">
        <tr>
            <td>Name</td>
            <td class="info">${user.getName()}</td>
        </tr>
        <tr>
            <td>Email</td>
            <td class="info">${user.getEmail()}</td>
        </tr>
        <tr>
            <td>Phone</td>
            <td class="info">${user.getPhoneNumber()}</td>
        </tr>
        <tr>
            <td>Gender</td>
            <td class="info">${(user.getGender() == "M") ? "Male" : "Female"}</td>
        </tr>
    </table>
    <br>
    <a href="/welcome">Back</a>
</body>
</html>
