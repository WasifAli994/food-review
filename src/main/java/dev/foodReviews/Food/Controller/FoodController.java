package dev.foodReviews.Food.Controller;

import dev.foodReviews.Food.DTO.FoodDTO;
import dev.foodReviews.Food.model.Food;
import dev.foodReviews.Food.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public ResponseEntity<List<Food>> getAllMovies(){
        return new ResponseEntity<List<Food>>(foodService.getAllFoods(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<FoodDTO> getFood(@PathVariable String id) throws Exception {

        return ResponseEntity.ok(foodService.getFood(id));
    }

    @PostMapping
    public ResponseEntity<FoodDTO> createFood(@RequestBody FoodDTO foodDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(foodService.create(foodDTO));
    }
}
