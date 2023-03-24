package dev.foodReviews.Food.service;

import dev.foodReviews.Food.model.Food;
import dev.foodReviews.Food.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    @Autowired
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public void createFood(Food food){

        foodRepository.save(food);
        System.out.println("Added new Food!");
    }

    public List<Food> getAllFood(){
        return foodRepository.findAll();
    }
}
