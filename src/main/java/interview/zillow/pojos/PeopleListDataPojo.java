package interview.zillow.pojos;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import interview.zillow.db.entity.People;

/**
 * @author Ankit Verma
 *
 */
@XmlRootElement
public class PeopleListDataPojo {
	
	private List<People> people;
	
	public PeopleListDataPojo(){
		
	}
	
	public PeopleListDataPojo(List<People> people){
		this.people = people;
	}

	public List<People> getPeople() {
		return people;
	}

	public void setPeople(List<People> people) {
		this.people = people;
	}
	
	
}
