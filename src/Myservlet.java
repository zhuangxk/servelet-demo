import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Myservlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World!  alibaba cloud!!! 我是我的人</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}