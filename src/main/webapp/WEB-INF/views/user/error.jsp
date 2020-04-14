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
您输入的用户名或密码错误，登录失败！<br>
<a href="<c:url value="/user/login"/>">返回登录页面</a>
</center>
</body>
</html>