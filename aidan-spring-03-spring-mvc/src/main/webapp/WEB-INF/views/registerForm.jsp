<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ page session="false" %>
<%@ page pageEncoding="utf-8" %>

<html>
<head>
    <title>Spittr</title>
    <style type="text/css">
        span.error {
            color: red;
        }

        div.errors {
            background-color: #ffcccc;
            border: 2px solid red;
        }

        label.error {
            color: blue;
        }

        input.error {
            color: blue;
        }
    </style>
</head>
<body>
<h1>Register</h1>
<sf:form method="post" action="/spitter/register" commandName="spitter">
    <sf:errors path="*" element="div" cssClass="errors"/>

    <sf:label path="firstName" cssErrorClass="error">First Name:</sf:label>
    <sf:input path="firstName" cssErrorClass="error"/>
    <br/>
    <sf:label path="lastName" cssErrorClass="error">Last Name:</sf:label>
    <sf:input path="lastName" cssErrorClass="error"/>
    <br/>
    <sf:label path="username" cssErrorClass="error">Username:</sf:label>
    <sf:input path="username" cssErrorClass="error"/>
    <br/>
    <sf:label path="password" cssErrorClass="error">Password:</sf:label>
    <sf:password path="password" cssErrorClass="error"/>
    <br/>
    <input type="submit" value="Register"/>
</sf:form>
</body>
</html>
