package reservation;

import java.time.LocalDate;
import java.util.*;


public class Flight {
	private LinkedList<Integer> listOfFreeEconomyClassSeats;
	private LinkedList<Integer> listOfFreeFirstClassSeats;
	private Airplane flyingMachine;
	private int MaxNumberOfEconomyClassSeats;
	private int MaxNumberOfFirstClassSeats;
	private City source;
	private City destination;
	private LocalDate startDate;
	private LocalDate arriveDate;
	
	public Flight(Airplane flyingMachine) {
		super();
		this.flyingMachine = flyingMachine;
		this.MaxNumberOfEconomyClassSeats=this.flyingMachine.getMaxNumberOfEconomyClassSeats();
		this.MaxNumberOfFirstClassSeats=this.flyingMachine.getMaxNumberOfFirstClassSeats();
		this.source=null;
		this.destination=null;
		this.startDate=LocalDate.now();
		this.arriveDate=LocalDate.now();
		int count=1;
		this.listOfFreeFirstClassSeats=new LinkedList<Integer>();
		while (count<MaxNumberOfFirstClassSeats) {
		this.listOfFreeFirstClassSeats.add(count++);
		}
		
		int sum =  this.MaxNumberOfEconomyClassSeats+this.MaxNumberOfFirstClassSeats;
		this.listOfFreeEconomyClassSeats=new LinkedList<Integer>();
		while (count<sum) {
			this.listOfFreeEconomyClassSeats.add(count++);		
		}
	}

	public Flight(Airplane flyingMachine, City source, City destination,LocalDate startDate,LocalDate arriveDate) {
		super();
		this.flyingMachine = flyingMachine;
		this.MaxNumberOfEconomyClassSeats=this.flyingMachine.getMaxNumberOfEconomyClassSeats();
		this.MaxNumberOfFirstClassSeats=this.flyingMachine.getMaxNumberOfFirstClassSeats();
		this.source=source;
		this.destination=destination;
		this.startDate=startDate;
		this.arriveDate=arriveDate;
		this.listOfFreeFirstClassSeats=new LinkedList<Integer>();
		int count=1;
		while (count<MaxNumberOfFirstClassSeats) {
		this.listOfFreeFirstClassSeats.add(count++);
		}
		
		this.listOfFreeEconomyClassSeats=new LinkedList<Integer>();
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

	public City getSource() {
		return source;
	}

	public City getDestination() {
		return destination;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getArriveDate() {
		return arriveDate;
	}

}
