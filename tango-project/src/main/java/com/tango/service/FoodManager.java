package com.tango.service;

import com.tango.model.Food;
import org.appfuse.service.GenericManager;


import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import java.util.List;
	
	@WebService
	@Path("/food")
	public interface FoodManager extends GenericManager<Food, Long> {

		@GET
		@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
		List<Food> getFood();
		
		@POST
		@Path("/food/category}/")
		@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
		Food findByCategory(Food category);
		

}
