package dev.foodReviews.Food.Service;

import dev.foodReviews.Food.Model.Food;
import dev.foodReviews.Food.Repository.FoodRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> getAllFoods(){
        return foodRepository.findAll();
    }

    public Optional<Food> getFood(ObjectId id){
        return foodRepository.findById(id);
    }
}
