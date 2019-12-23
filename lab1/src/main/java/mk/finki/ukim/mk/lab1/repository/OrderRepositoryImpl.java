package mk.finki.ukim.mk.lab1.repository;

import mk.finki.ukim.mk.lab1.hardcoded.DataHolder;
import mk.finki.ukim.mk.lab1.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
    @Override
    public Order placeOrder(String pizzaType, String clientName, String address, String size) {
//       Order o= new Order(pizzaType,clientName,address,size);
 //       DataHolder.getOrderList().add(o);
        return null;
    }
}
