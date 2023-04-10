package dev.foodReviews.Food.model;

import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Data
@Table(name = "restaurant")
public class Restraunt extends BaseEntity{

    private String name;
    private String category;
    private String location;
}
