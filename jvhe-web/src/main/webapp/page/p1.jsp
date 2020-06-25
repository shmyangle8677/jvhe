<%--此处有一个永远的坑，isELIgnored="false"，表示不忽略EL表达式。如果不显式添加，则默认为ture，表示忽略了EL表达式--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%
    String path1 = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
    String s1 = request.getParameter("msg");//getParameter只能用于web端往服务器请求的时候，取值使用，返回String
    String s2 = request.getAttribute("msg").toString();
%>
<html>
<head>
    <title>Title</title>
    <%--
    <base> 标签为页面上的所有链接规定默认地址或默认目标。
    通常情况下，浏览器会从当前文档的 URL 中提取相应的元素来填写相对 URL 中的空白。
    使用 <base> 标签可以改变这一点。浏览器随后将不再使用当前文档的 URL，而使用指定的基本 URL 来解析所有的相对 URL。
    这其中包括 <a>、<img>、<link>、<form> 标签中的 URL。
    --%>
    <base href="<%=basePath%>">
</head>

<body>
msg:${msg}
<br>
requestScope.msg:${requestScope.msg}
<br>
sessionScope.msg:${sessionScope.msg}
<br>
request.getAttribute("msg"):<%=request.getAttribute("msg")%>
<hr>
Amsg:${Amsg}
<br>
requestScope.Amsg:${requestScope.Amsg}
<br>
sessionScope.Amsg:${sessionScope.Amsg}
<br>
request.getAttribute("Amsg"):<%=request.getAttribute("Amsg")%>
<br>
request.getSession().getAttribute("Amsg"):<%=request.getSession().getAttribute("Amsg")%>
</body>
</html>
