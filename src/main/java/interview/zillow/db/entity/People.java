package interview.zillow.db.entity;

import java.sql.Date;
import java.util.Comparator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ankit Verma
 * 
 */
@Entity
@Table (name = "people")
public class People {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", columnDefinition = "serial")
	private Long id;
	private String ssn;
	private Date dateOfBirth;
	private String firstName;
	private String lastName;
	private Double heightIn;
	private Double weightLb;
	
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
