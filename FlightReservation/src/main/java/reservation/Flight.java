package reservation;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;


public class Flight {
	private LinkedList<Integer> listOfFreeEconomyClassSeats;
	private LinkedList<Integer> listOfFreeFirstClassSeats;
	private LocalDate date; 
	private int maxNumberOfFirstClassSeats;
	
	public Flight(Airplane flyingMachine) {
		this.maxNumberOfFirstClassSeats = flyingMachine.getMaxNumberOfFirstClassSeats();
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
		this.maxNumberOfFirstClassSeats = flyingMachine.getMaxNumberOfFirstClassSeats();
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
	
	public int reserveASeat(boolean wantFirstClass) {
		Scanner keyboard = new Scanner(System.in);		
		String inputText;
		if (wantFirstClass){
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
			}
		}else{
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
			
		}}


	public LocalDate getDate() {
		return date;
	}

public boolean isThisAFirstClassSeat(int seatNumber) {
	return (seatNumber<=this.maxNumberOfFirstClassSeats);
}
}
