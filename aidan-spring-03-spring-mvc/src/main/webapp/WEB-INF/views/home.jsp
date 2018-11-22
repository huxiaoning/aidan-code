<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Spittr</title>
</head>
<body>
<h1><s:message code="spittr.welcome"/></h1>
<a href="<c:url value="/spittles"/>">Spittles</a>
<a href="<c:url value="/spitter/register"/>">Register</a>
</body>
</html>
