package xyl.home.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 重定向
 */
@WebServlet(name = "LoginServlet",urlPatterns = {"/loginServlet"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        //sendredirect后原request对象已经消亡，所以以下代码将无法传递到新页面。
        request.setAttribute("requestValue","若我问心有愧呢？");
        //设置响应环境的字符集
        response.setContentType("text/html;charset=UTF-8");
        /*
            网摘：
            (1)重定向是客户端行为。（浏览器重新请求）
            (2)重定向是浏览器做了至少两次的访问请求的(当然也可以重定向多次)。
            (3)定向浏览器地址改变。
            (4)重定向两次跳转之间传输的信息会丢失（request范围）。
            (5)重定向可以指向任何的资源，包括当前应用程序中的其他资源，同一个站点上的其他应用程序中的资源，
            其他站点的资源（如自己工程重定向到百度）。注意：传递给HttpServletResponse.sendRedirect 方法的相对URL以“/”开头，
            它是相对于整个WEB站点的根目录。
            自述：
            1、这里前面可以不加上下文路径request.getContextPath()，因为WebContent下的文件是可以直接访问的。
            也可以写成response.sendRedirect(request.getContextPath()+"/page/yitiantulongji.jsp")。
         */
        response.sendRedirect("/page/yitiantulongji.jsp");
    }

    /**
     * 默认进入doGet方法
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
