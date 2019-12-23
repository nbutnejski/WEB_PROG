package mk.finki.ukim.mk.lab1.web;

import mk.finki.ukim.mk.lab1.model.Order;
import mk.finki.ukim.mk.lab1.service.PizzaService;
import org.springframework.boot.web.servlet.server.Session;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Servlt3",urlPatterns = "/PizzaOrder.do")
public class PizzaOrder extends HttpServlet {
    private PizzaService pizzaService;
    private final SpringTemplateEngine springTemplateEngine;

    public PizzaOrder(PizzaService pizzaService, SpringTemplateEngine springTemplateEngine) {
        this.pizzaService = pizzaService;
        this.springTemplateEngine = springTemplateEngine;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        WebContext webContext=new WebContext(req,resp,req.getServletContext());
        HttpSession session=req.getSession();
        Order o= (Order) session.getAttribute("Order");
        o.setPizzaSize(req.getParameter("pizza_size"));
        session.setAttribute("Order",o);
        springTemplateEngine.process("deliveryInfo.html",webContext,resp.getWriter());
    }
}
