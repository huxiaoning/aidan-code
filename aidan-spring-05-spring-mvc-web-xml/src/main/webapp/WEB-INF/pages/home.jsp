<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
hello spring

<form action="/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="profilePicture" accept="image/jpeg,image/png,image/gif">
    <input type="submit" value="Submit">
</form>
</body>
</html>
