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
<h1>编辑界面</h1>

<form action="<c:url value="/user/saveOrUpdate"/>" method="post" enctype="multipart/form-data">
    <input type="hidden" name="id" value="${user.id}">
    名字：<input type="text" name="name" value="${user.name}"><br>
    年龄：<input type="text" name="age" value="${user.age}"><br>
    生日：<input type="date" name="bornDate" value="<fmt:formatDate value="${user.bornDate}" pattern="yyyy-MM-dd"/>"><br>
   <%-- 头像：<input type="text" name="headImg" value="${user.headImg}"><br>--%>
    头像：<input type="file" name="upload" value="${user.headImg}"><br>
   <input type="submit" value="保存"><input type="reset" value="重置">
</form>
<br>
<a href="<c:url value="/user/index"/>">返回主界面</a>

</center>
</body>
</html>
