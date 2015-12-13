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

@XmlRootElement(name = "Category")
@Entity
@Table(name = "category")
public class Category extends BaseObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryDescription == null) ? 0 : categoryDescription.hashCode());
		result = prime * result + ((categoryId == null) ? 0 : categoryId.hashCode());
		result = prime * result + ((categoryName == null) ? 0 : categoryName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (categoryDescription == null) {
			if (other.categoryDescription != null)
				return false;
		} else if (!categoryDescription.equals(other.categoryDescription))
			return false;
		if (categoryId == null) {
			if (other.categoryId != null)
				return false;
		} else if (!categoryId.equals(other.categoryId))
			return false;
		if (categoryName == null) {
			if (other.categoryName != null)
				return false;
		} else if (!categoryName.equals(other.categoryName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDescription="
				+ categoryDescription + "]";
	}

}
