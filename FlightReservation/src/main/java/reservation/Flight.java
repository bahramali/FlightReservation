package reservation;

import java.time.LocalDateTime;

import org.omg.PortableInterceptor.DISCARDING;

public class Flight
{
	private City origin;
	private City destination;
	private LocalDateTime departured_Datetime;
	
	
	public Flight(City origin, City destination,LocalDateTime departured_Datetime) {
		this.origin = origin;
		this.destination = destination;
		this.departured_Datetime = departured_Datetime;
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

	public LocalDateTime getDepartured_Datetime()
	{
		return departured_Datetime;
	}

	public void setDepartured_Datetime(LocalDateTime departured_Datetime)
	{
		this.departured_Datetime = departured_Datetime;
	}


	@Override
	public String toString()
	{
		return String.format("from %-8s to %-8s in %-8s ", origin,destination,departured_Datetime);
	}
}
