<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>首页</title>
</head>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
    /*1、ajax发送JSON字符串，服务器通过工具Gson解析字符串为Map对象
      2、服务器通过Gson转换对象为JSON字符串，发送到前端。前端通过JSON.parse()反序列化字符串为JSON对象。
    */
    var jsonStr = '{"name":"张三丰","age":108}';
    $(function() {
        $("#btnId").click(function(){
            var url="/loginServlet_getRequestDispatcher";
            $.ajax({url:url,
                type:"post",
                data:{"jsonStr":jsonStr},
                success:function(data){
                    var jsonObj = JSON.parse(data);
                    $("#t1Id").val(jsonObj.name+":"+jsonObj.age+":"+jsonObj.email);
                }});
        });
    });
</script>

<body>
<h2>Hello World!</h2>
<a href="/loginServlet">loginServlet</a>
<form id="sendRedirect" action="/loginServlet">
    倚天人物：<input type="text" name="name"/>
    <input type="submit" id="btn" value="提交表单">
</form>
<hr>
<input type="submit" id="btnId" value="Json提交到服务器"/>
<font color="red">服务器返回Json数据：</font>
<input type="text" id="t1Id" style="border: 0"/>
<hr>
<a href="/servletDispatcherHeader">跳转到servletDispatcherHeader</a>
<hr>
<a href="${pageContext.request.contextPath}/index">index</a>
<br>
<a href="/index2">index2</a>
</body>
</html>
