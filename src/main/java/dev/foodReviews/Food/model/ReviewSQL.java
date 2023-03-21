package dev.foodReviews.Food.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity()
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "review")
public class ReviewSQL {

    @Id
    private int id;
    private String text;
    @ManyToOne
    @JoinColumn(name = "food_id", nullable = false)
    private FoodSQL food;
}
