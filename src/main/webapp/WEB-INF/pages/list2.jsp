<%@ page import="com.house.domain.Comment" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/1/21
  Time: 22:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>


<html>
<head>
    <title>查询所有视频评论</title>
</head>
<body>
<%
    List<Comment> datalist = (List<Comment>)request.getAttribute("list");
    for(Comment d:datalist){
%>
<%} %>
<table class="table table-striped table-bordered">

    <thead>
    <tr>
        <th>ID</th>
        <th>用户名</th>
        <th>评论</th>
        <th>时间</th>
        <th>视频ID</th>
        <th>用户ID</th>

    </tr>
    </thead>
    <tbody>
    <%	for(Comment d:datalist){
    %>
    <tr>
        <td><%=d.getCommentID()%></td>
        <td><%=d.getUsername()%></td>
        <td><%=d.getComment()%></td>
        <td><%=d.getTime()%> </td>
        <td><%=d.getVedioID()%></td>
        <td><%=d.getUid()%></td>

    </tr>
    <%
        }
    %>
    </tbody>
</table>
</body>
</html>
