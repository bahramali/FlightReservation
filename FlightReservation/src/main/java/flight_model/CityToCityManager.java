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


	private List<CityToCity> cityToCityGenerator()
	{
		List<CityToCity> fromTo = new ArrayList<CityToCity>();
		List<City> cities = airline.getAvailableCities();
		int count = 0;
		for (City i:cities) {
			for(City j:cities) {
				if(!(i.getName().equals(j.getName()))) {
					fromTo.add(new CityToCity(airline.getFlightNumbers().get(count),i, j,airline.priceGenerator().get(count++)));
				}
			}
		}
		return new ArrayList<CityToCity>(fromTo);
	}

	
}
