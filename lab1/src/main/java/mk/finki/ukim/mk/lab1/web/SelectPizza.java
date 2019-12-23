package mk.finki.ukim.mk.lab1.web;

import mk.finki.ukim.mk.lab1.model.Order;
import mk.finki.ukim.mk.lab1.service.PizzaService;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "PizzaServlet2",urlPatterns = "/selectPizzaSize.do")
public class SelectPizza extends HttpServlet {
    PizzaService pizzaService;
    private final SpringTemplateEngine springTemplateEngine;

    public SelectPizza(PizzaService pizzaService, SpringTemplateEngine springTemplateEngine) {
        this.pizzaService = pizzaService;
        this.springTemplateEngine = springTemplateEngine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp); so ova ne raboti
/*        WebContext webContext=new WebContext(req,resp,req.getServletContext());
        Order o=new Order(req.getParameter("pica"),"","","",);
        HttpSession session=req.getSession();
        session.setAttribute("Order",o);
        //resp.setContentType("text/html; charset=UTF-8");

        this.springTemplateEngine.process("selectPizzaSize.html",webContext,resp.getWriter());
   */ }
}
