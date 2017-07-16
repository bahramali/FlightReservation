package reservation;

import java.time.*;
import java.util.*;
import java.util.stream.*;



public class FlightTable extends FlightAbstact{
	private AirLine airLine;
	private double price;
	
	public FlightTable(City city1, City city2, LocalDateTime departured_Datetime,double price)
	{
		super(city1, city2, departured_Datetime);
		this.airLine = airLine;
	}

	public AirLine getAirLine()
	{
		return airLine;
	}

	public void setAirLine(AirLine airLine)
	{
		this.airLine = airLine;
	}
	
}
