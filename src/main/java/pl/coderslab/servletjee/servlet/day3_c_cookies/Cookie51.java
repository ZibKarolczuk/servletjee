package pl.coderslab.servletjee.servlet.day3_c_cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "Cookie51", urlPatterns = {"/cookie51"})
public class Cookie51 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setContentType("utf-8");

        try {
            int len = request.getCookies().length;
        } catch (NullPointerException e) {
            response.getWriter().println("<div>Nie odwiedziłeś jeszcze tej strony</div></br>");
        }

        Cookie c = new Cookie("cookie51", "visited");
        c.setMaxAge(30 * 24 * 60 * 60);
        c.setPath("/");
        response.addCookie(c);

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        String html = "<div><a href='/cookie52'>goto page cookie52</a></div></br>";
        response.getWriter().println(html);


    }
}
