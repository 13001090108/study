<%--
  Created by IntelliJ IDEA.
  User: wangchm
  Date: 2018-01-26 026
  Time: 15:06
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>房间类型列表</title>
    <base href="<%=request.getContextPath()%>/"/>
</head>
<body>
    <a href="type/add">添加房间类型</a> <a href="index">返回首页</a>
    <br/>
    <table>
        <tr>
            <td>编号</td>
            <td>房间类型</td>
        </tr>
        <c:forEach items="${houseTypeList}" var="ht">
            <tr>
                <td>${ht.typeId}</td>
                <td>${ht.typeName}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
