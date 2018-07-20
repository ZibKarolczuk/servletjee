package pl.coderslab.servletjee.servlet.day3_b_post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;

@WebServlet(name = "Post3", urlPatterns = {"/post3"})
public class Post3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        final String aStr = request.getParameter("numberA");
        final String bStr = request.getParameter("numberB");
        final String cStr = request.getParameter("numberC");

        final int aVal = Integer.parseInt(aStr);
        final int bVal = Integer.parseInt(bStr);
        final int cVal = Integer.parseInt(cStr);


        double delta = Math.pow(bVal, 2) - (4 * aVal * cVal);

        if (delta > 0) {
            double x1 = (-bVal - Math.sqrt(delta))/(1 * aVal);
            double x2 = (-bVal + Math.sqrt(delta))/(1 * aVal);
            response.getWriter().println("Miejsca zerowe to : " + x1 + " oraz " + x2);
        } else if (delta == 0 ) {
            double x = (-bVal)/(1 * aVal);
            response.getWriter().println("Tylko jedno miejsca zerowe " + x);
        } else {
            response.getWriter().println("Brak miejsca zerowego!!!");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
