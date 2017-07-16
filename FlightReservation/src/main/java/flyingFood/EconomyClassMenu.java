package flyingFood;

import java.util.ArrayList;

public class EconomyClassMenu implements FoodService
{
	ArrayList<Food> foodList = new ArrayList<Food>();
	@Override
	public ArrayList<Food> MakeMenu(){
		foodList.add(new Dish("Kebab", 59.50));
		foodList.add(new Dish("Fish& Chips", 69.33));
		foodList.add(new Dish("Greek salad", 49.50));
		foodList.add(new Drink("Fanta", 23.17));
		foodList.add(new Drink("Beer - Just a beer", 43.99));
		foodList.add(new Drink("Cuba Liblre - a grogg", 47.20));
		return foodList;
	}
}
