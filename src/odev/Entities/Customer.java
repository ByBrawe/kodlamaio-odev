package odev.Entities;

public class Customer {
	
	private int Id;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private String nationalityId;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	} 
	
	
	

}
