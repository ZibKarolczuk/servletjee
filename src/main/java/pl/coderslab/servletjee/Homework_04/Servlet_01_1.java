package pl.coderslab.servletjee.Homework_04;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Servlet_01_1", urlPatterns = "/Servlet_01_1")
public class Servlet_01_1 extends HttpServlet {

    public static Map<String, String> LANG;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        LANG = new HashMap<>();
        LANG.put("en", "Hello");
        LANG.put("pl", "Cześć");
        LANG.put("de", "Ehre");
        LANG.put("es", "Hola");
        LANG.put("fr", "Bienvenue");

        String welcomeLang = "pl";
        Cookie[] cookies = request.getCookies();

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        try {
            for (Cookie cookie : cookies) {
                if (LANG.keySet().contains(cookie.getValue())) {
                    welcomeLang = cookie.getValue();
                }
            }

        } catch (Exception e) {
        }

        response.getWriter().println("<br><div>" + LANG.get(welcomeLang) + " User!</div><br>");

        response.getWriter().println("<div><a>Select language: </a>");
        String form = "<form method='post' action='/Servlet_01_2'>";
        form += "<a><select name='language'>";
        for (Map.Entry<String, String> entry : LANG.entrySet()) {
            form += "<option value='" + entry.getKey() + "'>" + entry.getKey() + "</option>";
        }
        form += "</select></a></div>";
        form += "<input type='submit'><br>";
        form += "</form>";

        response.getWriter().println(form);

    }
}
