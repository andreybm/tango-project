package com.tango.dao;

import org.appfuse.dao.GenericDao;
import com.tango.model.Employee;
import java.util.List;

public interface EmployeeDao extends GenericDao<Employee, Long> {
	
	public List<Employee> findByName(String name);
	
	public List<Employee> findById(Long employeeId);
	
}
