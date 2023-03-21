package dev.foodReviews.Food.repository;

import dev.foodReviews.Food.model.Food;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepositoryMongo extends MongoRepository<Food, String> {

}
