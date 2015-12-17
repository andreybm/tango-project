package com.tango.service.impl;

import java.util.List;
import javax.jws.WebService;
import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tango.model.Login;
import com.tango.service.LoginManager;
import com.tango.dao.LoginDao;

@Transactional
@Service("LoginManager")
@WebService(serviceName = "LoginService", endpointInterface = "com.tango.service.LoginManager")
public class LoginManagerImpl extends GenericManagerImpl<Login, Long> implements LoginManager {
	
	LoginDao loginDao;

	public LoginManagerImpl() 
	{
		
	}

	@Autowired
	public LoginManagerImpl(LoginDao loginDao) 
	{
		super(loginDao);
		this.loginDao = loginDao;
	}

	
	@Override
	public Boolean isValidStudent(String username, String password) 
	{
		// TODO Auto-generated method stub
		Boolean auth = new Boolean(false);
		List<Login> loginList = loginDao.findByUsername(username);
		
		if (loginList.size() > 0) 
		{
			Login login = loginList.get(0);

			if (login.getPassword().equals(password))
			{
				auth = true;
			} 
			else 
			{
			}
		}		
		return auth;
	}


}
