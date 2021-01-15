<%--
  Created by IntelliJ IDEA.
  User: gly
  Date: 2020/12/28
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
    <form action="add.action" method="post">
        <table align="center">
            <tr>
                <td>商品名称<input type="text" name="gname"></td>
                <td>商品价格<input type="text" name="price"></td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"></td>
                <td><input type="reset" value="重置"></td>
            </tr>
        </table>
    </form>
</body>
</html>
