package com.tango.dao.hibernate;

import java.util.List;
import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import com.tango.model.Employee;
import com.tango.dao.EmployeeDao;

@Repository("employeeDao")
public class EmployeeDaoHibernate extends GenericDaoHibernate<Employee, Long>implements EmployeeDao {

	public EmployeeDaoHibernate()
	{
		super(Employee.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> findByName(String name)
	{
		return getSession().createCriteria(Employee.class).add(Restrictions.eq("name", name)).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> findById(Long employeeId)
	{
		return getSession().createCriteria(Employee.class).add(Restrictions.eq("employeeId", employeeId)).list();
	}
}
