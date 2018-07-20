package pl.coderslab.servletjee.servlet.day4_mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Mvc14", urlPatterns = "/Mvc14")
public class Mvc14 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        Book[] books = new Book[5];

        for (int i = 0; i < 5; i++) {
            final String title = request.getParameter("title" + (i + 1));
            final String author = request.getParameter("author" + (i + 1));
            final String isbn = request.getParameter("isbn" + (i + 1));
            books[i] = new Book(title, author, isbn);
        }

        request.setAttribute("books", books);

        getServletContext()
                .getRequestDispatcher("/result_z4_books.jsp")
                .forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        getServletContext()
                .getRequestDispatcher("/form.jsp")
                .forward(request, response);

    }
}
