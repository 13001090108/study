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
    <title>房间列表</title>
    <base href=" <%=request.getContextPath()%>/"/>
</head>
<body>
排序：<a href="house/list">默认</a> &nbsp;&nbsp;
        <a href="house/listOrderPrice">按租金</a> &nbsp;&nbsp;
        <a href="house/listOrderDate">最新</a> <br />

    <table>
        <c:forEach items="${houseList}" var="house">
            <tr>
                <td><img src="show/${house.housePic}" /></td>
                <td>
                    <table>
                        <tr>
                            <td>${house.houseName}</td>
                        </tr>
                        <tr>
                            <td>${house.houseLayout} |</td>
                            <td>${house.houseSize} |</td>
                            <td>${house.houseFloor} |</td>
                            <td>${house.houseMaster} </td>
                        </tr>
                        <tr>
                            <td>${house.houseEstate} |</td>
                            <td>${house.houseAddress}</td>
                        </tr>
                        <tr>
                            <td>${house.houseType.typeName}</td>
                        </tr>
                    </table>
                </td>
                <td>${house.housePrice}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
