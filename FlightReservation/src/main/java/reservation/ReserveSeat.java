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
		if (this.isItFirstClass){
			if (flight.outOfFirstClassSeats()) {
				System.out.println("No free first class seats available");
				System.out.println("Would you like to book a Economy Class seat instead? (Yes/No)");
				inputText = keyboard.next();
				if (inputText.equals("Yes")) {
					if (flight.outOfEconomyClassSeats()) {
					System.out.println("No free Economy class seats available");
					this.seat= 0;
					this.cost=0.0;
				} 	else {
					this.seat=flight.getAnEconomyClassSeat();
					this.cost=5000.0;
					this.isItFirstClass=false;}
				}else {
					this.seat= 0;
					this.cost=0.0;}			
				}
			else {
				this.seat=flight.getAFirstClassSeat();
				this.cost=20000.0;
			}
		}else{
			if (flight.outOfEconomyClassSeats()) {
				System.out.println("No free Economy class seats available");
				System.out.println("Would you like to book a First Class seat instead? (Yes/No)");
				inputText = keyboard.next();
				if (inputText.equals("Yes")) {
					if (flight.outOfFirstClassSeats()) {
					System.out.println("No free first class seats available");
					this.seat= 0;
					this.cost=0.0;
				} 	else {
					this.seat=flight.getAFirstClassSeat();
					this.cost=20000.0;
					this.isItFirstClass=true;}
				}else {
					this.seat= 0;
					this.cost=0.0;}			
				}
			else {
				this.seat=flight.getAnEconomyClassSeat();
				this.cost=5000.0;
			}
			
		}
		this.flightDate=flight.getDate();
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
