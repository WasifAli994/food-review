package dev.foodReviews.Food.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "food")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {
    @Id
    private String id;
    private String name;
    private String type;
    @DocumentReference
    private List<Review> reviewsId;

}
