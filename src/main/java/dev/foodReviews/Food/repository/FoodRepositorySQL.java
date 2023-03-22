package dev.foodReviews.Food.repository;


import dev.foodReviews.Food.model.FoodSQL;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepositorySQL extends JpaRepository<FoodSQL,Long> {

}
