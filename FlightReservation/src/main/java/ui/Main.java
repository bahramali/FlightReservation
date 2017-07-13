package ui;

import java.util.ArrayList;

import reservation.Airplane;
import reservation.City;
import reservation.Flight;
import reservation.Reservation;

public class Main {
	
	public static void main(String[] args) {

		City stock = new City("Stockholm");
		City tehrn = new City("tehran");
		
		System.out.println(stock.getLocalTime()+" "+tehrn.getLocalTime());

		Airplane thisplane = new Airplane();
		Flight firstFlight =new Flight(thisplane);
		
//		ArrayList<Reservation> allReservations = new ArrayList<Reservation>();
//		Reservation firstTicket = new Reservation(firstFlight);
//		allReservations.add(firstTicket);
		
	}
}
