package pl.coderslab.servletjee.servlet.day3_c_cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cookie1Get", urlPatterns = {"/showCookie"})
public class Cookie1Get extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();

        for (Cookie c : cookies) {
            if (c.getName().equals("User")) {
                response.getWriter().println("Ciacho: nazwa: " + c.getName() +
                        " , wartość " + c.getValue());
                return;
            }
        }

        response.getWriter().println("Nie ustawiono ciasteczka");
    }
}
