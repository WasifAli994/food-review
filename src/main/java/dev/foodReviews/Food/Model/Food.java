package dev.foodReviews.Food.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
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
    private ObjectId id;
    private String name;
    private String type;
    @DocumentReference
    private List<Review> reviewsId;

}
