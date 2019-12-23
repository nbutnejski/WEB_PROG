package mk.finki.ukim.mk.lab1.service.impl;

import mk.finki.ukim.mk.lab1.model.Order;
import mk.finki.ukim.mk.lab1.repository.OrderRepository;
import mk.finki.ukim.mk.lab1.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
   private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order placeOrder(String pizzaType, String clientName, String address,String size) {
        return orderRepository.placeOrder(pizzaType,clientName,address,size);
    }
}
