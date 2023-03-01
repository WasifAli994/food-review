package dev.foodReviews.Food.mapper;

import dev.foodReviews.Food.dto.FoodDTO;
import dev.foodReviews.Food.model.Food;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FoodMapper {

    FoodDTO intoDTO(Food food);

    Food intoDocument(FoodDTO foodDTO);

}
