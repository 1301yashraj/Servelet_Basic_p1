import jakarta.servlet.http.*;
import java.io.*;

public class Ch1Servlet extends HttpServlet { //controller
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws  IOException {

        PrintWriter out = response.getWriter();

        java.util.Date today = new java.util.Date(); //model

        out.println("<html> " +   //view
                "<body>" +
                "<h1 align=center>Hello SSSServlet</h1>" +
                "<br>" + today +
                "</body>" +
                "</html>");
    }
}
