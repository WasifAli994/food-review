package dev.foodReviews.Food.controller;

import dev.foodReviews.Food.dto.FoodDTO;
import dev.foodReviews.Food.model.Food;
import dev.foodReviews.Food.model.FoodSQL;
import dev.foodReviews.Food.service.FoodServiceSQL;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sql/api/v1/food")
public class FoodControllerSQL {

    private final FoodServiceSQL foodServiceSQL;

    public FoodControllerSQL(FoodServiceSQL foodServiceSQL) {
        this.foodServiceSQL = foodServiceSQL;
    }

    @GetMapping
    public ResponseEntity<List<FoodSQL>> getAllMovies(){
        return new ResponseEntity<>(foodServiceSQL.getAllFood(),HttpStatus.OK);
    }

    @PostMapping
    public void createFood(@RequestBody FoodSQL food){

        foodServiceSQL.createFood(food);
    }

}
