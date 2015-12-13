package com.tango.dto;

import com.tango.model.Category;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "food")
public class FoodDTO {
	private Long foodId;
	private Category[] category;
	private String dishName;
	private String dishDescription;
	private String daysServed;

	public FoodDTO() {
		super();
	}

	public FoodDTO(Long foodId, Category[] category, String dishName, String dishDescription, String daysServed) {
		super();
		this.foodId = foodId;
		this.category = category;
		this.dishName = dishName;
		this.dishDescription = dishDescription;
		this.daysServed = daysServed;

	}

	public Long getFoodId() {
		return foodId;
	}

	public void setFoodId(Long foodId) {
		this.foodId = foodId;
	}

	public Category[] getCategory() {
		return category;
	}

	public void setCategory(Category[] category) {
		this.category = category;
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

	@Override
	public String toString() {
		return "FoodDTO [foodId=" + foodId + ", dishName=" + dishName + ", dishDescription=" + dishDescription
				+ ", daysServed=" + daysServed + "]";
	}

	
}
