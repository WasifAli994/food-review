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
@Table(name = "user")
public class User extends  BaseEntity{

    private String name;

    @OneToMany
    @JoinColumn(name = "review_id", nullable = false)
    Set<Review> userReviews;
}
