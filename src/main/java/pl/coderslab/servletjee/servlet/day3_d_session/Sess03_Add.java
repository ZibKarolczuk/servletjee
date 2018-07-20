package pl.coderslab.servletjee.servlet.day3_d_session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Sess03_Add", urlPatterns = {"/addToSession"})
public class Sess03_Add extends HttpServlet {

    final static String FORM_HTML = "<form action='/showAllSession' method='POST'></br>" +
            "    <label></br>" +
            "        Klucz:</br>" +
            "        <input type='text' name='key'></br>" +
            "    </label></br>" +
            "    <label></br>" +
            "        Wartość:</br>" +
            "        <input type='text' name='value'></br>" +
            "    </label></br>" +
            "    <input type='submit'></br>" +
            "</form>";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        response.getWriter().println(FORM_HTML);

    }
}
