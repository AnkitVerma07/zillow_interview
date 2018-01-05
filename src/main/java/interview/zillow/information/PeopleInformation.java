package interview.zillow.information;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import interview.zillow.db.entity.People;
import interview.zillow.db.entity.User;
import interview.zillow.db.repository.UserRepo;
import interview.zillow.pojos.PeopleDataPojo;
import interview.zillow.pojos.PeopleListDataPojo;
import interview.zillow.pojos.UserDataPojo;
import interview.zillow.service.PeopleService;
/**
 * @author Ankit Verma
 *
 */
public class PeopleInformation {
	private UserRepo userRepo;
	private PeopleService peopleService;
	private People personEntity;
	
	
	public People InsertPeople(PeopleDataPojo personData){	
		personEntity = new People();	
		personEntity.setSsn(personData.getSsn());
		personEntity.setDateOfBirth(personData.getDateOfBirth());
		personEntity.setFirstName(personData.getFirstName());
		personEntity.setLastName(personData.getLastName());
		personEntity.setHeightIn(personData.getHeightIn());
		personEntity.setWeightLb(personData.getWeightLb());
		userRepo = new UserRepo();
		userRepo.postPersonData(personEntity);
		return personEntity;
	}

	
	public PeopleListDataPojo fetchAllPeople(String sortField, String ascending) throws NoSuchFieldException, SecurityException{	
		List<People> people = new ArrayList<People>();
		userRepo = new UserRepo();
		people = userRepo.getAllPeople();
		if(sortField != null || ascending != null){
			List<People> sortedPeople = new ArrayList<People>();
			peopleService = new PeopleService();
			sortedPeople = peopleService.sort(people, sortField, ascending);
			PeopleListDataPojo peopleList = new PeopleListDataPojo();
			peopleList.setPeople(sortedPeople);
			return peopleList;
		}else{
			PeopleListDataPojo peopleList = new PeopleListDataPojo();
			peopleList.setPeople(people);
			return peopleList;
		}
	}

}
