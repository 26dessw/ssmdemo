<%--
  Created by IntelliJ IDEA.
  User: messi
  Date: 2020/4/7
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
<h3>欢迎您，${user.name}</h3>
<table border="1" cellpadding="30">
    <tr>
        <th>账号</th>
        <th>头像</th>
        <th>名字</th>
        <th>年龄</th>
        <th>出生日期</th>
    </tr>

        <tr>
            <td>${user.id}</td>
            <td>${user.headImg}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td><fmt:formatDate value="${user.bornDate}" pattern="yyyy-MM-dd"/></td>
            <td>
                <a href="<c:url value="/user/delete?id=${user.id}"/>">删除</a>

            </td>
            <td>
                <a href="<c:url value="/user/input?id=${user.id}"/>">修改</a>
            </td>

        </tr>

</table>
<h3>若无数据，则说明用户名或id账号输入错误，请返回登录界面</h3>
<a href="<c:url value="/user/login"/>">返回登录界面</a>

</center>
</body>
</html>