package reservation;

public interface ReservationInterface {

	public abstract ReserveSeat(Flight flight,boolean isItFirstClass);
	public abstract int getSeat() ;
	public abstract int getCost() ;
}
