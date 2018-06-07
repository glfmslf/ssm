<%--
  Created by IntelliJ IDEA.
  User: yy
  Date: 2018/3/6
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>test</title>
</head>
<script type="text/javascript" src="resources/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="jsp/account/account.js"></script>
<body>
    <form id="test" name="form1" action="account/account.do" method="post" >
        账号：<input type="text" name="account"><br>
        密码：<input type="password" name="password"><br>
        记住密码：<input type="checkbox" name="autoLogin" value="0" >是
        <input type="checkbox" name="autoLogin" value="1">否
        <input type="submit" value="登录">
    </form>
</body>
</html>
