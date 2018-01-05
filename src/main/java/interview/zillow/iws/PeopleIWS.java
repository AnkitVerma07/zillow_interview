package interview.zillow.iws;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import interview.zillow.db.entity.People;
import interview.zillow.db.entity.User;
import interview.zillow.information.PeopleInformation;
import interview.zillow.pojos.PeopleDataPojo;
import interview.zillow.pojos.PeopleListDataPojo;
import interview.zillow.pojos.UserDataPojo;
/**
 * @author Ankit_Nebula
 * restful services connection layer
 */
@Path("/people")
public class PeopleIWS {
	private PeopleInformation peopleInformation;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response peopleInformationPojo (PeopleDataPojo personData){
		peopleInformation = new PeopleInformation();
		People insertPeople = peopleInformation.InsertPeople(personData);
		return Response.ok()
				.entity(insertPeople)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.allow("OPTIONS").build();
	}
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response userPeoplePojo (@QueryParam("sortField") String sortField,@QueryParam("ascending") String ascending) throws NoSuchFieldException, SecurityException{
		peopleInformation = new PeopleInformation();
		PeopleListDataPojo people = peopleInformation.fetchAllPeople(sortField,ascending);
		return Response.ok()
				.entity(people)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.allow("OPTIONS").build();
	}
}
