package pl.coderslab.servletjee.servlet.day3_c_cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cookie4Del", urlPatterns = {"/cookie4del"})
public class Cookie4Del extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String cookieKey = request.getParameter("cookieName");

        Cookie[] cookies = request.getCookies();
        for (Cookie c: cookies){
            if (c.getName().equals(cookieKey)) {
                c.setMaxAge(0);
                response.addCookie(c);
            }

        }
    }
}
