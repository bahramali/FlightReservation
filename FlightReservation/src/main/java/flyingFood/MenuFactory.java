package flyingFood;

import java.util.*;

import reservation.TypeOfSeat;

public class MenuFactory
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

