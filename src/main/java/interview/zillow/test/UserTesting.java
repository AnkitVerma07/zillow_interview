package interview.zillow.test;

import interview.zillow.information.UserInformation;
import interview.zillow.iws.PeopleIWS;
import interview.zillow.iws.UserIWS;
import interview.zillow.pojos.PeopleDataPojo;
import interview.zillow.pojos.UserDataPojo;

public class UserTesting {
	
	private static UserIWS userInformationIws;
	private static PeopleIWS peopleIws;
	private static UserDataPojo userEntity;
	private static PeopleDataPojo peopleEntity;
	private static UserInformation userInfo;
	private static UserInformation peopleInformation;

	public static void main(String[] args) {
		testPeopleInsert();
	}
	
	public static void testUserInsert(){
		userEntity = new UserDataPojo();
		userEntity.setFirst_name("ankit");
		userEntity.setLast_name("verma");
		userEntity.setPhone_number("9097172039");
		userEntity.setEmail("ankitv@uci.edu");
		userInformationIws = new UserIWS();
		userInformationIws.userInformationPojo(userEntity);
	}
	
	public static void testPeopleInsert(){
		peopleEntity = new PeopleDataPojo();
		peopleEntity.setFirstName("fnkit");
		peopleEntity.setLastName("verma");
		peopleEntity.setHeightIn(6.2);
		peopleIws = new PeopleIWS();
		peopleIws.peopleInformationPojo(peopleEntity);
		
	}

}
