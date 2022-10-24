package myexercises;

public class Student {
	private int id;
	private String firstname;
	private String lastname;
	private String streetaddress;
	private int postcode;
	private String postoffice;

	public Student(int id, String firstname, String lastname, String streetaddress, int postcode, String postoffice) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.streetaddress = streetaddress;
		this.postcode = postcode;
		this.postoffice = postoffice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	public String getStreetAddress() {
		return streetaddress;
	}

	public void setStreetAddress(String streetaddress) {
		this.streetaddress = streetaddress;
	}
	
	public int getPostCode() {
		return postcode;
	}

	public void setPostCode(int postcode) {
		this.postcode = postcode;
	}
	
	public String getPostOffice() {
		return postoffice;
	}

	public void setPostOffice(String postoffice) {
		this.postoffice = postoffice;
	}
	
	
	
	@Override
	public String toString() {
		return id + ":" + firstname + " " + lastname + ", " + streetaddress + ", " + postcode + " " + postoffice;
	}
}
// End
