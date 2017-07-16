package reservation;

import java.util.*;

public class AirCraft {
	private final String model;

	private double EPrice;
	private double FPrice;
	
	private int numOfESeat;
	private int numOfFSeat;
	
	private List<Seat> seats;
	
	public AirCraft(int numOfFSeat, int numOfESeat, double FPrice,double EPrice,String model){
		
		seats = gernerateListOfSeat(numOfFSeat,numOfESeat,FPrice,EPrice);
		this.EPrice = EPrice;
		this.FPrice = FPrice;
		this.model = model;
	}
	
	private List<Seat> gernerateListOfSeat(int numOfFSeat,int numOfESeat,double FPrice,double EPrice){
		this.numOfESeat = numOfESeat;
		this.numOfFSeat = numOfFSeat;
		
		seats = new ArrayList<Seat>(numOfFSeat+numOfESeat);		
		int row = 1;
		for(int i = 0;i<numOfFSeat;i++){
			char n =(char) ('A'+(i%2));
			seats.add(new Seat((n+""+row),TypeOfSeat.FIRST_CLASS,FPrice));
			if((i+1)%2 ==0)
				row++;
		}
		for(int i =numOfFSeat ;i<numOfFSeat+numOfESeat;i++){
			char n =(char) ('A'+(i%4));
			seats.add(new Seat((n+""+row),TypeOfSeat.ECONOMY_CLASS,EPrice));
			if((i+1)%4 ==0)
				row++;
		}
		return new ArrayList<Seat>(seats);
	}

	public double getEPrice() {
		return EPrice;
	}

	public double getFPrice() {
		return FPrice;
	}

	public String getModel() {
		return model;
	}

	public int getNumOfESeat() {
		return numOfESeat;
	}
	
	public int getNumOfFSeat() {
		return numOfFSeat;
	}

	public List<Seat> getSeats() {
		return new ArrayList<Seat>(seats);
	}

	public void setEPrice(double ePrice) {
		EPrice = ePrice;
	}

	public void setFPrice(double fPrice) {
		FPrice = fPrice;
	}

	public void setNumOfESeat(int numOfESeat) {
		this.numOfESeat = numOfESeat;
	}

	public void setNumOfFSeat(int numOfFSeat) {
		this.numOfFSeat = numOfFSeat;
	}
	
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	
	@Override
	public String toString() {
		return String.format("%-10s has %-3d seats (%-3d firstclass and %-3d ecconomyClass)",model,(numOfESeat+numOfFSeat),numOfFSeat,numOfESeat);
	}
}
