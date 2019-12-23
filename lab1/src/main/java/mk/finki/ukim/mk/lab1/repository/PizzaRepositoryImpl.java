package mk.finki.ukim.mk.lab1.repository;

import mk.finki.ukim.mk.lab1.hardcoded.DataHolder;
import mk.finki.ukim.mk.lab1.model.Pizza;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PizzaRepositoryImpl implements PizzaRepository{

    @Override
    public List<Pizza> getAllPizzas() {
        return DataHolder.getPizzaList();
    }
}
