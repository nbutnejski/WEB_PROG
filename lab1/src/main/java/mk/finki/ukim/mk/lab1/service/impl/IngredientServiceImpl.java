package mk.finki.ukim.mk.lab1.service.impl;

import mk.finki.ukim.mk.lab1.model.Ingredient;
import mk.finki.ukim.mk.lab1.repository.persistence.PersistentIngredientRepository;
import mk.finki.ukim.mk.lab1.service.IngredientService;
import org.springframework.stereotype.Service;

@Service
public class IngredientServiceImpl implements IngredientService {
    private final PersistentIngredientRepository pir;

    public IngredientServiceImpl(PersistentIngredientRepository pir) {
        this.pir = pir;
    }

    @Override
    public Ingredient newIngredient(Ingredient ingredient) {

        return pir.save(ingredient);
    }

    @Override
    public Ingredient editIngredient(Ingredient ingredient) {
        return pir.save(ingredient);
    }
}
