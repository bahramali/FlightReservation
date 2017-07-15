package reservation;

import java.util.*;
import java.util.stream.Collectors;

public class AirLine {
	private List<AirCraft> airCrafts;
	private List<City> cities;
	private String name;
	

	public AirLine(String name){
		this.name = name;
		cities = initialCities();
		airCrafts = initialAirCrafts();
	}
	
	public AirLine(String name,AirCraft airCraft){
		this.name = name;
		cities = initialCities();
		airCrafts = addAirCraft(airCraft);
	}
	public AirLine(String name,List<AirCraft> airCrafts){
		this.name = name;
		airCrafts.addAll(airCrafts);
		cities = initialCities();
	}
	
	public List<AirCraft> addAirCraft(AirCraft aircraft){
		airCrafts.add(aircraft);
		return new ArrayList<AirCraft>(airCrafts);
	}

	public List<City> addCitiy(City city) {
		cities.add(city);
		return new ArrayList<City>(cities);
	}

	public List<City> addCity(String city) {
		cities.add(new City(city));
		return new ArrayList<City>(cities);
	}

	public List<AirCraft> getAirCrafts() {
		return new ArrayList<AirCraft>(airCrafts);
	}

	public List<City> getAllCities() {
		return new ArrayList<City>(cities);
	}

	public String getName() {
		return name;
	}

	public void setAllCities(List<City> someCities) {
		cities = someCities;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private List<AirCraft> initialAirCrafts()
	{
		airCrafts.add(new AirCraft(12, 32, 2200, 1700, "Boeing 717", "MC020"));
		airCrafts.add(new AirCraft( 8, 24, 1400, 700 , "Martin 4-0", "MC216"));
		airCrafts.add(new AirCraft(24, 32, 3200, 1500, "Airbus A320", "MC716"));
		airCrafts.add(new AirCraft(18, 20, 3400, 1900, "Airbus A300", "MC121"));
		airCrafts.add(new AirCraft(12, 24, 2000, 1300, "Boeing 314", "MC604"));
		return new ArrayList<AirCraft>(airCrafts);
	}

	private List<City> initialCities(){
		List<String> stringCities = new ArrayList<String>(Arrays.asList(TimeZone.getAvailableIDs()));

		List<City> cities = new ArrayList<City>();

		stringCities.removeIf(s -> !s.toLowerCase().contains("europe"));
		stringCities.replaceAll(s ->{return s.substring(s.indexOf("/")+1);});

		stringCities
		.stream()
		.filter(t -> (t.length()%2==0))
		.filter(t ->t.length()<6)
		.collect(Collectors.toList())
		.forEach(s -> {
			cities.add(new City(s));
		} );

		return new ArrayList<City>(cities);	
	}
	
}
