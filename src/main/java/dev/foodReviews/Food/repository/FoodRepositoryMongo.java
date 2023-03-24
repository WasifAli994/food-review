package dev.foodReviews.Food.repository;

import dev.foodReviews.Food.model.FoodMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepositoryMongo extends MongoRepository<FoodMongo, String> {

}
