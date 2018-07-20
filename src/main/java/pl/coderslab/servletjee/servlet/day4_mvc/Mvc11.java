package pl.coderslab.servletjee.servlet.day4_mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Mvc11", urlPatterns = "/Mvc11")
public class Mvc11 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String role = request.getParameter("roleParam");
        request.setAttribute("roleAttr", role);
        getServletContext()
                .getRequestDispatcher("/d4mvc_z1.jsp")
                .forward(request, response);
    }
}
