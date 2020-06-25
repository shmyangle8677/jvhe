package xyl.home.servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "ServletDispatcherHeader",urlPatterns = {"/servletDispatcherHeader"})
public class ServletDispatcherHeader extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setAttribute("msg","倘若我问心有愧呢？");
        request.getSession().setAttribute("Amsg","咱们只须问心无愧，旁人言语，理他作甚？");
        request.getRequestDispatcher("/page/p1.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
