package com.yutobe.rest.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// ws.rs  http://localhost:8284/com.yutobe.rest/
// start : ..../api/
@Path("/v1/status")
public class V1_Status {
	
	/**
	 * This method sits at the root of the api.  It will return the name
	 * of this api.
	 * 
	 * @return String - Title of the api
	 */
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p>Java Web Service TEXT_HTML haha</p>";
	}
	// static : only one instance of this !!!
	private static final String api_version = "00.01.00"; //version of the api
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion() {
		return "<p>here <Version: </p> " +  api_version ;
	}
	
	

}
