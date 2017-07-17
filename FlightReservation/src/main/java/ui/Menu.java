package ui;

import airline_model.AirCraft;
import airline_model.AirLine;

public class Menu
{
	public static void showMenu() {
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1- Show the existed aircrafts:");
		System.out.println("2- Add an aircraft to the airline:");
		System.out.println("3- ");
		System.out.println("4-");
		System.out.println("5-");
		System.out.println("6");
		System.out.println("7-");
		System.out.println("8-");
		System.out.println("9-");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
	public static void run() {
		System.out.println("\t\tWelcome to automate flight booking.\n");
//		String name = Utilitie.nextLine("Enter the name of AirLine");
//		AirLine airline = new AirLine(name, Utilitie.nextLine("Enter 3 prefix letters: ex. for ("+name+") "+name.toUpperCase().substring(0,3)));
		AirLine airline = new AirLine("Diana", "dan");
		breaking:while(true) {
			showMenu();
			switch (Utilitie.nextInt(0, 10,"Choose one of the commands above."))
			{
				case 1:
					airline.getAirCrafts().forEach(System.out::println);
					break;
				case 2:
					AirCraft temp = new AirCraft(Utilitie.nextInt("Specify the number of firstClass seats:"),
							Utilitie.nextInt("Specify the number of economyClass seats:"), 
							Utilitie.nextInt("Specify the cost of firstClass seats:"), 
							Utilitie.nextInt("Specify the cost of economyClass seats:"), Utilitie.nextLine("Specify the model of aircraft:"));
					airline.addAirCraft(temp);
					temp.getSeats().forEach(System.out::println);		
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 0:
					break breaking;
				default:
					break;
			}
		}
		
	}
}
