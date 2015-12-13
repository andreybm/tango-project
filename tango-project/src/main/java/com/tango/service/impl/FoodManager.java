package com.tango.service.impl;

import java.util.List;
import javax.jws.WebService;
import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tango.model.Food;
import com.tango.service.FoodManager;
import com.tango.dao.FoodDao;

@Transactional
@Service("FoodManager")
@WebService(serviceName = "FoodService", endpointInterface = "com.tango.service.FoodManager")
public class FoodManagerImpl extends GenericManagerImpl<Food, Long> implements FoodManager {
	
		FoodDao foodDao;

public FoodManagerImpl() {
}

@Autowired
public FoodManagerImpl(FoodDao foodDao) {
	super(foodDao);
	this.foodDao = foodDao;
}

@Override
public List<Food> getFood() {
	// TODO Auto-generated method stub
	return null;
}

	

	

}