package dev.foodReviews.Food.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "food")
public class Food extends BaseEntity{

    private String name;
    private String type;
    @OneToMany
    private Set<Review> review;
}
