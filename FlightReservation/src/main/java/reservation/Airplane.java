package reservation;


import java.util.LinkedList;

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
		int count=1;
		this.listOfFreeEconomyClassSeats = new LinkedList<Integer>();
		this.listOfFreeFirstClassSeats = new LinkedList<Integer>();

		while (count<this.MaxNumberOfEconomyClassSeats) {
			this.listOfFreeEconomyClassSeats.add(count++);

		}
		int sum =  this.MaxNumberOfEconomyClassSeats+this.MaxNumberOfFirstClassSeats;
		while (count<sum) {
			this.listOfFreeFirstClassSeats.add(count++);	
		}
	}

	public int getMaxNumberOfEconomyClassSeats() {
		return MaxNumberOfEconomyClassSeats;
	}

	public int getMaxNumberOfFirstClassSeats() {
		return MaxNumberOfFirstClassSeats;
	}
	
	
}
