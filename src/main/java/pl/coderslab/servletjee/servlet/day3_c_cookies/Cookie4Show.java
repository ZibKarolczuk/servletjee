package pl.coderslab.servletjee.servlet.day3_c_cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cookie4Show", urlPatterns = {"/cookie4show"})
public class Cookie4Show extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        Cookie[] cookies = request.getCookies();

        for (Cookie c : cookies){
            response.getWriter().println(c.getName());
            String linkDeleteCookie = "<a href=/cookie4del?cookieName=" + c.getName() + ">" +
                    "Usun ciasteczko " + c.getName() + "</a></br>";
            response.getWriter().println(linkDeleteCookie);
        }
    }
}
