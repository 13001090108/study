<%--
  Created by IntelliJ IDEA.
  User: wangchm
  Date: 2018-01-26 026
  Time: 14:04
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>首页</title>
    <base href="<%= request.getContextPath() %>/"/>
</head>
<body>
    <a href="house/add">添加房间</a> <br/>
    <a href="house/list">房间列表</a> <br/><br/>
    <a href="type/list">房间类型</a> <br/>
</body>
</html>
