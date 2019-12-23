package mk.finki.ukim.mk.lab1.web;

import mk.finki.ukim.mk.lab1.model.Order;
import mk.finki.ukim.mk.lab1.service.OrderService;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Servlet5",urlPatterns = "/ConfirmationInfo.do")
public class ConfirmationInfo extends HttpServlet {
    private OrderService orderService;
    private final SpringTemplateEngine springTemplateEngine;

    public ConfirmationInfo(OrderService orderService, SpringTemplateEngine springTemplateEngine) {
        this.orderService = orderService;
        this.springTemplateEngine = springTemplateEngine;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        WebContext webContext=new WebContext(req,resp,req.getServletContext());
        HttpSession session=req.getSession();
        Order o=(Order) session.getAttribute("Order");
        o.setClientName(req.getParameter("clientName"));
        o.setClientAddress(req.getParameter("clientAddress"));
        String informations=req.getRemoteAddr();
        session.setAttribute("Order",o);
        session.setAttribute("IP",informations);
        this.springTemplateEngine.process("/confirmationInfo.html",webContext,resp.getWriter());

    }
}
