<!DOCTYPE html>
<%@ page pageEncoding="utf-8" %>
<html>
<head>
    <meta charset="utf-8">
</head>
<body>
<form action="/login" method="POST" enctype="application/x-www-form-urlencoded">
    <%--<form action="/login" method="post" enctype="multipart/form-data">--%>
    <%--<form action="/login" method="post" enctype="text/plain">--%>
    <%--<form action="/login" method="post" enctype="application/json">--%>
    用户名：<input type="text" name="user" value=""/>
    <br>
    密码：<input type="password" name="password" value="">
    <br>
    爱好:<input type="checkbox" name="interest" value="1">阅读
    <input type="checkbox" name="interest" value="2">看电影
    <input type="checkbox" name="interest" value="3">听音乐
    <br>
    <input type="submit" value="登录">
</form>
</body>
</html>
