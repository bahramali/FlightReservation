package flyingFood;

import java.util.ArrayList;

public class FirstClassMenu implements FoodService {
	ArrayList<Food> foodList = new ArrayList<Food>();
	@Override
	public ArrayList<Food> MakeMenu(){
		foodList.add(new Dish("Oysters", 500.5));
		foodList.add(new Dish("Salade de pes noble ", 410.7));
		foodList.add(new Dish("Lobster", 550.5));
		foodList.add(new Drink("Mineral Water - Fillico 750ml ", 2_000.00));
		foodList.add(new Drink("Whiskey : Glen Grant 50 Years", 32_000.00));
		foodList.add(new Drink("Champagne : Dom Prignon", 10_000.00));
		return foodList;
	}

}
