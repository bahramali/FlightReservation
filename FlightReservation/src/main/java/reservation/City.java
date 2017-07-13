package reservation;


import java.time.LocalTime;
import java.util.TimeZone;

public class City {
	private String name;
	private LocalTime localTime;
	
	public City(String name){
		this.name = name;
		this.localTime = getLocalTime();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalTime getLocalTime() {
		for(String i :TimeZone.getAvailableIDs()){
			if(i.toLowerCase().contains(name.toLowerCase()))
				return LocalTime.now(TimeZone.getTimeZone (i).toZoneId()).withNano(0);
		}
		return null;
	}
	
}
