package com.tango.mapper;

import java.util.List;

import com.tango.dto.FoodDTO;
import com.tango.model.Food;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;


@Mapper
public interface FoodMapper {

	FoodMapper INSTANCE = Mappers.getMapper(FoodMapper.class);
	List<FoodDTO> foodToFoodsDTOs(List<Food> food);
	
	
	@Mappings({ 
		@Mapping(source = "foodId", target = "foodId"),		
		@Mapping(source = "dishName", target = "dishName"), 
		@Mapping(source = "dishDescription", target = "dishDescription"),
		@Mapping(source = "daysServed", target = "daysServed"),
		@Mapping(source = "foodCategory", target = "foodCategory")
		})
	FoodDTO foodToFoodDTO(Food food);

}