package com.tango.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "foodCategory")
public class FoodCategoryDTO {

	private Long categoryId;
	private String categoryName;
	private String categoryDescription;

	public FoodCategoryDTO() {
		super();
	}

	public FoodCategoryDTO(Long categoryId, String categoryName, String categoryDescription) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	@Override
	public String toString() {
		return "CategoryDTO [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDescription="
				+ categoryDescription + "]";
	}

}
