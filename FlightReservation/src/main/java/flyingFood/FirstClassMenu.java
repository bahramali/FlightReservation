package flyingFood;

import java.util.ArrayList;

public class FirstClassMenu extends FoodMenuAbs {

	@Override
	ArrayList<Food> getMenu(){
		foodList.add(new Dish("Oysters", 500.5));
		foodList.add(new Dish("Salade de pes noble ", 410.7));
		foodList.add(new Dish("Lobster", 550.5));
		foodList.add(new Drink("Mineral Water - Fillico 750ml ", 2_000.00));
		foodList.add(new Drink("Whiskey : Glen Grant 50 Years", 32_000.00));
		foodList.add(new Drink("Champagne : Dom P�rignon", 10_000.00));
		return foodList;
	}

}
