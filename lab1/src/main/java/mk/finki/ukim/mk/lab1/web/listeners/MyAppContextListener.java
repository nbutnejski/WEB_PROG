package mk.finki.ukim.mk.lab1.web.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyAppContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("[WP-Log] {contextInitialized}");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("[WP-Log] {contextInitialized}");
    }
}
