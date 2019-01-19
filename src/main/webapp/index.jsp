<%--
  Created by IntelliJ IDEA.
  User: baihuayang
  Date: 2019/01/18
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<h1>首页</h1>
<div>
    <form action="/sendMessage" method="get">
        发件人:<input type="text" name="from"/><br/>
        收件人:<input type="text" name="to"/><br/>
        主题:<input type="text" name="subject"/><br/>
        内容:<textarea name="content"></textarea><br/>
        <input type="submit" value="发送">
    </form>
</div>
</body>
</html>
