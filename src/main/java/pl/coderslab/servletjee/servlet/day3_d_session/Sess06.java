package pl.coderslab.servletjee.servlet.day3_d_session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "Sess06", urlPatterns = {"/sess06"})
public class Sess06 extends HttpServlet {



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int randomA = new Random().nextInt(981)+20;
        int randomB = new Random().nextInt(981)+20;

        String HTTP_FORM = "<div>Number 1: <b>" + randomA + "" +
                "</b> & Number 2: <b>" + randomB + "</b></br>" +
                "<form action='/captcha' method='post'></br>" +
                "<div>Wynik dodawania: <Input name='add' type='number'></div></br>" +
                "<div>Wynik odejmowania: <Input name='sub' type='number'></div></br>" +
                "<div>Wynik mnożenia: <Input name='nulti' type='number'></div></br>" +
                "<save_vala name='randomA' value='"+ randomA + "'></save_vala>" +
                "<save_valb name='randomB' value='"+ randomB + "'></save_valb>" +
                "<div><Input type='submit'></div></br></form>";

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        response.getWriter().println(HTTP_FORM);

    }
}
