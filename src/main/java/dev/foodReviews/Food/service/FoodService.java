package dev.foodReviews.Food.service;

import dev.foodReviews.Food.dto.FoodDTO;
import dev.foodReviews.Food.dto.FoodReviewDTO;
import dev.foodReviews.Food.mapper.FoodMapper;
import dev.foodReviews.Food.model.Food;
import dev.foodReviews.Food.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;

    private final FoodMapper foodMapper;

    public List<Food> getAllFoods(){
        return foodRepository.findAll();
    }

    public FoodDTO getFood(String id) throws Exception {

        Food food = foodRepository.findById(id)
                .orElseThrow(Exception::new);

        return foodMapper.intoDTO(food);
    }

    public FoodDTO create(FoodDTO foodDTO) {

        Food food = foodMapper.intoDocument(foodDTO);
        Food savedFood = foodRepository.save(food);
        return foodMapper.intoDTO(savedFood);
    }

    //constructor injection vs setter injection vs autowired
    //method reference
    //lambda expression
}
