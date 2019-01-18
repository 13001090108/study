<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <%--<meta http-equiv="Content-Type" content="text/html;charset=utf-8">--%>
    <title>娇娇</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <h1>${name}</h1>

    <a href="<c:url value="/spitter/register" />">注册</a><br><br>
    <a href="<c:url value="/login" />">登录</a><br><br>
    <%--<a href="<c:url value="/spittles" />">写给ta的一些悄悄话</a>--%>

  </body>
</html>

