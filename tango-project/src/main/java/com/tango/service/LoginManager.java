package com.tango.service;

import java.util.List;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.appfuse.service.GenericManager;
import com.tango.model.Login;

@WebService
@Path("/Login")
public interface LoginManager extends GenericManager<Login, Long> {

	@GET
	@Path("/valid/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	Boolean isValidStudent(@QueryParam("username") String username, @QueryParam("password") String password);
}
