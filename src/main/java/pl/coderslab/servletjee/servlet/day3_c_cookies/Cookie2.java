package pl.coderslab.servletjee.servlet.day3_c_cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cookie2", urlPatterns = {"/addToCookie"})
public class Cookie2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        final String key = request.getParameter("key");
        final String value = request.getParameter("value");

        Cookie c = new Cookie(key, value);
        c.setMaxAge(60 * 60);
        c.setPath("/");

        response.addCookie(c);
        response.getWriter().println("Dodano ciasteczko " + key + " : " + value);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
