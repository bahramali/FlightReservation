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
			String klass = scan.next();

			switch (klass) {

			case "E": {

				System.out.println("Välj en Meny");
				System.out.println("1. En Happy Meal");

				menuOption = scan.nextInt();

				switch (menuOption) {
				case 1:
					System.out.println("En happy meal består av en hamburgare och läsk för 25kr");
					f.getItemList().add(new Food("Hamburgare", 15));
					f.getItemList().add(new Food("Läsk", 10));	
					ordering = false;
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
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
