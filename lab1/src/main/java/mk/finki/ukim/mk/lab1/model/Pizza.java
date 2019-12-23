package mk.finki.ukim.mk.lab1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "pizzas")
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private  String description;
    private Long pizzaId;
    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "pizza_ingredient",
        joinColumns=@JoinColumn(name = "pizza"),
            inverseJoinColumns = @JoinColumn(name = "ingredient")
    )
    private List<Ingredient>ingredients;
    private boolean veggie;

    public Pizza(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
