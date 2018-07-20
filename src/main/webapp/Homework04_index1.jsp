<%--
  Created by IntelliJ IDEA.
  User: zbigniew
  Date: 13.07.18
  Time: 00:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Homework 04 exercise 1</title>
</head>
<body>
<p> Wybrany autor ${ empty param.author? "Unknown" : param.author}</p>
</body>
</html>
