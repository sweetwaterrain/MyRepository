<%--
  Created by IntelliJ IDEA.
  User: gly
  Date: 2020/12/22
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
    <form action="many" method="post">
        <table>
            <tr>
                <td>姓名：<input name="name" type="text"></td>
                <td>课程：<input name="cour" type="text"></td>
            </tr>
            <tr>
                <td><input name="submit" type="submit" value="提交"></td>
                <td><input name="reset" type="reset" value="重置"></td>
            </tr>
            <tr>
                <td><a href="Query.jsp">条件查询</a></td>
                <td><a href="queryAll">展示</a> </td>
            </tr>
        </table>
    </form>
</body>
</html>
