<%--
  Created by IntelliJ IDEA.
  User: yy
  Date: 2018/3/6
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>account</title>
</head>
<body>
    <table>
        <c:forEach items="${account}" var="a">
            账号：<input type="text" value="${a.account}">
            密码：<input type="text" value="${a.password}">
            创建时间：<input type="text" value="<fmt:formatDate value='${a.createTime }' pattern='yyyy-MM-dd HH:mm:ss'/>">
            <br/>
        </c:forEach>

    </table>
</body>
</html>
