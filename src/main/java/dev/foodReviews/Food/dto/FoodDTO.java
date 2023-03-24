package dev.foodReviews.Food.dto;

import dev.foodReviews.Food.model.ReviewMongo;
import lombok.Data;

import java.util.List;

@Data
public class FoodDTO {

    private String name;
    private String type;
    private List<ReviewMongo> reviewMongos;
}
