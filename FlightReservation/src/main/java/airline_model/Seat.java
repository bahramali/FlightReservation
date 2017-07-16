package airline_model;

public class Seat {
	private String name;
	private double price;
	private TypeOfSeat typeOfSeat;
	private boolean valid;
	
	public Seat(String name,TypeOfSeat typeOfSeat,double price){
		this.name = name;
		this.typeOfSeat = typeOfSeat;
		this.valid = true;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public TypeOfSeat getTypeOfSeat() {
		return typeOfSeat;
	}

	public boolean isValid() {
		return valid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setTypeOfSeat(TypeOfSeat typeOfSeat) {
		this.typeOfSeat = typeOfSeat;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	@Override
	public String toString() {
		return String.format("%-4s%-17s%-8.2f", name,typeOfSeat,price);
	}
	
}
