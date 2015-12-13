package com.tango.service.impl;

import java.util.List;
import javax.jws.WebService;
import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tango.model.Menu;
import com.tango.service.MenuManager;
import com.tango.dao.FoodDao;
import com.tango.dao.MenuDao;


@Transactional
@Service("MenuManager")
@WebService(serviceName = "MenuService", endpointInterface = "com.tango.service.MenuManager")
public class MenuManagerImpl extends GenericManagerImpl<Menu, Long> implements MenuManager{

	MenuDao menudao;
	
	@Autowired
	public MenuManagerImpl(MenuDao menudao) {
		super(MenuDao);
		this.menudao = menudao;
	}

	@Override
	public List<Menu> getMenu() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
