package pl.coderslab.servletjee.servlet.day3_b_post;

import pl.coderslab.servletjee.utils.Censor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Post2", urlPatterns = {"/Post2"})
public class Post2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        String text = request.getParameter("inputText");

        final String confirm = request.getParameter("confirm");
        final boolean confirmed = (confirm != null);

        if (!confirmed) {
            text = Censor.doCensor(text);
        }

        response.getWriter().println(text);

    }
}