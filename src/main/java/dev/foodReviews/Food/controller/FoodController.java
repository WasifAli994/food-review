package dev.foodReviews.Food.controller;

import dev.foodReviews.Food.model.Food;
import dev.foodReviews.Food.service.FoodService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sql/api/v1/food")
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public ResponseEntity<List<Food>> getAllFoods(){
        return new ResponseEntity<>(foodService.getAllFood(),HttpStatus.OK);
    }

    @PostMapping
    public void createFood(@RequestBody Food food){
        foodService.createFood(food);
    }
    /*@GetMapping("/{foodId}")
    public ResponseEntity<Food> getFoodById(@PathVariable long foodId){
        return new ResponseEntity<>(foodService.foodById(foodId),HttpStatus.OK);
    }*/
}
