package pl.coderslab.servletjee.servlet.day3_d_session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Sess01Get", urlPatterns = {"/getSession"})
public class Sess01Get extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession s = request.getSession();
        Integer counter = (Integer) s.getAttribute("counter");

        if (counter==null) {
            response.getWriter().println("Brak zmiennej w sesji");
        } else {
            counter++;
            s.setAttribute("counter", counter);
            response.getWriter().println("counter: " + s.getAttribute("counter"));
        }

    }
}
