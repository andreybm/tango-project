package com.tango.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.appfuse.model.BaseObject;

@XmlRootElement
@Entity
@Table(name = "menu")
public class Menu extends BaseObject {

	private Long menuId;
	private Set<Food> food;
	private Set<Employee> employee;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "menu_id", unique = true, nullable = false)
	public Long getMenuId() {
		return menuId;
	}

	public void setCategoryId(Long menuId) {
		this.menuId = menuId;
	}

	@OneToMany
	@JoinColumn(name = "food_id", nullable = false)
	public Set<Food> getFood() {
		return food;
	}

	public void setFood(Set<Food> food) {
		this.food = food;
	}

	@OneToMany
	@JoinColumn(name = "employee_id", nullable = false)
	public Set<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
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
		return "Menu [menuId=" + menuId + ", food=" + food + ", employee=" + employee + "]";
	}

}
