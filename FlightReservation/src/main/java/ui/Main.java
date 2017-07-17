package ui;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

import reservation.Airplane;
import reservation.City;
import reservation.Flight;
//import reservation.Reservation;
import reservation.ReserveSeat;

public class Main {
	
	public static void main(String[] args) {

		City stock = new City("Stockholm");
		City tehrn = new City("tehran");
		
//		Flight n1 = new Flight(stock,tehrn,LocalDate.of(2017, 10, 12));
//		
//		n1.getAllFlights()
		
		System.out.println(stock.getLocalTime()+" "+tehrn.getLocalTime());

		Airplane thisplane = new Airplane();
		Airplane secondPlane = new Airplane(12,7);
		Flight firstFlight =new Flight(thisplane);
		Flight secondFlight = new Flight(secondPlane,stock,tehrn,LocalDate.now());
		
//		ArrayList<Reservation> allReservations = new ArrayList<Reservation>();
//		Reservation firstTicket = new Reservation(firstFlight);
//		allReservations.add(firstTicket);
		int[] i = {2,3,4};//Code to understand how array-declaration work
		Integer[] j= new Integer[3];
		ReserveSeat[] manySeats=new ReserveSeat[13];
		for (int count=0;count<6;count++) {
			manySeats[count]=new ReserveSeat(firstFlight,true);
			System.out.println(manySeats[count].getSeat());
			System.out.println(manySeats[count].getCost());
		}
		for (int count=0;count<6;count++) {
			manySeats[count]=new ReserveSeat(firstFlight,false);
			System.out.println(manySeats[count].getSeat());
			System.out.println(manySeats[count].getCost());
		}
		for (int count=0;count<12;count++) {
			manySeats[count]=new ReserveSeat(secondFlight,true);
			System.out.println(manySeats[count].getSeat());
			System.out.println(manySeats[count].getCost());
		}
		for (int count=0;count<13;count++) {
			manySeats[count]=new ReserveSeat(secondFlight,false);
			System.out.println(manySeats[count].getSeat());
			System.out.println(manySeats[count].getCost());
		}
		double number=20000.0;
		System.out.println(number);
		
	}
}
