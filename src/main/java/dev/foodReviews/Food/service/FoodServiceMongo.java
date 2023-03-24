package dev.foodReviews.Food.service;

import dev.foodReviews.Food.dto.FoodDTO;
import dev.foodReviews.Food.exception.FoodNotFoundException;
import dev.foodReviews.Food.mapper.FoodMapper;
import dev.foodReviews.Food.model.FoodMongo;
import dev.foodReviews.Food.repository.FoodRepositoryMongo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodServiceMongo {

    private final FoodRepositoryMongo foodRepositoryMongo;

    private final FoodMapper foodMapper;

    public List<FoodMongo> getAllFoods(){
        return foodRepositoryMongo.findAll();
    }

    public FoodDTO getFood(String id) throws Exception {

        FoodMongo foodMongo = foodRepositoryMongo.findById(id)
                .orElseThrow(() -> new FoodNotFoundException("Food not found"));
        return foodMapper.intoDTO(foodMongo);
    }

    public FoodDTO create(FoodDTO foodDTO) {

        FoodMongo foodMongo = foodMapper.intoDocument(foodDTO);
        FoodMongo savedFoodMongo = foodRepositoryMongo.save(foodMongo);
        return foodMapper.intoDTO(savedFoodMongo);
    }

    //constructor injection vs setter injection vs autowired
    //method reference
    //lambda expression
}
