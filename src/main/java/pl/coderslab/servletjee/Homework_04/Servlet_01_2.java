package pl.coderslab.servletjee.Homework_04;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "/Servlet_01_2", urlPatterns = "/Servlet_01_2")
public class Servlet_01_2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        String langShort = request.getParameter("language");
        Cookie c = new Cookie("language", langShort);
        c.setPath("/");
        c.setMaxAge(6 * 60 * 60);

        response.addCookie(c);
        response.getWriter().println("Added cookie!");

    }
}
