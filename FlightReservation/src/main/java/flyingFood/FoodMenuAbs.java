package flyingFood;

import java.util.ArrayList;

public abstract class FoodMenuAbs {

	ArrayList<Food> foodList = new ArrayList<Food>();
	
	abstract ArrayList<Food> getMenu();

	
}
