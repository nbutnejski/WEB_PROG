package mk.finki.ukim.mk.lab1.repository.persistence;

import mk.finki.ukim.mk.lab1.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersistentIngredientRepository extends JpaRepository<Ingredient,String> {
    Ingredient save(Ingredient ingredient);
 //   List<Ingredient>findAll();
  //  Ingredient getById();
  //  List<Ingredient>findAllBySpicyIsTrue();
  //  Integer countAllBySpicyIsTrue();
  //  void deleteById(Long id);
}
