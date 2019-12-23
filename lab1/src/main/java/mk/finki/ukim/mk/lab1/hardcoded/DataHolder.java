package mk.finki.ukim.mk.lab1.hardcoded;

import lombok.Getter;
import mk.finki.ukim.mk.lab1.model.Order;
import mk.finki.ukim.mk.lab1.model.Pizza;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Component
public class DataHolder {
    @Getter
    private static List<Pizza>
            pizzaList=new ArrayList<>();
    @Getter
    private static List<Order>
            orderList=new ArrayList<>();

    @PostConstruct
    public void init(){

        pizzaList.add(new Pizza("Capri","Mnogu e dobra"));
        pizzaList.add(new Pizza("Makedonska","Patriotska(16 parcinja)"));
        pizzaList.add(new Pizza("Severnomakedonska","Tapa(8parcinja)"));
        pizzaList.add(new Pizza("Grcka","Jaka i prazna"));
        pizzaList.add(new Pizza("Martarita","Mnogu e dobra"));
        pizzaList.add(new Pizza("Pargarita","Mnogu jaka"));
        pizzaList.add(new Pizza("Nova123","topla dobra"));
        pizzaList.add(new Pizza("Stara321","ladna dobra"));
        pizzaList.add(new Pizza("Zelena","fina i dobra"));
        pizzaList.add(new Pizza("Bela","dobra"));
    }
}
