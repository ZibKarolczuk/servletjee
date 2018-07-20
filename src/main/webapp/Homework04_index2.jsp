<%--
  Created by IntelliJ IDEA.
  User: zbigniew
  Date: 12.07.18
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Homework Day 4 & Exercise 2</title>
</head>
<body>
<c:forEach begin="2" end="10" step="2" var="i">
    <p><${i}</p>
</c:forEach>
</body>
</html>
