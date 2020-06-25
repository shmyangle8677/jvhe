package xyl.home.servlet;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import xyl.home.Person;

@WebServlet(name = "LoginServlet_getRequestDispatcher",urlPatterns = {"/loginServlet_getRequestDispatcher"})
public class LoginServlet_getRequestDispatcher extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Json 请求 doGet");
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String jsonStr1 = request.getParameter("jsonStr");
        Gson gson=new Gson();
        Map<String,String> jsonObject=gson.fromJson(jsonStr1, Map.class);
        System.out.println("页面请求信息："+jsonObject.toString());
        //依赖到引入的对象此处可能会报错，报错原因大概是全路径名的问题
        Person person = new Person("周芷若", 27, "zzr@163.com");
        String json = gson.toJson(person);
        response.getWriter().write(json);//数据返回请求页面
    }
}
