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
	
	public Flight(AirCraft airCraft,String flightNumber,City source, City destination,LocalDate departure_Date,LocalTime departureTime) {
		this.airCraft= airCraft;
		this.flightNumber = flightNumber;
		this.source = source;
		this.destination = destination;
		this.departure_Date = departure_Date;
		this.departure_Time = departureTime;
	}
	public Flight(String flightNumber,City source, City destination,LocalDate departure_Date,LocalTime departureTime) {
		this.airCraft= null;
		this.flightNumber = flightNumber;
		this.source = source;
		this.destination = destination;
		this.departure_Date = departure_Date;
		this.departure_Time = departureTime;
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
		return String.format("%-6sfrom  %-6s to %-6s in %-8s  %-6s",flightNumber, source,destination,departure_Date.toString(),departure_Time);
	}
}
