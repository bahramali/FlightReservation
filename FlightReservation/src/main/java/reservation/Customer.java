package reservation;

public class Customer {

	private String name;
	private String passNumber;

	
	
	
	public Customer(String name, String passNumber) {
		super();
		this.name = name;
		this.passNumber = passNumber;

	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassNumber() {
		return passNumber;
	}


	public void setPassNumber(String passNumber) {
		this.passNumber = passNumber;
	}
	
	
}
