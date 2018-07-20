<%--
  Created by IntelliJ IDEA.
  User: zbigniew
  Date: 12.07.18
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Many Books sent...</title>
</head>
<body>

You have added books: <br><br>

<c:forEach var="book" items="${books}">
        Title: ${book.title} <br>
        Author: ${book.author} <br>
        Isbn: ${book.isbn} <br><br>
</c:forEach>

</body>
</html>
