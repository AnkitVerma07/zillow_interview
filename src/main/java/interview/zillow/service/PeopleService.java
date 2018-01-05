package interview.zillow.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.lang.reflect.Field;

import interview.zillow.db.entity.People;

public class PeopleService {
	
	private People peopleEntity;
	public static String sortType;
	
	public List<People> sort(Iterable<People> people, String sortField, String ascending) throws NoSuchFieldException, SecurityException{
		sortType = ascending;
		List<People> sortedPeople = new ArrayList<People>();
//		peopleEntity = new People();
//		Class<?> someClass = peopleEntity.getClass();
//		Field someField = someClass.getField(sortField);
		Iterator iterator = people.iterator();
		while(iterator.hasNext()){
			sortedPeople.add((People) iterator.next());
		}
		if(sortField.equals("firstName")){
			Collections.sort(sortedPeople, FirstNameComparator);	
		}else if(sortField.equals("lastName")){
			Collections.sort(sortedPeople, LastNameComparator);	
		} else if(sortField.equals("ssn")){
			Collections.sort(sortedPeople, ssnComparator);	
		} else if(sortField.equals("dateOfBirth")){
			Collections.sort(sortedPeople, dateOfBirthComparator);	
		} else if(sortField.equals("heightIn")){
			Collections.sort(sortedPeople, heightComparator);	
		}else if(sortField.equals("weightLb")){
			Collections.sort(sortedPeople, weightComparator);	
		}
		return sortedPeople;
	}
	
	public static Comparator<People> FirstNameComparator  = new Comparator<People>() {
			public int compare(People p1, People p2) {
				String item1 = p1.getFirstName().toUpperCase();
				String item2 = p2.getFirstName().toUpperCase();
				if(sortType.equals("true")){
					return item1.compareTo(item2);
				}else{
					return item2.compareTo(item1);
				}
				}
	};
	
	public static Comparator<People> LastNameComparator  = new Comparator<People>() {
		public int compare(People p1, People p2) {
			String item1 = p1.getLastName().toUpperCase();
			String item2 = p2.getLastName().toUpperCase();
			if(sortType.equals("true")){
				return item1.compareTo(item2);
			}else{
				return item2.compareTo(item1);
			}
			}
};

public static Comparator<People> ssnComparator  = new Comparator<People>() {
	public int compare(People p1, People p2) {
		String item1 = p1.getSsn().toUpperCase();
		String item2 = p2.getSsn().toUpperCase();
		if(sortType.equals("true")){
			return item1.compareTo(item2);
		}else{
			return item2.compareTo(item1);
		}
		}
};

public static Comparator<People> dateOfBirthComparator  = new Comparator<People>() {
	public int compare(People p1, People p2) {
		Date item1 = p1.getDateOfBirth();
		Date item2 = p2.getDateOfBirth();
		if(sortType.equals("true")){
			return item1.compareTo(item2);
		}else{
			return item2.compareTo(item1);
		}
		}
};
	
public static Comparator<People> heightComparator  = new Comparator<People>() {
	public int compare(People p1, People p2) {
		Double item1 = p1.getHeightIn();
		Double item2 = p2.getHeightIn();
		if(sortType.equals("true")){
			return item1.compareTo(item2);
		}else{
			return item2.compareTo(item1);
		}
		}
};

public static Comparator<People> weightComparator  = new Comparator<People>() {
	public int compare(People p1, People p2) {
		Double item1 = p1.getWeightLb();
		Double item2 = p2.getWeightLb();
		if(sortType.equals("true")){
			return item1.compareTo(item2);
		}else{
			return item2.compareTo(item1);
		}
		}
};
	
}
