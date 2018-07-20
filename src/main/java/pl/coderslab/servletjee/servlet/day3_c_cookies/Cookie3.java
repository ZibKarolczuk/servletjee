package pl.coderslab.servletjee.servlet.day3_c_cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cookie3", urlPatterns = {"/cookie3"})
public class Cookie3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        final String key = request.getParameter("key");
        final String value = request.getParameter("value");
        final int alive = Integer.parseInt(request.getParameter("expired"));

        Cookie c = new Cookie(key, value);
        c.setMaxAge(alive * 60 * 60);
        c.setPath("/");

        response.addCookie(c);
        response.getWriter().println("Dodano ciasteczko " + key + " : " + value +
                " i anihiluje za " + alive + "godzinę");


    }
}
