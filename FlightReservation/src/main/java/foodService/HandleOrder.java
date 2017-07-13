package foodService;

import java.util.ArrayList;
import java.util.Scanner;

public class HandleOrder {


FoodHandler f = new FoodHandler();

	Scanner scan = new Scanner(System.in);

	public ArrayList<Food> FoodStarter() {
		int menuOption;
		int foodItem = 0;
		boolean ordering = true;
		while (ordering) {
			System.out.println("välj F första eller E eko food");
			String sectionClass = scan.next();

			switch (sectionClass) {

			case "E": {

				System.out.println("Welcome what would you lika to order"
						+ "\n1. Fish & Chips - 79 kr"
						+ "\n2. Greek salad - 65 kr"
						+ "\n3. Beer - 39 kr"
						+ "\n4. CocaCola - 25 kr");

				menuOption = scan.nextInt();

				switch (menuOption) {
				case 1:
					System.out.println("You've ordered Fish & Chips");
					f.getItemList().add(new Food("Fish & Chips", 79));					
					ordering = false;
					break;
				case 2:
					System.out.println("You've ordered a Greek salad");
					f.getItemList().add(new Food("Greek salad", 55));
					break;
				case 3:
					System.out.println("You've ordered a Beer");
					f.getItemList().add(new Food("Beer", 39));
					break;
				case 4:
					System.out.println("You've ordered a CocaCola");
					f.getItemList().add(new Food("CocaCola", 25));	
					break;
				default:
					System.out.println("Invalid option.");
					break;
				}

			}

//			case "F": {
//
//				System.out.println("Välj en Meny");
//				menuOption = scan.nextInt();
//
//				switch (menuOption) {
//				case 1:
//
//					break;
//				case 2:
//					break;
//				case 3:
//					break;
//				case 4:
//					break;
//				case 5:
//					break;
//				default:
//					System.out.println("Invalid option.");
//					break;
//				}
//
//			}
			
			
		

			}
		}
		
		return f.getItemList();
		
	}
}
