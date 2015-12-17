package com.tango.dto;

import com.tango.model.Food;
import com.tango.model.Category;
import com.tango.model.Employee;

import java.util.Arrays;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "menu")
public class MenuDTO {
	private Long menuId;
	private Food[] food;
	private Employee[] employee;
	
	public MenuDTO() {
		super();
	}
	
	
	public MenuDTO(Long menuId, Food[] food, Employee[] employee) {
		super();
		this.menuId = menuId;
		this.food = food;
		this.employee = employee;
	}


	public Long getMenuId() {
		return menuId;
	}


	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}


	public Food[] getFood() {
		return food;
	}


	public void setFood(Food[] food) {
		this.food = food;
	}


	public Employee[] getEmployee() {
		return employee;
	}


	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}


	@Override
	public String toString() {
		return "MenuDTO [menuId=" + menuId + ", food=" + Arrays.toString(food) + ", employee="
				+ Arrays.toString(employee) + "]";
	}
	
	
	
}
