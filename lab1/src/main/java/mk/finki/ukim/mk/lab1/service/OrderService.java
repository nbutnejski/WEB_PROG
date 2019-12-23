package mk.finki.ukim.mk.lab1.service;

import mk.finki.ukim.mk.lab1.model.Order;

public interface OrderService {
    Order placeOrder(String pizzaType, String clientName, String address,String size);
}
