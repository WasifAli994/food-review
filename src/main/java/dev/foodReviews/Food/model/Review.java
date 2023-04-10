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
public class Review extends BaseEntity{

    private String text;
    @ManyToOne
    @JoinColumn(name = "food_id", nullable = false)
    private Food food;
}
