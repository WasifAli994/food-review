package dev.foodReviews.Food.Repository;

import dev.foodReviews.Food.Model.Food;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends MongoRepository<Food, ObjectId> {

}
