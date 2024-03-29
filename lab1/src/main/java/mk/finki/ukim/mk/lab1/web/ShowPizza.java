package mk.finki.ukim.mk.lab1.web;

import mk.finki.ukim.mk.lab1.model.Pizza;
import mk.finki.ukim.mk.lab1.service.PizzaService;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="PizzaServlet",urlPatterns = "")
public class ShowPizza extends HttpServlet {
    private PizzaService pizzaService;
    private final SpringTemplateEngine springTemplateEngine;

    public ShowPizza(PizzaService pizzaService, SpringTemplateEngine springTemplateEngine) {
        this.pizzaService = pizzaService;
        this.springTemplateEngine = springTemplateEngine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();

        WebContext webContext=new WebContext(req,resp,req.getServletContext());
        List<Pizza> pizzas=pizzaService.listPizzas();
        webContext.setVariable("pizzas",pizzas);
        resp.setContentType("text/html; charset=UTF-8");
        this.springTemplateEngine.process("listPizzas.html",webContext,resp.getWriter());
    }
}
