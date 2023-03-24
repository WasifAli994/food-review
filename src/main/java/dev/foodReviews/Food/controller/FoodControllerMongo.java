package dev.foodReviews.Food.controller;

import dev.foodReviews.Food.dto.FoodDTO;
import dev.foodReviews.Food.model.FoodMongo;
import dev.foodReviews.Food.service.FoodServiceMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mongodb/api/v1/food")
public class FoodControllerMongo {

    @Autowired
    private FoodServiceMongo foodServiceMongo;

    @GetMapping
    public ResponseEntity<List<FoodMongo>> getAllMovies(){
        return new ResponseEntity<List<FoodMongo>>(foodServiceMongo.getAllFoods(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<FoodDTO> getFood(@PathVariable String id) throws Exception {

        return ResponseEntity.ok(foodServiceMongo.getFood(id));
    }

    @PostMapping
    public ResponseEntity<FoodDTO> createFood(@RequestBody FoodDTO foodDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(foodServiceMongo.create(foodDTO));
    }
}
