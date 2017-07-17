package flight_model;

import java.time.*;
import java.util.*;

import airline_model.*;

public class FlightTable 
{
	private List<Flight> flightItems;
	private AirLine airline;

	public FlightTable(AirLine airline) {
		this.airline = airline;
		flightItems = new ArrayList<Flight>();
	} 

	public List<Flight> getFlightItems()
	{
		if(flightItems.isEmpty()) {
			Flight.id=1;
			return flightTableGenerator();
		}
		else
			return flightItems;
	}

	public void setFlightItems(List<Flight> flightItems)
	{
		
		this.flightItems = flightItems;
	}

	private List<Flight> flightTableGenerator(){
		
		CityToCityManager cM = new CityToCityManager(airline);
		List<CityToCity> listOfFlights = cM.getCityToCity();

		int daysAfter = 0;
		int count=0;
		AirCraft temp = null;
		for(CityToCity i : listOfFlights) {
			LocalTime time = LocalTime.of(((int)(Math.random()*24)),((int)(Math.random()*12)*5));
			LocalDate date = LocalDate.of(2017, 8, 16).plusDays(++daysAfter);
			if(count<airline.getAirCrafts().size())
				temp = airline.getAirCrafts().get(count++);
			else {
				count=0;
				temp = airline.getAirCrafts().get(count++);
			}

			flightItems.add(new Flight(temp,i.getFlightNumber(), i.getCity1(), 
					i.getCity2(), date, time,i.getPrice()));
		}
		return new ArrayList<Flight>(flightItems);
	}
}



//public List<Flight> flightTableGenerator(){
//	List<City> cities = airline.getAvailableCities();
//	List<String> flightNums = airline.getFlightNumbers();
//	int daysAfter = 0;
//	int count = 0;	
//	for (City i:cities) {
//		for(City j:cities) {
//			LocalTime time = LocalTime.of(((int)(Math.random()*24)),((int)(Math.random()*12)*5));
//			LocalDate date = LocalDate.of(2017, 8, 16).plusDays(++daysAfter);
//			
//			Flight f = new Flight(flightNums.get(count++),i,j,date,time,1000d);
//			if(!(i.getName().equals(j.getName()))) {
//				flightItems.add(f);
//			}
//		}
//		daysAfter -=(cities.size()-1);
//	}
//	return new ArrayList<Flight>(flightItems);
//}