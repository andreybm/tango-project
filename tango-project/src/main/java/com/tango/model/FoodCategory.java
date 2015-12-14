package com.tango.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.appfuse.model.BaseObject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@SuppressWarnings("serial")
@XmlRootElement(name = "FoodCategory")
@Entity
@Table(name = "food_category")
public class FoodCategory extends BaseObject {

	private Long categoryId;
	private Food food;
	private String categoryName;
	private String categoryDescription;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "category_id", unique = true, nullable = false)
	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	@ManyToOne
	@JoinColumn(name = "food_id", nullable = false)
	@JsonIgnore
	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	@Column(name = "category_name", length = 50)
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Column(name = "category_descrpition", length = 50)
	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	@Override
	public int hashCode() {
		int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.categoryId);
        hash = 41 * hash + Objects.hashCode(this.categoryName);
        hash = 41 * hash + Objects.hashCode(this.categoryDescription);
        return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final FoodCategory other = (FoodCategory) obj;
		if (!Objects.equals(this.categoryId, other.categoryId)) {
            return false;
        }
		if (!Objects.equals(this.categoryName, other.categoryName)) {
            return false;
        }
		if (!Objects.equals(this.categoryDescription, other.categoryDescription)) {
            return false;
        }
		return true;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDescription="
				+ categoryDescription + "]";
	}

}
