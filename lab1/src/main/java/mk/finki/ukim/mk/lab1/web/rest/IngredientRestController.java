package mk.finki.ukim.mk.lab1.web.rest;

import mk.finki.ukim.mk.lab1.model.Ingredient;
import mk.finki.ukim.mk.lab1.service.IngredientService;
import org.springframework.http.HttpStatus;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/ingredients", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
public class IngredientRestController {
    private IngredientService ingredientService;

    public IngredientRestController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Ingredient newIngredient(
            @RequestParam("name") String name,
            @RequestParam("spicy") boolean spicy,
            @RequestParam("amount")Float amount,
            @RequestParam("veggie")boolean veggie){
        Ingredient ing=new Ingredient(name,spicy,amount,veggie);
        return  ingredientService.newIngredient(ing);
    }


}
