package com.tango.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.appfuse.model.BaseObject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;
import java.util.Set;


@SuppressWarnings("serial")
@XmlRootElement(name = "Menu")
@Entity
@Table(name = "menu")
public class Menu extends BaseObject{

	private Long menuId;
	private Set<Employee> employee;
	private Set<Food> food;
	
	
	// START SNIPPET: menuId
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "menu_id", unique = true, nullable = false)
	
	public Long getMenuId() {
		return menuId;
	}
	
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	
	@Column(name = "employe_id", length = 50)
	public Set<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	
	@ManyToOne(fetch = FetchType.LAZY, mappedBy = "Menu", cascade = CascadeType.ALL)
	@Column(name = "food_id", length = 50)
	public Set<Food> getFood() {
		return food;
	}
	public void setFood(Set<Food> food) {
		this.food = food;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + ((menuId == null) ? 0 : menuId.hashCode());
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
		Menu other = (Menu) obj;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (food == null) {
			if (other.food != null)
				return false;
		} else if (!food.equals(other.food))
			return false;
		if (menuId == null) {
			if (other.menuId != null)
				return false;
		} else if (!menuId.equals(other.menuId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", employee=" + employee + ", food=" + food + "]";
	}
	

	
}
