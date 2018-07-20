package pl.coderslab.servletjee.servlet.day3_d_session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Sess03_All", urlPatterns = {"/showAllSession"})
public class Sess03_All extends HttpServlet {

    final static String HEAD_HTML = "<table border='solid black 1px'><tr><th>KEY:</th><th>VALUE:</th></tr></br>";
    final static String TAIL_HTML = "</table>";


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        final String postName = request.getParameter("key");
        final String postValue = request.getParameter("value");

        HttpSession s = request.getSession();
        List<String> serials = (List<String>) s.getAttribute("serialVariables");

        if (s.getAttribute("serialVariables") == null) {
            serials = new ArrayList<>();
        }

        serials.add(postName + "|" + postValue);
        s.setAttribute("serialVariables", serials);

        response.getWriter().println(HEAD_HTML);
        for (String elem: (List<String>)s.getAttribute("serialVariables")){
            String[] array = elem.split("\\|");
            response.getWriter().println("<tr><td>" + array[0] + "</td><td>" + array[1] + "</td></tr></br>");
        }
        response.getWriter().println(TAIL_HTML);


    }
}
