package pl.coderslab.servletjee.servlet.day3_d_session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@WebServlet(name = "Sess04", urlPatterns = {"/sess04_basket"})
public class Sess04 extends HttpServlet {

    public void printBasket (HttpServletRequest request, HttpServletResponse response){

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        try {

            HttpSession s = request.getSession();
            List<HashMap<String, String>> basket = (List<HashMap<String, String>>) s.getAttribute("basket");

            double totalBasketValue = 0;
            for (HashMap<String, String> elem : basket) {

                double totalDouble = Double.parseDouble(elem.get("price")) * Double.parseDouble(elem.get("quantity"));
                totalBasketValue += totalDouble;
                response.getWriter().println(elem.get("item") + " - " + elem.get("quantity") + " x " +
                        String.format("%.2f", Double.parseDouble(elem.get("price"))) + "zł = " +
                        String.format("%.2f", totalDouble) + "zł</br>");
            }
            response.getWriter().println("TOTAL: " + String.format("%.2f", totalBasketValue) + "zł</br>");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        final String item = request.getParameter("item");
        final String quantity = request.getParameter("quantity");
        final String price = request.getParameter("price");

        HttpSession s = request.getSession();
        HashMap<String, String> mapItem = new HashMap<>();
        List<HashMap<String, String>> basket = (List<HashMap<String, String>>)s.getAttribute("basket");

        if (s.getAttribute("basket") == null) {
            basket = new ArrayList<HashMap<String, String>>();
        }

        mapItem.put("item", item);
        mapItem.put("quantity", quantity);
        mapItem.put("price", price);
        basket.add(mapItem);

        s.setAttribute("basket", basket);

        printBasket(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        printBasket(request, response);
    }

}
