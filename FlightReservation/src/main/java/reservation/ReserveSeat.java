 package reservation;

import java.time.LocalDate;
import java.util.Scanner;

public class ReserveSeat {
	private boolean isItFirstClass;
	private int seat;
	private double cost;
	private LocalDate flightDate;

	public ReserveSeat(Flight flight,boolean isItFirstClass) {
		this.isItFirstClass=isItFirstClass;
		Scanner keyboard = new Scanner(System.in);		
		String inputText;

		this.flightDate=flight.getDate();

		if (isItFirstClass){
			if (flight.noMoreFirstClassSeatsAvailable()) {
				System.out.println("No free first class seats available");
				System.out.println("Would you like to book a Economy Class seat instead? (Yes/No)");
				inputText = keyboard.next();
				if (inputText.equals("Yes")) {
					if (flight.noMoreEconomyClassSeatsAvailable()) {
					System.out.println("No free Economy class seats available");
					this.seat=0;
				} 	else {
					this.seat=flight.getAEconomyClassSeat();}
				}else {
					this.seat=0;}			
				}
			else {
				this.seat=flight.getAFirstClassSeat();
			}
		}else{
			if (flight.noMoreEconomyClassSeatsAvailable()) {
				System.out.println("No free Economy class seats available");
				System.out.println("Would you like to book a First Class seat instead? (Yes/No)");
				inputText = keyboard.next();
				if (inputText.equals("Yes")) {
					if (flight.noMoreFirstClassSeatsAvailable()) {
					System.out.println("No free first class seats available");
					this.seat=0;
				} 	else {
					this.seat=flight.getAFirstClassSeat();}
				}else {
					this.seat= 0;}			
				}
			else {
				this.seat=flight.getAEconomyClassSeat();
			}
			
		}
	
	}

	public int getSeat() { 
		return seat;
	}

	public double getCost() {
		return cost;
	}

	public LocalDate getFlightDate() {
		return flightDate;
	}

	public boolean isItFirstClass() {
		return isItFirstClass;
	}

}
