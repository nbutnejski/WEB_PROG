package mk.finki.ukim.mk.lab1.service;

import mk.finki.ukim.mk.lab1.model.Ingredient;

public interface IngredientService {
    Ingredient newIngredient(Ingredient ingredient);
    Ingredient editIngredient(Ingredient ingredient);
}

