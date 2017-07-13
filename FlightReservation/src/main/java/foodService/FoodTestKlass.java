package foodService;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodTestKlass {
	
	
	public static void main(String[] args) {
		HandleOrder h = new HandleOrder();
		ArrayList<Food> ordered = h.FoodStarter();
		
		
		for (Iterator iterator = ordered.iterator(); iterator.hasNext();) {
			Food food = (Food) iterator.next();
			
			System.out.println(food.getFoodItem() + " " + food.getItemPrice());
			
			
		}
		
		//bug just nu
		System.out.println(FoodHandler.totalPrice);
		
		
	}
	

}
