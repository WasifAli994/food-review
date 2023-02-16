package dev.foodReviews.Food.Controller;

import dev.foodReviews.Food.Model.Food;
import dev.foodReviews.Food.Service.FoodService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public ResponseEntity<List<Food>> allMovies(){
        return new ResponseEntity<List<Food>>(foodService.getAllFoods(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Food>> getMovie(@PathVariable ObjectId id){

        return new ResponseEntity<Optional<Food>>(foodService.getFood(id), HttpStatus.OK);
    }

}
