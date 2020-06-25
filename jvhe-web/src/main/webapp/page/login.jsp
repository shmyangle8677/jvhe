<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    Object msg1 = request.getAttribute("msg");
    String msg_str=null;
    if(msg1 != null){
        msg_str=msg1.toString();
    }
    System.out.println("<>=="+msg_str);
%>
<body>
    requestScope信息index：(requestScope.msg)${requestScope.msg}
    <br>(sessionScope.msg):${sessionScope.msg}
    <br>(msg)${msg}
</body>
</html>
