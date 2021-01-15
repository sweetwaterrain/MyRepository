<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: gly
  Date: 2020/12/28
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list</title>
</head>
<body>
    <form action="show" method="get">
        <table align="center">
            <tr>
                <td>序号</td>
                <td>商品名称</td>
                <td>商品价格</td>
            </tr>
            <c:forEach items="${goodsList}" var="li">
                <tr>
                    <td>${li.gid}</td>
                    <td>${li.gname}</td>
                    <td>${li.price}</td>
                </tr>
            </c:forEach>

            <tr>
                <td><a href="add.jsp">添加商品</a></td>
                <td><a href="delete.jsp">删除商品</a></td>
            </tr>
        </table>

    </form>
</body>
</html>
