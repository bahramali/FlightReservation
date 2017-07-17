package airline_model;

import java.time.*;
import java.util.*;

public class FlightTable {

	private AirLine airline;
	private Map<Integer,Flight> flightsTable = new HashMap<Integer,Flight>();

	public FlightTable(AirLine airLine) {
		this.airline = airLine;
	}

	public Map<Integer,Flight> generateFlightTable(){
//		List<Flight> flightsTable = new ArrayList<Flight>();
		List<City> cities = airline.getAvailableCities();
		List<String> flightNums = airline.getFlightNumbers();
		int daysAfter = 0;
		int count = 0;	
		for (City i:cities) {
			for(City j:cities) {
				if(!(i.getName().equals(j.getName()))) {
					flightsTable.put(new Integer(count+1), 
							new Flight(flightNums.get(count++),i,j,LocalDate.of(2017, 8, 16).plusDays(++daysAfter),LocalTime.of( ((int)(Math.random()*24)),((int)(Math.random()*12)*5)) ) );
				}
			}
			daysAfter -=(cities.size()-1);
		}
		return new HashMap<Integer,Flight>(flightsTable);
	}

}
