package pl.coderslab.servletjee.servlet.day4_jbdc;

import pl.coderslab.servletjee.servlet.day4_mvc.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MvcJdbc01", urlPatterns = "/add-book")
public class MvcJdbc01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        final String title =request.getParameter("title");
        final String author =request.getParameter("author");
        final String isbn =request.getParameter("isbn");

        Book b = new Book(title, author, isbn);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext()
                .getRequestDispatcher("/addBookForm.jsp")
                .forward(request, response);
    }
}
