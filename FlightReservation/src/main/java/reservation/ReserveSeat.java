package reservation;

import java.time.LocalDate;

public class ReserveSeat {
	private Flight theFlight;
	private boolean isItFirstClass;
	private int seat;
	private int cost;
	private City from;
	private City to;
	private LocalDate startDate;
	private LocalDate arriveDate;

	public ReserveSeat(Flight flight,boolean isItFirstClass) {
		this.isItFirstClass=isItFirstClass;
		this.theFlight=flight;
		if (this.isItFirstClass) {
			this.seat=this.theFlight.reserveAFirstClassSeat();
			if (this.seat==0) {this.cost=0;}
			else {this.cost=20000;}
		}else {
			this.seat=this.theFlight.reserveAnEconomyClassSeat();
			if (this.seat==0) {this.cost=0;}
			else {this.cost=5000;}		
		}
		this.from=this.theFlight.getSource();
		this.to=this.theFlight.getDestination();
		this.startDate=this.theFlight.getStartDate();
		this.arriveDate=this.theFlight.getArriveDate();
	}

	public int getSeat() {
		return seat;
	}

	public int getCost() {
		return cost;
	}

	public City getFrom() {
		return from;
	}

	public City getTo() {
		return to;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getArriveDate() {
		return arriveDate;
	}

}
