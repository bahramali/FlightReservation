package reservation;

import java.time.LocalDate;
import java.util.List;

public interface ReservationInterface {

	
	public abstract List<Reservation> getAllReservations();
	
	public abstract City getFrom();

	public abstract City getTo(); 

	public abstract LocalDate getStartDate(); 
	
	public abstract LocalDate getArriveDate();getAllReservations

}
