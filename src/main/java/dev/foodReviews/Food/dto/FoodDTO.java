package dev.foodReviews.Food.dto;

import dev.foodReviews.Food.model.Review;
import lombok.Data;

import java.util.List;

@Data
public class FoodDTO {

    private String name;
    private String type;
    private List<Review> reviews;
}
