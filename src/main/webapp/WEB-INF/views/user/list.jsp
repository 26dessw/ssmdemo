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
<body background="/images/2.jpg" style="background-repeat: no-repeat;background-size: 100% 100%;">
<center>
<table border="1" cellpadding="30">
    <tr>
    <tr>
        <th>账号</th>
        <th>头像</th>
        <th>名字</th>
        <th>年龄</th>
        <th>出生日期</th>
        <th colspan="2">操作</th>
    </tr>
    </tr>
    <c:forEach items="${users.list}"  var="u">

    <tr>
        <td>${u.id}</td>
        <td>${u.headImg}</td>
        <td>${u.name}</td>
        <td>${u.age}</td>
        <td><fmt:formatDate value="${u.bornDate}" pattern="yyyy-MM-dd"/></td>
<td>
    <a href="<c:url value="/user/delete?id=${u.id}"/>">删除</a>

</td>
        <td>
            <a href="<c:url value="/user/input?id=${u.id}"/>">修改</a>
        </td>


    </tr>
    </c:forEach>
</table>

<font size="5">

<span>第${users.pageNum}页 / 共${users.pages}页</span>
<a href="<c:url value="/user/list?pageNum=1"/>" >首页</a>


<c:if test="${users.hasPreviousPage}">
    <a href="<c:url value="/user/list?pageNum=${users.pageNum-1}"/>" >上一页</a>
</c:if>
<c:if test="${users.hasNextPage}">
    <a href="<c:url value="/user/list?pageNum=${users.pageNum+1}"/>" >下一页</a>
</c:if>

<a href="<c:url value="/user/list?pageNum=${users.pages}"/>" >尾页</a>


<br><br>
<a href="<c:url value="/user/index"/>">返回主界面</a>
</font>
</center>
</body>
</html>
