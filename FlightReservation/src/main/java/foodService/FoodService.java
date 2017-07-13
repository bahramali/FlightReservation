package foodService;

public class FoodService {
	
	private String menuName;
	private String foodItem;
	private double price;
	
	
	public FoodService(String menuName, String foodItem, double price) {
		super();
		this.menuName = menuName;
		this.foodItem = foodItem;
		this.price = price;
	}


	
	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getFoodItem(String foodItem) {
		return foodItem;
	}
	
	public void setFoodItem(String foodItem) {
		this.menuName = foodItem;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
