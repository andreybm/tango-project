package com.tango.dao.hibernate;

import java.util.List;
import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import com.tango.dao.LoginDao;
import com.tango.model.Login;

@Repository("loginDao")
public class LoginDaoHibernate extends GenericDaoHibernate<Login, Long>implements LoginDao {

	public LoginDaoHibernate() {
		super(Login.class);
	}

	@Override
	public List<Login> findByUsername(String username) {
		return getSession().createCriteria(Login.class).add(Restrictions.eq("username", username)).list();
	}
}
