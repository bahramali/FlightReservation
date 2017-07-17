package reservation;

import java.time.LocalDate;
import java.util.LinkedList;


public class Flight {
	private LinkedList<Integer> listOfFreeEconomyClassSeats;
	private LinkedList<Integer> listOfFreeFirstClassSeats;
	private LocalDate date; 
	
	public Flight(Airplane flyingMachine) {
		int maxNumberOfEconomyClassSeats=flyingMachine.getMaxNumberOfEconomyClassSeats();
		int maxNumberOfFirstClassSeats=flyingMachine.getMaxNumberOfFirstClassSeats();
		this.date=LocalDate.now();
		int count=1;
		this.listOfFreeFirstClassSeats=new LinkedList<Integer>();
		while (count<=maxNumberOfFirstClassSeats) {
		this.listOfFreeFirstClassSeats.add(count++);
		}
		
		int sum =  maxNumberOfEconomyClassSeats+maxNumberOfFirstClassSeats;
		this.listOfFreeEconomyClassSeats=new LinkedList<Integer>();
		while (count<=sum) {
			this.listOfFreeEconomyClassSeats.add(count++);		
		}
	}

	public Flight(Airplane flyingMachine, City source, City destination,LocalDate flightDate) {
		int maxNumberOfEconomyClassSeats=flyingMachine.getMaxNumberOfEconomyClassSeats();
		int maxNumberOfFirstClassSeats=flyingMachine.getMaxNumberOfFirstClassSeats();
		this.date=flightDate;
		this.listOfFreeFirstClassSeats=new LinkedList<Integer>();
		int count=1;
		while (count<=maxNumberOfFirstClassSeats) {
		this.listOfFreeFirstClassSeats.add(count++);
		}
		
		this.listOfFreeEconomyClassSeats=new LinkedList<Integer>();
		int sum =  maxNumberOfEconomyClassSeats+maxNumberOfFirstClassSeats;
		while (count<=sum) {
			this.listOfFreeEconomyClassSeats.add(count++);		
		}
	}		
	


	public LocalDate getDate() {
		return date;
	}

int getAFirstClassSeat(){
	return this.listOfFreeFirstClassSeats.pollFirst();
}

int getAnEconomyClassSeat(){
	return this.listOfFreeEconomyClassSeats.pollFirst();
}

public boolean outOfFirstClassSeats(){
	return this.listOfFreeFirstClassSeats.isEmpty();
}

public boolean outOfEconomyClassSeats(){
	return this.listOfFreeEconomyClassSeats.isEmpty();
}

}
