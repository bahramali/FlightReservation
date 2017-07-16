package reservation;

import java.time.LocalDateTime;

public abstract class FlightAbstact
{
	private City  city1;
	private City  city2;
	private LocalDateTime departured_Datetime;
	
//	public abstract List<Flight>showFlight();
	
	public FlightAbstact(City city1, City city2,LocalDateTime departured_Datetime) {
		this.city1 = city1;
		this.city2 = city2;
		this.departured_Datetime = departured_Datetime;
	}

	public City getCity1()
	{
		return city1;
	}

	public void setCity1(City city1)
	{
		this.city1 = city1;
	}

	public City getCity2()
	{
		return city2;
	}

	public void setCity2(City city2)
	{
		this.city2 = city2;
	}

	public LocalDateTime getDepartured_Datetime()
	{
		return departured_Datetime;
	}

	public void setDepartured_Datetime(LocalDateTime departured_Datetime)
	{
		this.departured_Datetime = departured_Datetime;
	}

	
}
