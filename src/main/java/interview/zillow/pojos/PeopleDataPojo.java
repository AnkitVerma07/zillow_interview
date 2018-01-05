package interview.zillow.pojos;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;
/**
 * @author Ankit Verma
 *
 */
@XmlRootElement
public class PeopleDataPojo {
	private Long id;
	private String ssn;
	private Date dateOfBirth;
	private String firstName;
	private String lastName;
	private Double heightIn;
	private Double weightLb;
	
	public PeopleDataPojo(){
		
	}
	
	public PeopleDataPojo(Long id, String ssn, Date dateOfBirth, String firstName, String lastName, Double heightIn, Double weightLb){
		this.id = id;
		this.ssn = ssn;
		this.dateOfBirth = dateOfBirth;
		this.firstName = firstName;
		this.lastName = lastName;
		this.heightIn = heightIn;
		this.weightLb = weightLb;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getHeightIn() {
		return heightIn;
	}

	public void setHeightIn(Double heightIn) {
		this.heightIn = heightIn;
	}

	public Double getWeightLb() {
		return weightLb;
	}

	public void setWeightLb(Double weightLb) {
		this.weightLb = weightLb;
	}
	
	
}
