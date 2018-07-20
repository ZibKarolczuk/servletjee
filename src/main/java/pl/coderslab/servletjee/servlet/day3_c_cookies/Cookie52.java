package pl.coderslab.servletjee.servlet.day3_c_cookies;

import sun.misc.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;

@WebServlet(name = "Cookie52", urlPatterns = {"/cookie52"})
public class Cookie52 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("Nie odwiedziłeś jeszcze tej strony!");
}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setContentType("utf-8");

        Cookie[] cookies = request.getCookies();

        Cookie thisCookie = null;
        boolean cookieFound = false;
        for (Cookie c: cookies){
            if (c.getName().equals("cookie51")) {
                cookieFound = true;
                thisCookie = c;
            }
        }

        if (cookieFound) {
            thisCookie.setMaxAge(0);
            response.addCookie(thisCookie);
            response.getWriter().println("<div>Witamy na stronie Cookie52</div></br>");
        } else {
            response.sendRedirect("/cookie51");
        }

    }
}
