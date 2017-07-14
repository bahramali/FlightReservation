package flyingFood;

import java.util.ArrayList;

public class FoodService implements FoodServiceInterface {

	ArrayList<Food> foodList = new ArrayList<Food>();

	@Override
	public ArrayList<Food> getFirstClassMenu() {
		foodList.add(new Dish("Oysters", 500.5));
		foodList.add(new Dish("Salade de pes noble ", 410.7));
		foodList.add(new Dish("Lobster", 550.5));
		foodList.add(new Drink("Mineral Water - Fillico 750ml ", 2_000.00));
		foodList.add(new Drink("Whiskey : Glen Grant 50 Years", 32_000.00));
		foodList.add(new Drink("Champagne : Dom Pérignon", 10_000.00));
		return foodList;
	}

	@Override
	public ArrayList<Food> getEconomyClassMenu() {
		foodList.add(new Dish("Kebab", 59.50));
		foodList.add(new Dish("Fish& Chips", 69.33));
		foodList.add(new Dish("Greek salad", 49.50));
		foodList.add(new Drink("Fanta", 23.17));
		foodList.add(new Drink("Beer - Just a beer", 43.99));
		foodList.add(new Drink("Cuba Liblre - a grogg", 47.20));
		return foodList;
	}
}
