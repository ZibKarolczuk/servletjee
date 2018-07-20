package pl.coderslab.servletjee.init;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DbInit implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Db Driver Loaded");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("ERROR: failed loading Db Driver");
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
