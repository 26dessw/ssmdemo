<%--
  Created by IntelliJ IDEA.
  User: messi
  Date: 2020/4/8
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
<h1>登录界面</h1>


<form action="<c:url value="/user/success"/>" method="post">
    账户id：<input type="text" name="id" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')"><br>
    账户名：<input type="text" name="name"><br>
    <input type="submit" value="登录"><input type="reset" value="重置">
</form>
<br>
<a href="<c:url value="/user/index"/>">返回主界面</a>
</center>
</body>
</html>

