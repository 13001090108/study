<%--
  Created by IntelliJ IDEA.
  User: lsc
  Date: 2019/1/7
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css"
          href="<c:url value="/resources/style.css" />" >
</head>
<body>
<h1>Login</h1>

<form method="POST">
    Username: <input type="text" name="username" /><br/>
    Password: <input type="password" name="password" /><br/>
    <input type="submit" value="登录" />
</form>
<font color="blue"><font size="4"><a href="<c:url value="/poetry" />">真的不点我吗？有彩蛋的哦</a><br><br></font>
</body>
</html>