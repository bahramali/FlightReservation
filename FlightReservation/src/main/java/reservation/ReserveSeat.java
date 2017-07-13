package reservation;

public class ReserveSeat {
	private Flight theFlight;
	private boolean isItFirstClass;
	private int seat;
	private int cost;

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
	}

	public int getSeat() {
		return seat;
	}

	public int getCost() {
		return cost;
	}

}
