package reservation;

public class Customer {

	private String name;
	private String passNumber;

	public Customer(String name, String passNumber) {

		this.name = name;
		this.passNumber = passNumber;
	}
	public Customer(String name) {

		this.name = name;
		this.passNumber = "AN23423042";
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
