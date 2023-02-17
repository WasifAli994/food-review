package dev.foodReviews.Food.DTO;

import dev.foodReviews.Food.model.Review;
import lombok.Data;
import org.bson.types.ObjectId;

import java.util.List;

@Data
public class FoodDTO {

    private String name;
    private String type;
    private List<Review> reviewsId;
}
