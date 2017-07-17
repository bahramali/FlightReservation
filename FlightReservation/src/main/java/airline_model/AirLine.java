package airline_model;

import java.util.*;
import java.util.stream.Collectors;

public class AirLine {
	private String name;
	private String perfix;
	private List<AirCraft> airCrafts;
	private List<City> availableCities;
	private List<String> flightNumbers;
	
	public AirLine(String name,String perfix){
		this.perfix = perfix.toUpperCase();
		this.name = name;
		availableCities = initialAvailableCities();
		airCrafts = initialAirCrafts();
		flightNumbers = generateFlightNumbers();
	}
	
	public AirLine(String name,String perfix ,AirCraft airCraft){
		this.name = name;
		this.perfix = perfix.toUpperCase();
		availableCities = initialAvailableCities();
		airCrafts = addAirCraft(airCraft);
		flightNumbers = generateFlightNumbers();
	}

	public AirLine(String name,String perfix,List<AirCraft> airCrafts){
		this.name = name;
		this.perfix = perfix.toUpperCase();
		airCrafts.addAll(airCrafts);
		availableCities = initialAvailableCities();
		flightNumbers = generateFlightNumbers();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPerfix()
	{
		return perfix;
	}

	public void setPerfix(String perfix)
	{
		this.perfix = perfix;
	}

	public List<AirCraft> getAirCrafts() {
		return new ArrayList<AirCraft>(airCrafts);
	}

	public List<AirCraft> addAirCraft(AirCraft aircraft){
		airCrafts.add(aircraft);
		return new ArrayList<AirCraft>(airCrafts);
	}

	public List<City> getAvailableCities()
	{
		return new ArrayList<City>(availableCities);
	}

	public List<City> addCity(City city) {
		this.availableCities.add(city);
		return new ArrayList<City>(availableCities);
	}

	public List<City> addCity(String city) {
		this.availableCities.add(new City(city));
		return new ArrayList<City>(availableCities);
	}

	public List<String> getFlightNumbers()
	{
		
		return generateFlightNumbers();
	}
	
	public List<String> addFlightnumber(String flightnum){
		flightNumbers.add(flightnum);
		return new ArrayList<String>(flightNumbers);
	}

	private List<String> generateFlightNumbers()
	{
		List<String> flightsNum = new ArrayList<String>();
		for (int i= 0 ; i<getAvailableCities().size()*(getAvailableCities().size()-1);i++)
		{
			flightsNum.add(new String(perfix+(i+300)));
		}
		return new ArrayList<String>(flightsNum);
	}
	
	public List<Double> getPrice()
	{
		return new ArrayList<Double>(price);
	}

	public void setPrice(List<Double> price)
	{
		this.price = price;
	}

	private List<Double> price = new ArrayList<Double>();
	
	public List<Double> priceGenerator()
	{
		int sizeOfList= getAvailableCities().size()*(getAvailableCities().size()-1);
		if(getPrice().size()!=sizeOfList) {
			for (int i= 0 ; i<sizeOfList;i++)
			{
				price.add(new Double(((int)(Math.random()*5000)/100)*100+700));
			}			
		}else
			price= getPrice();
		return new ArrayList<Double>(price);
	}

	private List<AirCraft> initialAirCrafts()
	{
		List<AirCraft> airCrafts = new ArrayList<AirCraft>();
		airCrafts.add(new AirCraft(12, 32, 2200, 1700, "Boeing 717"));
		airCrafts.add(new AirCraft( 8, 24, 1400, 700 , "Martin 4-0"));
		airCrafts.add(new AirCraft(24, 32, 3200, 1500, "Airbus A320"));
		airCrafts.add(new AirCraft(18, 20, 3400, 1900, "Airbus A300"));
		airCrafts.add(new AirCraft(12, 24, 2000, 1300, "Boeing 314"));
		return new ArrayList<AirCraft>(airCrafts);
	}

	private List<City> initialAvailableCities(){
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

	@Override
	public String toString()
	{
		return String.format("%-8s with %-3daircrafts has %-2d flights number to %-2d cities", name,airCrafts.size(),flightNumbers.size(),availableCities.size());
	}
}
