package mk.finki.ukim.mk.lab1.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name ="orders")
public class Order {
    @ManyToOne
    private Pizza pizzaType;
    private String pizzaSize;
    private String clientName;
    private String clientAddress;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;


}
