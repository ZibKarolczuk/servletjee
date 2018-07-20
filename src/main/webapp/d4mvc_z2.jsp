<%--
  Created by IntelliJ IDEA.
  User: zbigniew
  Date: 12.07.18
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Display values with step</title>
</head>
<body>

<c:forEach begin="${start}" end="${end}" var="idx">
 <p>${idx}</p>
</c:forEach>

</body>
</html>
