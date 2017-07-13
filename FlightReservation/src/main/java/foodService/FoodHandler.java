package foodService;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodHandler {

	static double totalPrice;
	public static ArrayList<Food> itemList = new ArrayList<Food>();

	public ArrayList<Food> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<Food> itemList) {
		this.itemList = itemList;
	}	
	
	
	public static void calculateTotalPrice() {
		for (Iterator iterator = itemList.iterator(); iterator.hasNext();) {
			Food food = (Food) iterator.next();
			totalPrice = totalPrice + food.getItemPrice();
			
		}
	}
	
	
	

}
