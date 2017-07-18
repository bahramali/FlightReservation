package ui;

import java.util.stream.Collectors;

import airline_model.AirCraft;
import airline_model.AirLine;
import airline_model.TypeOfSeat;
import flight_model.CityToCityManager;
import flight_model.Flight;
import flight_model.FlightTable;
import reservation.Customer;

public class Menu
{
	public static void showMenu() {

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1- Show the existed aircrafts:");
		System.out.println("2- Show aircrafts seats");
		System.out.println("3- Add an aircraft to the airline:");
		System.out.println("4- Show all available cities:");
		System.out.println("5- Add a new city for airline's destination:");
		System.out.println("6- Show all destinations");
		System.out.println("7- print all flight");
		System.out.println("8- search a trip:");////AZADEH
		System.out.println("9- reserve a trip:");
		System.out.println("9-");
		
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
		CityToCityManager cM = new CityToCityManager(airline);
		FlightTable fT = new FlightTable(airline);
		breaking:while(true) {
			Utilitie.nextLine("Press any key to continue ...");
			showMenu();
			switch (Utilitie.nextInt(0, 10,"Choose one of the commands above."))
			{
				case 1:
					airline.getAirCrafts().forEach(System.out::println);
					break;
				case 2:
					airline.getAirCrafts().forEach(System.out::println);
					int aircraftId = Utilitie.nextInt(1, airline.getAirCrafts().size(),"Choose the aircraft by id");
					AirCraft aircraft = airline.getAirCrafts().stream().filter(s->s.getId()==aircraftId).collect(Collectors.toList()).get(0);
					aircraft.getSeats().forEach(System.out::println);
					break;
				case 3:
					AirCraft temp = new AirCraft(Utilitie.nextInt("Specify the number of firstClass seats:"),
							Utilitie.nextInt("Specify the number of economyClass seats:"), 
							Utilitie.nextInt("Specify the cost of firstClass seats:"), 
							Utilitie.nextInt("Specify the cost of economyClass seats:"), Utilitie.nextLine("Specify the model of aircraft:"));
					airline.addAirCraft(temp);
					temp.getSeats().forEach(System.out::println);		
					break;
				case 4:
					airline.getAvailableCities().forEach(System.out::println);
					break;
				case 5:

					airline.addCity(Utilitie.nextLine("Enter the name of city:"));
					System.out.println("The new available destination.");
					airline.getAvailableCities().forEach(System.out::println);

					break;
				case 6:
					cM.getCityToCity().forEach(System.out::println);

					break;
				case 7:
					FlightTable ftable = new FlightTable(airline);
					System.out.printf("%-4s%-14s%-15s%-20s%-20s%-18s%-7s\n","ID","Model","Fght_Num","Source","Destination","Departure date","Price");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					ftable.getFlightItems().forEach(System.out::println);
					break;
				case 8:
					noLoop:while(true) {
						System.out.println("1- Search by destination:");
						System.out.println("2- Search by source:");
						System.out.println("3- Search by flight number:");
						System.out.println("0- Back To main menu:");
						switch (Utilitie.nextInt(0, 3,"Choose one of the commands above."))
						{
							case 1:{
								String name = Utilitie.nextLine("Enter name of destination:");
								fT.getFlightItems().stream()
								.filter(s->s.getDestination().getName().equalsIgnoreCase(name))
								.forEach(System.out::println);
								break;}
							case 2:{
								String name = Utilitie.nextLine("Enter name of source:");
								fT.getFlightItems().stream()
								.filter(s->s.getSource().getName().equalsIgnoreCase(name))
								.forEach(System.out::println);
								break;}
							case 3:{
								String name = Utilitie.nextLine("Enter flight number:");
								fT.getFlightItems().stream()
								.filter(s->s.getFlightNumber().equalsIgnoreCase(name))
								.forEach(System.out::println);
								break;}
							case 0:
								break noLoop;
							default:
								break;
						}
					}
				break;
				case 9:
					String flightNum = Utilitie.nextLine("Enter flight number for booking:");
					Flight flight =fT.getFlightItems().stream().filter(s->s.getFlightNumber().equalsIgnoreCase(flightNum))
							.collect(Collectors.toList()).get(0);
					System.out.println(flight);
					AirCraft airCtemp = flight.getAirCraft();
					long numOfSeat = airCtemp.getSeats().stream().filter(s->s.isValid()).count();
					long numOfFSeat = airCtemp.getSeats().stream().filter(s->s.isValid()&&s.getTypeOfSeat().equals(TypeOfSeat.FIRST_CLASS)).count();
					long numOfESeat = airCtemp.getSeats().stream().filter(s->s.isValid()&&s.getTypeOfSeat().equals(TypeOfSeat.ECONOMY_CLASS)).count();
					System.out.printf("Your choosen flight have %3d (%-3d firstClass,%-3d EconomyClass) valid seats.\n",numOfSeat,numOfFSeat,numOfESeat);
					TypeOfSeat typeOfSeat= (Utilitie.nextString("Enter \"F\" for FirstClass or \"E\" for economyClass").equalsIgnoreCase("f"))?TypeOfSeat.FIRST_CLASS:TypeOfSeat.ECONOMY_CLASS;
					airCtemp.getSeats().stream().limit(1).forEach(s->{
						if(s.getTypeOfSeat().equals(typeOfSeat)&&s.isValid())
							s.setValid(false);
						});
					
					Customer customer = new Customer(Utilitie.nextLine("For reservation you should enter your name:"));
					
					break;
				case 10:

					break;
				case 0:
					break breaking;
				default:
					break;
			}
		}

	}
}
