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

--> INSERT BOOKS!!<br><br>
<form action="/Mvc14" method="post">
<c:forEach begin="1" end="5" var="idx">
    <div>
        <div>Title${idx}: <input type="text" name="title${idx}"></div>
        <div>Author${idx}: <input type="text" name="author${idx}"></div>
        <div>Isbn${idx}: <input type="text" name="isbn${idx}"></div><br>
    </div>
</c:forEach>
    <div><input type="submit"></div>
</form>





</body>
</html>
