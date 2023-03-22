package dev.foodReviews.Food.service;

import dev.foodReviews.Food.dto.FoodDTO;
import dev.foodReviews.Food.model.FoodSQL;
import dev.foodReviews.Food.repository.FoodRepositorySQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceSQL {

    private final FoodRepositorySQL foodRepositorySQL;

    @Autowired
    public FoodServiceSQL(FoodRepositorySQL foodRepositorySQL) {
        this.foodRepositorySQL = foodRepositorySQL;
    }

    public void createFood(FoodSQL food){

        foodRepositorySQL.save(food);
        System.out.println("Added new Food!");
    }

    public List<FoodSQL> getAllFood(){
        return foodRepositorySQL.findAll();
    }
}
