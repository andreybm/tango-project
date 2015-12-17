package com.tango.model;

import java.util.Set;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private String dishName;
	private String dishDescription;
	private String daysServed;
	private Set<FoodCategory> foodCategory;

	// START SNIPPET: foodId
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "food_id", unique = true, nullable = false)
	
	public Long getFoodId() {
		return foodId;
	}
	// END SNIPET: personId

	public void setComidaId(Long foodId) {
		this.foodId = foodId;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "food", cascade = CascadeType.ALL)
	public Set<FoodCategory> getFoodCategory() {
		return foodCategory;
	}

	public void setFoodCategory(Set<FoodCategory> foodCategory) {
		this.foodCategory = foodCategory;
	}
	
	@Override
	public int hashCode() {
		  int hash = 3;
	        hash = 23 * hash + Objects.hashCode(this.foodId);
	        hash = 23 * hash + Objects.hashCode(this.dishName);
	        hash = 23 * hash + Objects.hashCode(this.dishDescription);
	        hash = 23 * hash + Objects.hashCode(this.daysServed);
	        return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Food other = (Food) obj;
		if (!Objects.equals(this.foodId, other.foodId)) {
            return false;
        }
		  if (!Objects.equals(this.dishName, other.dishName)) {
	            return false;
	        }
	        if (!Objects.equals(this.dishDescription, other.dishDescription)) {
	            return false;
	        }
	        if (!Objects.equals(this.daysServed, other.daysServed)) {
	            return false;
	        }
	        
	        return true;
	    }

	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", dishName=" + dishName + ", dishDescription=" + dishDescription
				+ ", daysServed=" + daysServed + "]";
	}

}