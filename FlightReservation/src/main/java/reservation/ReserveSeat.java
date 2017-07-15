 package reservation;

import java.time.LocalDate;

public class ReserveSeat {
	private boolean isItFirstClass;
	private int seat;
	private double cost;
	private LocalDate flightDate;

	public ReserveSeat(Flight flight,boolean isItFirstClass) {
		this.isItFirstClass=isItFirstClass;
		this.seat=flight.reserveASeat(isItFirstClass);			
			if (this.seat==0) {this.cost=0.0;}
			else {if  (flight.isThisAFirstClassSeat(seat)) {
				this.cost=20000.0;
				this.isItFirstClass=true;}
			else {this.cost=5000.0;
				this.isItFirstClass=false;}
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
