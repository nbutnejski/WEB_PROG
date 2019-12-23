package mk.finki.ukim.mk.lab1.repository;

import mk.finki.ukim.mk.lab1.model.Order;

public interface OrderRepository {
    Order placeOrder(String pizzaType,String clientName, String address, String size);
}
