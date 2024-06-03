import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        if(username != null) {
            out.println("<h1>Welcome " + username + "</h1>");
        }else {
            out.println("<h1>You are not logged in!</h1>");
        }
    }
}
