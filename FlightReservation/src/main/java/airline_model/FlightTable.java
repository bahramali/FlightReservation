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
//	public List<Flight> generateFlightTableForTreMonth(){
//		List<Flight> onePeriodflightsTable = generateFlightTableForOnce();
//		
//		List<Flight> newFlight = new ArrayList<Flight>(onePeriodflightsTable);
//		for(int k= 0;k<2;k++) {	
//			LocalDate lastDate= newFlight.get(newFlight.size()-1).getDeparture_Date();
//			
//			for(int i= 0;i<onePeriodflightsTable.size();i++) {
//				Flight temp = newFlight.get(i);	
//				temp.setDeparture_Date(lastDate.plusDays(1));
//				newFlight.add(temp);
//			}
//			onePeriodflightsTable = newFlight;
//		}
//		return new ArrayList<Flight>(newFlight);
//	}
}
