package airline_model;

import java.time.*;

public class Flight
{
	private AirCraft airCraft;
	private String flightNumber;
	private City source;
	private City destination;
	private LocalDate departure_Date;
	private LocalTime departure_Time;
	private double price;
	public static int id= 1;
	private int fId;
	public Flight(AirCraft airCraft,String flightNumber,City source, City destination,LocalDate departure_Date,LocalTime departureTime,double price) {
		this.fId= id++;
		this.airCraft= airCraft;
		this.flightNumber = flightNumber;
		this.source = source;
		this.destination = destination;
		this.departure_Date = departure_Date;
		this.departure_Time = departureTime;
		this.price = price;
	}
	
	public Flight(String flightNumber,City source, City destination,LocalDate departure_Date,LocalTime departureTime) {
		this.fId= id++;
		this.airCraft= null;
		this.flightNumber = flightNumber;
		this.source = source;
		this.destination = destination;
		this.departure_Date = departure_Date;
		this.departure_Time = departureTime;
		this.price = 0d;
	}
	
	public int getfId()
	{
		return fId;
	}

	public void setfId(int fId)
	{
		this.fId = fId;
	}

	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public AirCraft getAirCraft()
	{
		return airCraft;
	}
	public void setAirCraft(AirCraft airCraft)
	{
		this.airCraft = airCraft;
	}
	public String getFlightNumber()
	{
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber)
	{
		this.flightNumber = flightNumber;
	}

	public City getSource()
	{
		return source;
	}

	public void setSource(City origin)
	{
		this.source = origin;
	}

	public City getDestination()
	{
		return destination;
	}

	public void setDestination(City destination)
	{
		this.destination = destination;
	}

	public LocalDate getDeparture_Date()
	{
		return departure_Date;
	}

	public void setDeparture_Date(LocalDate departure_Date)
	{
		this.departure_Date = departure_Date;
	}

	public LocalTime getDeparture_Time()
	{
		return departure_Time;
	}

	public void setDeparture_Time(LocalTime departure_Time)
	{
		this.departure_Time = departure_Time;
	}

	@Override
	public String toString()
	{
		return String.format("%-2d %-14s %-7s  from  %-7s to %-6s at %-10s %-6s %-5.2f",fId,airCraft.getModel(),flightNumber, source,destination,departure_Date.toString(),departure_Time,price);
	}
}
