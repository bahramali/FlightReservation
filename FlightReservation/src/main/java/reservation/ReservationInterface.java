package reservation;

public interface ReservationInterface {

	public abstract ReserveSeat(Flight flight,boolean isItFirstClass);
	
	public abstract int getSeat() ;
	//jag tror jikhk
	public abstract int getCost() ;
}
