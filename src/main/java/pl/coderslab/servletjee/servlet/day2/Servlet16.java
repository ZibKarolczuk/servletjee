package pl.coderslab.servletjee.servlet.day2;

import sun.security.x509.IPAddressName;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;

@WebServlet(name = "Servlet16", urlPatterns = {"/Servlet16"})
public class Servlet16 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        final String browser = request.getHeader("User-Agent");
        final String clientIP = request.getRemoteAddr();
        final String date = request.getHeader("Date");

        response.getWriter().println(browser);
        response.getWriter().println(clientIP);
        response.getWriter().println(date);

        System.out.println("browser " + browser);
        System.out.println("ip " + clientIP);
        System.out.println("date " + date);

    }
}
