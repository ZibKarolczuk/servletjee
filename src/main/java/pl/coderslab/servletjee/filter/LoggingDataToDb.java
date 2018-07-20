package pl.coderslab.servletjee.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class LoggingDataToDb implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        final String browser = req.getContentType();
        final String ua = ((HttpServletRequest)req).getHeader("User-Agent");

        long startTime = System.currentTimeMillis();
        chain.doFilter(req, resp);
        long stopTime = System.currentTimeMillis();
        System.out.println("Processing time [ms]: " + (stopTime - startTime));
        System.out.println("Information: " + browser + "\nAgent: " + ua);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
