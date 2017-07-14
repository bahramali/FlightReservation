package reservation;

import java.time.LocalDate;
//import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;


public class Flight {
	private LinkedList<Integer> listOfFreeEconomyClassSeats;
	private LinkedList<Integer> listOfFreeFirstClassSeats;
	private Airplane airCraft;
	private City source;
	private City destination;
	private LocalDate date; 
	
	public Flight(Airplane flyingMachine) {
		this.airCraft = flyingMachine;
		int maxNumberOfEconomyClassSeats=this.airCraft.getMaxNumberOfEconomyClassSeats();
		int maxNumberOfFirstClassSeats=this.airCraft.getMaxNumberOfFirstClassSeats();
		this.source=null;
		this.destination=null;
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
		this.airCraft = flyingMachine;
		int maxNumberOfEconomyClassSeats=this.airCraft.getMaxNumberOfEconomyClassSeats();
		int maxNumberOfFirstClassSeats=this.airCraft.getMaxNumberOfFirstClassSeats();
		this.source=source;
		this.destination=destination;
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

	public int reserveAnEconomyClassSeat() {
		Scanner keyboard = new Scanner(System.in);
		String inputText;
	if (listOfFreeEconomyClassSeats.isEmpty()) {
		System.out.println("No free Economy class seats available");
		System.out.println("Would you like to book a First Class seat instead? (Yes/No)");
		inputText = keyboard.next();
		if (inputText.equals("Yes")) {
			if (listOfFreeFirstClassSeats.isEmpty()) {
			System.out.println("No free first class seats available");
			return 0;
		} 	else {
			return listOfFreeFirstClassSeats.pollFirst();}
		}else {
			return 0;}			
		}
	else {
		return listOfFreeEconomyClassSeats.pollFirst();
	}
	
		}
		
		
	

	public int reserveAFirstClassSeat() {
		Scanner keyboard = new Scanner(System.in);		
		String inputText;
	if (listOfFreeFirstClassSeats.isEmpty()) {
		System.out.println("No free first class seats available");
		System.out.println("Would you like to book a Economy Class seat instead? (Yes/No)");
		inputText = keyboard.next();
		if (inputText.equals("Yes")) {
			if (listOfFreeEconomyClassSeats.isEmpty()) {
			System.out.println("No free Economy class seats available");
			return 0;
		} 	else {
			return listOfFreeEconomyClassSeats.pollFirst();}
		}else {
			return 0;}			
		}
	else {
		return listOfFreeFirstClassSeats.pollFirst();
	}}
	

	public City getSource() {
		return source;
	}

	public City getDestination() {
		return destination;
	}

	public LocalDate getDate() {
		return date;
	}

public boolean isThisAFirstClassSeat(int seatNumber) {
	return (seatNumber<=this.airCraft.getMaxNumberOfFirstClassSeats());
}
}
