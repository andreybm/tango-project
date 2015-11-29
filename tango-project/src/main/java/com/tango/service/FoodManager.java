package com.tango.service;

import org.appfuse.service.GenericManager;

import com.tango.model.Food;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import java.util.List;
	
	@WebService
	@Path("/menu")
	public interface FoodManager extends GenericManager<Food, Long> {

		
	

}
