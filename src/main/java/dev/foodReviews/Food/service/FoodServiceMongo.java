package dev.foodReviews.Food.service;

import dev.foodReviews.Food.dto.FoodDTO;
import dev.foodReviews.Food.exception.FoodNotFoundException;
import dev.foodReviews.Food.mapper.FoodMapper;
import dev.foodReviews.Food.model.Food;
import dev.foodReviews.Food.repository.FoodRepositoryMongo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodServiceMongo {

    private final FoodRepositoryMongo foodRepositoryMongo;

    private final FoodMapper foodMapper;

    public List<Food> getAllFoods(){
        return foodRepositoryMongo.findAll();
    }

    public FoodDTO getFood(String id) throws Exception {

        Food food = foodRepositoryMongo.findById(id)
                .orElseThrow(() -> new FoodNotFoundException("Food not found"));
        return foodMapper.intoDTO(food);
    }

    public FoodDTO create(FoodDTO foodDTO) {

        Food food = foodMapper.intoDocument(foodDTO);
        Food savedFood = foodRepositoryMongo.save(food);
        return foodMapper.intoDTO(savedFood);
    }

    //constructor injection vs setter injection vs autowired
    //method reference
    //lambda expression
}
