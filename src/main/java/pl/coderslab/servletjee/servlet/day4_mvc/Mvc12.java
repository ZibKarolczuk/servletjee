package pl.coderslab.servletjee.servlet.day4_mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Mvc12", urlPatterns = "/Mvc12")
public class Mvc12 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        final String startStr = request.getParameter("start");
        final String endStr = request.getParameter("end");

        int start = Integer.parseInt(startStr);
        int end = Integer.parseInt(endStr);

        start += 10;
        end += 10;

        request.setAttribute("start", start);
        request.setAttribute("end", end);

        getServletContext()
                .getRequestDispatcher("/d4mvc_z2.jsp")
                .forward(request, response);
    }
}
