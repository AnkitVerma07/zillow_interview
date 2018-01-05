package interview.zillow.iws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import interview.zillow.db.entity.User;
import interview.zillow.information.UserInformation;
import interview.zillow.pojos.UserDataPojo;

/**
 * @author Ankit_Nebula
 * restful services connection layer
 */
@Path("/users")
public class UserIWS {
	
	private UserInformation userInformation;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response userInformationPojo (UserDataPojo userData){
		userInformation = new UserInformation();
		User insertUser = userInformation.InsertPrimaryUserInfo(userData);
		return Response.ok()
				.entity(insertUser)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.allow("OPTIONS").build();
	}

}
