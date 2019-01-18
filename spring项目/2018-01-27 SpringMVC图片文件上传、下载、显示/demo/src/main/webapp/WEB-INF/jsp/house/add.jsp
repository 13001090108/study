<%--
  Created by IntelliJ IDEA.
  User: wangchm
  Date: 2018-01-26 026
  Time: 14:04
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>添加房间</title>
    <base href="<%=request.getContextPath()%>/"/>
</head>
<body>
    <form:form action="house/add" method="post" modelAttribute="house" enctype="multipart/form-data">
        <form:input path="houseName" placeholder="请输入房间名称" /> <br />
        <form:radiobuttons path="houseType.typeId" items="${houseTypeList}" itemValue="typeId" itemLabel="typeName" /><br />
        <input type="file" name="file" /> <br />
        <form:input path="houseSize" placeholder="请输入房间面积" /> 平米 <br />
        <form:input path="houseLayout" placeholder="请输入户型" /> <br />
        <form:input path="houseFloor" placeholder="请输入楼层" /> <br />
        <form:input path="houseMaster" placeholder="请输入户主" /> <br />
        <form:input path="houseAddress" placeholder="请输入位置" /> <br />
        <form:input path="houseEstate" placeholder="请输入小区" /> <br />
        <form:input path="housePrice" placeholder="请输入租金" /> <br />
        <input type="submit" name="submit" value="提交" />
    </form:form>

<!-- 可行 -->
<%--<form action="house/doadd" method="post" enctype="multipart/form-data">--%>
    <%--<input type="text" name="houseName" placeholder="请输入房间名称" /> <br />--%>
    <%--<c:forEach items="${houseTypeList}" var="ht">--%>
        <%--<input type="radio" name="houseType" value="${ht.typeId}">${ht.typeName}--%>
    <%--</c:forEach> <br/>--%>
    <%--<input type="file" multiple name="file" /> <br />--%>
    <%--<input type="text" name="houseSize" placeholder="请输入房间面积" /> 平米 <br />--%>
    <%--<input type="text" name="houseLayout" placeholder="请输入户型" /> <br />--%>
    <%--<input type="text" name="houseFloor" placeholder="请输入楼层" /> <br />--%>
    <%--<input type="text" name="houseMaster" placeholder="请输入户主" /> <br />--%>
    <%--<input type="text" name="houseAddress" placeholder="请输入位置" /> <br />--%>
    <%--<input type="text" name="houseEstate" placeholder="请输入小区" /> <br />--%>
    <%--<input type="text" name="housePrice" placeholder="请输入租金" /> <br />--%>
    <%--<input type="submit" name="submit" value="提交" />--%>
<%--</form>--%>

    <%--<form:form action="house/doadd" method="post" modelAttribute="house">--%>
        <%--<form:input path="houseName" placeholder="请输入房间名称" /> <br />--%>
        <%--<form:radiobuttons path="houseType" items="${houseTypeList}" itemValue="typeId" itemLabel="typeName" /><br />--%>
        <%--&lt;%&ndash;<input type="file" name="file" /> <br />&ndash;%&gt;--%>
        <%--<form:input path="houseSize" placeholder="请输入房间面积" /> 平米 <br />--%>
        <%--<form:input path="houseLayout" placeholder="请输入户型" /> <br />--%>
        <%--<form:input path="houseFloor" placeholder="请输入楼层" /> <br />--%>
        <%--<form:input path="houseMaster" placeholder="请输入户主" /> <br />--%>
        <%--<form:input path="houseAddress" placeholder="请输入位置" /> <br />--%>
        <%--<form:input path="houseEstate" placeholder="请输入小区" /> <br />--%>
        <%--<form:input path="housePrice" placeholder="请输入租金" /> <br />--%>
        <%--<input type="submit" name="submit" value="提交" />--%>
    <%--</form:form>--%>
</body>
</html>
