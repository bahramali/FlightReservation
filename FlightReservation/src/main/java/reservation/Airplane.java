package reservation;

public class Airplane {
	private int MaxNumberOfEconomyClassSeats;
	private int MaxNumberOfFirstClassSeats;

	public Airplane(int maxNumberOfEconomyClassSeats, int maxNumberOfFirstClassSeats) {
		super();
		this.MaxNumberOfEconomyClassSeats = maxNumberOfEconomyClassSeats;
		this.MaxNumberOfFirstClassSeats = maxNumberOfFirstClassSeats;		

	}

	public Airplane() {
		super();
		this.MaxNumberOfEconomyClassSeats = 5;
		this.MaxNumberOfFirstClassSeats = 5;
	}

	public int getMaxNumberOfEconomyClassSeats() {
		return MaxNumberOfEconomyClassSeats;
	}

	public int getMaxNumberOfFirstClassSeats() {
		return MaxNumberOfFirstClassSeats;
	}
	
	
}
