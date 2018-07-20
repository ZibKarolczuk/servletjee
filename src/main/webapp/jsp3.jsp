<%--
  Created by IntelliJ IDEA.
  User: zbigniew
  Date: 12.07.18
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP3 exercise</title>
</head>
<body>
<div>a=${empty param.a ? "brak" : param.a} & b=${empty param.b ? "brak" : param.b}</div>
<div>${cookie.get("klucz").name} : ${cookie.get("klucz").value} </div>

</body>
</html>
