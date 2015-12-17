package com.tango.dto;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlRootElement;
import com.tango.model.FoodCategory;

	@XmlRootElement(name = "food")
	public class FoodDTO {

		private Long foodId;
		private String dishName;
		private String dishDescription;
		private String daysServed;
		private FoodCategory[] foodCategory;
		
		public FoodDTO(){
			 super();
		}

		public FoodDTO(Long foodId, String dishName, String dishDescription, String daysServed, FoodCategory[] foodCategory ){
			 super();
			 
			 this.foodId = foodId;
			 this.dishName = dishName;
			 this.dishDescription = dishDescription;
			 this.daysServed = daysServed;
			 this.foodCategory = foodCategory;
		}
		
	
		public Long getFoodId() {
			return foodId;
		}

		public void setFoodId(Long foodId) {
			this.foodId = foodId;
		}

		public String getDishName() {
			return dishName;
		}

		public void setDishName(String dishName) {
			this.dishName = dishName;
		}

		public String getDishDescription() {
			return dishDescription;
		}

		public void setDishDescription(String dishDescription) {
			this.dishDescription = dishDescription;
		}

		public String getDaysServed() {
			return daysServed;
		}

		public void setDaysServed(String daysServed) {
			this.daysServed = daysServed;
		}

		public FoodCategory[] getFoodCategory() {
			return foodCategory;
		}

		public void setFoodCategory(FoodCategory[] foodCategory) {
			this.foodCategory = foodCategory;
		}

		@Override
		public String toString() {
			return "FoodDTO [foodId=" + foodId + ", dishName=" + dishName + ", dishDescription=" + dishDescription
					+ ", daysServed=" + daysServed + ", foodCategory=" + Arrays.toString(foodCategory) + "]";
		}

		
	
	
}
	