<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body background="1.jpg" style="background-repeat: no-repeat;background-size: 100% 100%;" >

<center><font size="20" color="aqua"><strong>欢迎来到用户管理系统</strong></font></center>

<br>
<center>
    <font size="10" color="#fff8dc">
<a href="<c:url value="/user/list"/>">用户列表</a><br><br>
<a href="<c:url value="/user/login"/>">登录</a>&nbsp;
<a href="<c:url value="/user/input"/>">注册</a>
    </font>
</center>
</body>
</html>
