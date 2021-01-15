<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: gly
  Date: 2020/12/22
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>姓名</td>
        <td>课程名</td>
    </tr>
    <c:forEach items="${stu_cour}" var="Fin">
        <tr>
            <c:forEach items="${Fin}" var="sslist">
                <td>${sslist}</td>
            </c:forEach>
<%--            <td>${li.name}</td>--%>

<%--            <c:forEach items="${li.list}" var="cli">--%>
<%--                <td>${cli}</td>--%>
<%--            </c:forEach>--%>
        </tr>
    </c:forEach>
    <tr>
        <td><a href="index.jsp">返回首页面</a></td>
    </tr>
</table>
</body>
</html>
