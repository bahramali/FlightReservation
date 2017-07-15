package flyingFood;

public abstract class Food {

	private String name;
	private double itemPrice;

	public Food(String name, double itemPrice) {
		super();
		this.name = name;
		this.itemPrice = itemPrice;
	}

	public String getFoodItem() {
		return name;
	}

	public void setFoodItem(String foodItem) {
		this.name = foodItem;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

}
