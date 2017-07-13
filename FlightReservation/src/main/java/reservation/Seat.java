package models;

public class Seat {
	private String name;
	private TypeOfSeat typeOfSeat;
	private boolean valid;
	
	public Seat(String name,TypeOfSeat typeOfSeat,boolean valid)
	{
		this.name = name;
		this.typeOfSeat = typeOfSeat;
		this.valid = valid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeOfSeat getTypeOfSeat() {
		return typeOfSeat;
	}

	public void setTypeOfSeat(TypeOfSeat typeOfSeat) {
		this.typeOfSeat = typeOfSeat;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	@Override
	public String toString() {
		return name +" is "+ typeOfSeat+((valid)?" free":" busy");
	}
	

}
