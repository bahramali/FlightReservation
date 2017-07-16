package flyingFood;

import java.util.*;

import airline_model.TypeOfSeat;

public class MenuProducer
{
	public List<Food> getMenu(TypeOfSeat typeOfSeat)
	{
		if(typeOfSeat ==null)
			return null;

		if (typeOfSeat.equals(TypeOfSeat.FIRST_CLASS)) 
			return new FirstClassMenu().MakeMenu();
		else if (typeOfSeat.equals(TypeOfSeat.ECONOMY_CLASS)) 
			return new EconomyClassMenu().MakeMenu();

		return null;

	}
}

