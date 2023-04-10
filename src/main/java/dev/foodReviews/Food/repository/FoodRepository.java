package dev.foodReviews.Food.repository;


import dev.foodReviews.Food.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FoodRepository extends JpaRepository<Food,Long> {

    /*@Query("Select f from food where id = :id")
    Food findByFoodId(long id);*/
}
