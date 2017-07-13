package reservation;

import java.util.*;


public class Flight {
	private LinkedList<Integer> listOfFreeEconomyClassSeats;
	private LinkedList<Integer> listOfFreeFirstClassSeats;
	private Airplane flyingMachine;
	private int MaxNumberOfEconomyClassSeats;
	private int MaxNumberOfFirstClassSeats;
	
	public Flight(Airplane flyingMachine) {
		super();
		this.flyingMachine = flyingMachine;
		this.MaxNumberOfEconomyClassSeats=this.flyingMachine.getMaxNumberOfEconomyClassSeats();
		this.MaxNumberOfFirstClassSeats=this.flyingMachine.getMaxNumberOfFirstClassSeats();
		
		int count=1;
		while (count<MaxNumberOfFirstClassSeats) {
		this.listOfFreeFirstClassSeats.add(count++);
		}
		
		int sum =  this.MaxNumberOfEconomyClassSeats+this.MaxNumberOfFirstClassSeats;
		while (count<sum) {
			this.listOfFreeEconomyClassSeats.add(count++);		
		}
	}

	public int reserveAnEconomyClassSeat() {
	if (listOfFreeEconomyClassSeats.isEmpty()) {
		System.out.println("No free economy class seats available");
		return 0;}
	else return listOfFreeEconomyClassSeats.pollFirst();
	}

	public int reserveAFirstClassSeat() {
	if (listOfFreeFirstClassSeats.isEmpty()) {
		System.out.println("No free first class seats available");
		return 0;}
	else return listOfFreeFirstClassSeats.pollFirst();
	}

}
