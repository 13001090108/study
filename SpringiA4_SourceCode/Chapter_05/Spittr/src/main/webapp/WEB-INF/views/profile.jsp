<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <h1>Welcome , I love you ${spitter.username}</h1>
    <c:out value="${spitter.username}" /><br/>
    <c:out value="${spitter.firstName}" /><br>
    <c:out value="${spitter.lastName}" /><br/>
    <c:out value="${spitter.email}" /><br/>
    <font color="blue"><font size="4"><a href="<c:url value="/login" />">登录点击我就可以</a><br><br></font> </font>
    <br>
    <br>
    <br>
    <br>
    <font color="blue"><font size="4"><a href="<c:url value="/poetry" />">若不登录点击我有彩蛋哦</a><br><br></font> </font>
    <font size="5">  <font color="red"> <c:out value="恭喜你，注册成功，强烈建议看看彩蛋，有惊喜哦"/></font></font>



  </body>
</html>
