package flight_model;

import java.time.*;

import airline_model.City;

public class Flight
{
	private String flightNumber;
	private City origin;
	private City destination;
	private LocalDate departure_Date;
	private LocalTime departure_Time;
	
	public Flight(String flightNumber,City origin, City destination,LocalDate departure_Date,LocalTime departureTime) {
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.departure_Date = departure_Date;
		this.departure_Time = departureTime;
	}
	
	public String getFlightNumber()
	{
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber)
	{
		this.flightNumber = flightNumber;
	}

	public City getOrigin()
	{
		return origin;
	}

	public void setOrigin(City origin)
	{
		this.origin = origin;
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
		return String.format("%-6sfrom  %-6s to %-6s in %-8s  %-6s ",flightNumber, origin,destination,departure_Date.toString(),departure_Time);
	}
}
