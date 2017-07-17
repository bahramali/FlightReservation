package flight_model;


import java.util.*;

import airline_model.AirLine;
import airline_model.City;

public class CityToCityManager
{
	private AirLine airline;
	private List<CityToCity> cityToCity;
	
	public CityToCityManager(AirLine airline)
	{
		this.airline = airline;	
		this.cityToCity= cityToCityGenerator();
		cityLinesGenerator();
	}

	public AirLine getAirline()
	{
		return airline;
	}

	public void setAirline(AirLine airline)
	{
		this.airline = airline;
	}

	public List<CityToCity> getCityToCity()
	{
		return cityToCity;
	}

	public void setCityToCity(List<CityToCity> cityToCity)
	{
		this.cityToCity = cityToCity;
	}

	public Map<String, CityToCity> getCityLines()
	{
		return cityLinesGenerator();
	}

	private List<CityToCity> cityToCityGenerator()
	{
		List<CityToCity> fromTo = new ArrayList<CityToCity>();
		List<City> cities = airline.getAvailableCities();
		for (City i:cities) {
			for(City j:cities) {
				if(!(i.getName().equals(j.getName()))) {
					fromTo.add(new CityToCity(i, j,((int)(Math.random()*5000)/100)*100+700));
				}
			}
		}
		return new ArrayList<CityToCity>(fromTo);
	}

	private Map<String,CityToCity> cityLinesGenerator(){
		Map<String,CityToCity> line= new HashMap<String, CityToCity>();
		List<CityToCity> cities = cityToCityGenerator();
		List<String> flightNums = airline.getFlightNumbers();
		int count = 0;	
			for(CityToCity i:cities) {
				line.put(flightNums.get(count++), i);
			}
		return new HashMap<String,CityToCity>(line);
	}
}
