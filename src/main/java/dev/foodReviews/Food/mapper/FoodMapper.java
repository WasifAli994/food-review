package dev.foodReviews.Food.mapper;

import dev.foodReviews.Food.dto.FoodDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FoodMapper {

    FoodDTO intoDTO(FoodMongo foodMongo);

    FoodMongo intoDocument(FoodDTO foodDTO);

}
