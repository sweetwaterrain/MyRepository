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
    <title>login</title>
</head>
<body>
    <form action="login" method="post">
        <table align="center">
            <tr>
                <td>用户名</td>
                <td><input name="username" type="text"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input name="password" type="password"></td>
            </tr>
            <tr>
                <td><input type="submit" value="登录"></td>
                <td><input type="reset" value="重置"></td>
            </tr>
        </table>
    </form>
</body>
</html>
