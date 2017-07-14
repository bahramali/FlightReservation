package reservation;

import java.time.LocalDate;

public class ReserveSeat {
	private Flight theFlight;
	private boolean isItFirstClass;
	private int seat;
	private double cost;
	private City from;//TODO:Ta bort
	private City to;//TODO:Ta bort
	private LocalDate flightDate;

	public ReserveSeat(Flight flight,boolean isItFirstClass) {
		this.isItFirstClass=isItFirstClass;
		this.theFlight=flight;
		if (this.isItFirstClass) {
			this.seat=this.theFlight.reserveAFirstClassSeat();}
		else {
			this.seat=this.theFlight.reserveAnEconomyClassSeat();}
			
			if (this.seat==0) {this.cost=0.0;}
			else {if  (theFlight.isThisAFirstClassSeat(seat)) {
				this.cost=20000.0;}
			else {this.cost=5000.0;}
			}
		this.from=this.theFlight.getSource();
		this.to=this.theFlight.getDestination();
		this.flightDate=this.theFlight.getDate();
	}

	public int getSeat() { 
		return seat;
	}

	public double getCost() {
		return cost;
	}

	public City getFrom() {
		return from;
	}

	public City getTo() {
		return to;
	}

	public LocalDate getFlightDate() {
		return flightDate;
	}

}
