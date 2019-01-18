<%--
  Created by IntelliJ IDEA.
  User: wangchm
  Date: 2018-01-26 026
  Time: 15:06
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>添加房间类型</title>
    <base href="<%=request.getContextPath()%>/"/>
</head>
<body>
    <form:form action="type/add" method="post" modelAttribute="houseType">
        <form:input path="typeName" placeholder="请输入房间类型名" />
        <input type="submit" name="submit" value="提交">
    </form:form>
</body>
</html>
