package movie;

import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;

/**
 * Data model for the Director entity which is part of the main entity Movie.
 * 
 * @author farahnisar
 *
 */
public class Director {
	@NotEmpty
	private long id;

	@NotEmpty
	private String firstName;

	@NotEmpty
	private String lastName;

	@NotEmpty
	private DateTime dob;

	private String biography;

	public Director() {
		// TODO Auto-generated constructor stub
	}

	public Director(long id, String firstName, String lastName, DateTime dob, String biography) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.biography = biography;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public DateTime getDob() {
		return dob;
	}

	public void setDob(DateTime dob) {
		this.dob = dob;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

}
