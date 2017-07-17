package ui;

import airline_model.AirCraft;
import airline_model.AirLine;
import flight_model.CityToCityManager;
import flight_model.FlightTable;

public class Menu
{
	public static void showMenu() {
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1- Show the existed aircrafts:");
		System.out.println("2- Add an aircraft to the airline:");
		System.out.println("3- Show all available cities:");
		System.out.println("4- Add a new city for airline's destination:");
		System.out.println("5- Show all destinations");
		System.out.println("6- print all flight");
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
			Utilitie.nextLine("Press any key to continue ...");
			Utilitie.cls(45);
			showMenu();
			switch (Utilitie.nextInt(0, 10,"Choose one of the commands above."))
			{
				case 1:
					Utilitie.cls(45);
					airline.getAirCrafts().forEach(System.out::println);
					Utilitie.cls(20);
					break;
				case 2:
					Utilitie.cls(45);
					AirCraft temp = new AirCraft(Utilitie.nextInt("Specify the number of firstClass seats:"),
							Utilitie.nextInt("Specify the number of economyClass seats:"), 
							Utilitie.nextInt("Specify the cost of firstClass seats:"), 
							Utilitie.nextInt("Specify the cost of economyClass seats:"), Utilitie.nextLine("Specify the model of aircraft:"));
					airline.addAirCraft(temp);
					temp.getSeats().forEach(System.out::println);		
					break;
				case 3:
					Utilitie.cls(45);
					airline.getAvailableCities().forEach(System.out::println);
					Utilitie.cls(25);
					break;
				case 4:
					Utilitie.cls(45);
					airline.addCity(Utilitie.nextLine("Enter the name of city:"));
					System.out.println("The new available destination.");
					airline.getAvailableCities().forEach(System.out::println);
					Utilitie.cls(25);
					break;
				case 5:
					Utilitie.cls(45);
					CityToCityManager cM = new CityToCityManager(airline);
					cM.getCityToCity().forEach(System.out::println);
					Utilitie.cls(25);
					break;
				case 6:
					Utilitie.cls(45);
					FlightTable fT = new FlightTable(airline);
					System.out.printf("%-4s%-14s%-15s%-20s%-20s%-18s%-7s\n","ID","Model","Fght_Num","Source","Destination","Departure date","Price");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					fT.getFlightItems().forEach(System.out::println);
					break;
				case 0:
					break breaking;
				default:
					break;
			}
		}
		
	}
}
