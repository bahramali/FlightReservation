package flight_model;

import java.time.*;
import java.util.*;

import airline_model.AirLine;
import airline_model.City;
import airline_model.Flight;

public class FlightTable_old {

	private AirLine airline;
	private List<Flight> flightsTable = new ArrayList<Flight>();

	public FlightTable_old(AirLine airLine) {
		this.airline = airLine;
	}

	public List<Flight> generateFlightTable(){
//		List<Flight> flightsTable = new ArrayList<Flight>();
		List<City> cities = airline.getAvailableCities();
		List<String> flightNums = airline.getFlightNumbers();
		int daysAfter = 0;
		int count = 0;	
		for (City i:cities) {
			for(City j:cities) {
				if(!(i.getName().equals(j.getName()))) {
					flightsTable.add(new Flight(flightNums.get(count++),i,j,
							LocalDate.of(2017, 8, 16).plusDays(++daysAfter),LocalTime.of( ((int)(Math.random()*24)),
									((int)(Math.random()*12)*5)) ) );
				}
			}
			daysAfter -=(cities.size()-1);
		}
		return new ArrayList<Flight>(flightsTable);
	}

}
