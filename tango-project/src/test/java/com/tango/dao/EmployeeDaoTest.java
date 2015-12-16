package com.tango.dao;

import org.appfuse.dao.BaseDaoTestCase;
import com.tango.model.Employee;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import java.util.List;
import static org.junit.Assert.*;

public class EmployeeDaoTest extends BaseDaoTestCase{

	@Autowired
    private EmployeeDao employeeDao;
	
	@Test
    public void testFindByName() throws Exception {
        List<Employee> employee = employeeDao.findByName("Julio");
        assertTrue(employee.size() > 0);
    }
	
	
	@Test(expected=DataAccessException.class)
    public void testAddAndRemovePerson() throws Exception {
        Employee employee = new Employee();
        employee.setName("Valeria");
	

        employee = employeeDao.save(employee);
        flush();

        employee = employeeDao.get(employee.getemployeeId());


	}
	
	
	
}
