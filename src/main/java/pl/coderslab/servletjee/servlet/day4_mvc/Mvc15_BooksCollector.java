package pl.coderslab.servletjee.servlet.day4_mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@WebServlet(name = "Mvc15_BooksCollector", urlPatterns = "/Mvc15_BooksCollector")
public class Mvc15_BooksCollector extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        HttpSession s = request.getSession();
        List<Book> books = (List<Book>) s.getAttribute("books");

        if (s.getAttribute("books") == null) {
            books = new ArrayList<Book>();
        }

        try{
            for (int i = 0; i < 3; i++) {
                final String title = request.getParameter("title" + (i + 1));
                final String author = request.getParameter("author" + (i + 1));
                final String isbn = request.getParameter("isbn" + (i + 1));
                books.add(new Book(title, author, isbn));
            }
        } catch (Exception e){
        }

        request.setAttribute("books", books);

        getServletContext()
                .getRequestDispatcher("/result_z5_BooksSession.jsp")
                .forward(request, response);
    }
}
