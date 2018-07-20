<%--
  Created by IntelliJ IDEA.
  User: zbigniew
  Date: 12.07.18
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/Mvc13" method="post">
    <div>Title: <input type="text" name="title"></div>
    <div>Author: <input type="text" name="author"></div>
    <div>Isbn: <input type="text" name="isbn"></div>
    <div><input type="submit"></div>
</form>

</body>
</html>
