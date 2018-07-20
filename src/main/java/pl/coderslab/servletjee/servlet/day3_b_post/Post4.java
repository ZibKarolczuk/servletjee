package pl.coderslab.servletjee.servlet.day3_b_post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "Post4", urlPatterns = {"/post4"})
public class Post4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        String[] numbers = request.getParameterValues("numbers");

        Arrays.sort(numbers);


        response.getWriter().println(Arrays.asList(numbers));




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        String formHead = "<form action='/post4' method='post'>";
        String formBody = "<div>Uzupełnij liczbę <input name='numbers'/></div><br/>";
        String formTail = "<div><input type='submit'/></div></br></form>";

        int max = new Random().nextInt(6)+5;

        response.getWriter().println(formHead);
        for (int i = 0; i < max; i++){

            response.getWriter().println(formBody);
        }
        response.getWriter().println(formTail);

    }
}
