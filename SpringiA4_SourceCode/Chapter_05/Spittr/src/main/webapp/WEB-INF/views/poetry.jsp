<%--
  Created by IntelliJ IDEA.
  User: lsc
  Date: 2019/1/5
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>娇娇你好</title>

</head>
<body>
<font size="5"><font color=red>${name}</font></font>

<%--<br/>${word}--%>
<%--<br/>${url}--%>
<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${poetry}
<br>
<font color="blue"><font size="4"><a href="<c:url value="/login" />">现在开始登录</a><br><br></font> </font>

</body>
</html>
