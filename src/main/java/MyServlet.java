import javax.servlet.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends GenericServlet {
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletRequest.setCharacterEncoding("UTF-8");
        BufferedReader bufferedReader = servletRequest.getReader();
        String buffer = bufferedReader.readLine();
        bufferedReader.close();
        servletResponse.setContentType("text/html; charset=UTF-8");
        PrintWriter printWriter = servletResponse.getWriter();
        printWriter.println(TextPage.getPage());
        printWriter.flush();
        printWriter.close();
    }
}
