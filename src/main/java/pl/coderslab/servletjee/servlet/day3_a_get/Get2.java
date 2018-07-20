package pl.coderslab.servletjee.servlet.day3_a_get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet(name = "Get2", urlPatterns = {"/get2"})
public class Get2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        Map<String, String[]> params = request.getParameterMap();

        for (Map.Entry<String, String[]> e : params.entrySet()){
            response.getWriter().println(e.getKey() + " : " + Arrays.toString(e.getValue()) + "</br>");
        }


    }
}
