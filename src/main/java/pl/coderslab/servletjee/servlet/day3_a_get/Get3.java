package pl.coderslab.servletjee.servlet.day3_a_get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Get3", urlPatterns = "/get3")
public class Get3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");


        try {

            int width = 5;
            int heigth = 10;

            String widthStr = request.getHeader("width");
            String heigthStr = request.getHeader("heigth");

            if (widthStr != null && heigthStr != null) {
                width = Integer.parseInt(widthStr);
                heigth = Integer.parseInt(heigthStr);
            }

            response.getWriter().println("<table border=\"1px solid black\"></br><th></th>");
            for (int j=1; j<=width; j++){
                response.getWriter().println("<th>" + j + "</td>");
            }
            response.getWriter().println("</br>");
            for (int i=1; i <=heigth; i++){
                response.getWriter().println("<tr><td><b>" + i + "</b></td>");
                for (int j=1; j<=width; j++){
                    int wynik = i * j;
                    response.getWriter().println("<td>" + wynik + "</td>");
                }
                response.getWriter().println("</tr>");
            }
            response.getWriter().println("</table>");





        } catch (NumberFormatException e) {
            System.out.println("Error data type");
        }

    }
}
