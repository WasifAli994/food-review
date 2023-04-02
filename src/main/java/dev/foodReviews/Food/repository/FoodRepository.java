package dev.foodReviews.Food.repository;


import dev.foodReviews.Food.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Long> {

    Food findByFoodId(long id);
}
