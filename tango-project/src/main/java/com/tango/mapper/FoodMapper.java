package com.tango.mapper;

import com.tango.dto.FoodDTO;
import com.tango.model.Food;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
	
	@Mapper
	public interface FoodMapper {

		FoodMapper INSTANCE = Mappers.getMapper(FoodMapper.class);

		List<FoodDTO> foodsToFoodsDTOs(List<Food> foods);
		
		@Mappings({ 
			@Mapping(source = "food_id", target = "foodId"),
			@Mapping(source = "category", target = "category"),		
			@Mapping(source = "dish_name", target = "dishName"), 
			@Mapping(source = "dish_description", target = "dishDescription"),
			@Mapping(source = "days_served", target = "daysServed") 
			})
		FoodDTO studentToStudentDTO(Food food);
	}
	

