package com.tango.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.appfuse.model.BaseObject;

@SuppressWarnings("serial")
@XmlRootElement
@Entity
@Table(name = "food")
public class Food extends BaseObject {
	private Long foodId;
	private Set<Category> category;
	private String dishName;
	private String dishDescription;
	private String daysServed;

	// START SNIPPET: foodId
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "food_id", unique = true, nullable = false)
	
	@ManyToOne
	public Long getFoodId() {
		return foodId;
	}
	// END SNIPET: personId

	public void setComidaId(Long foodId) {
		this.foodId = foodId;
	}

	@OneToMany
	public Set<Category> getCategory() {
		return category;
	}

	public void setCategory(Set<Category> category) {
		this.category = category;
	}

	@Column(name = "dish_name", length = 50)
	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	@Column(name = "dish_description", length = 50)
	public String getDishDescription() {
		return dishDescription;
	}

	public void setDishDescription(String dishDescription) {
		this.dishDescription = dishDescription;
	}

	@Column(name = "days_served", length = 50)
	public String getDaysServed() {
		return daysServed;
	}

	public void setDaysServed(String daysServed) {
		this.daysServed = daysServed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((daysServed == null) ? 0 : daysServed.hashCode());
		result = prime * result + ((dishDescription == null) ? 0 : dishDescription.hashCode());
		result = prime * result + ((dishName == null) ? 0 : dishName.hashCode());
		result = prime * result + ((foodId == null) ? 0 : foodId.hashCode());
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
		Food other = (Food) obj;
		if (daysServed == null) {
			if (other.daysServed != null)
				return false;
		} else if (!daysServed.equals(other.daysServed))
			return false;
		if (dishDescription == null) {
			if (other.dishDescription != null)
				return false;
		} else if (!dishDescription.equals(other.dishDescription))
			return false;
		if (dishName == null) {
			if (other.dishName != null)
				return false;
		} else if (!dishName.equals(other.dishName))
			return false;
		if (foodId == null) {
			if (other.foodId != null)
				return false;
		} else if (!foodId.equals(other.foodId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", dishName=" + dishName + ", dishDescription=" + dishDescription
				+ ", daysServed=" + daysServed + "]";
	}

}