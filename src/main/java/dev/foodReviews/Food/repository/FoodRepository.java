package dev.foodReviews.Food.repository;

import dev.foodReviews.Food.model.Food;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends MongoRepository<Food, String> {

}
