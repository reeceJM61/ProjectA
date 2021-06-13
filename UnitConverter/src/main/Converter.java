package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		
		run();
		
	}
		
		// a method for running the program
		public static void run(){
		
		int x = 1;
		
		do {
			
			// Main Menu
			System.out.println();
			System.out.println("Please select an option:");
			System.out.println("[ 1 ] Volume Conversion");
			System.out.println("[ 2 ] Distance Conversion");
			System.out.println("[ 3 ] Quit");
			System.out.println();
			
			Scanner option = new Scanner(System.in);
			switch(option.nextInt()) {
			
			case 1 : // Volume Menu
				
				System.out.println();
				System.out.println("Please select an option:");
				System.out.println("[ 1 ] Cups to Teaspoons");
				System.out.println("[ 2 ] Teaspoons to Cups");
				System.out.println("[ 3 ] US Gallons to Imperial Gallons");
				System.out.println("[ 4 ] Quit");
				System.out.println();
				
				Scanner nextOption = new Scanner(System.in);
				
				switch(nextOption.nextInt()) {
				
					case 1 : // cups to teaspoons
						System.out.println();
						System.out.println("Please enter the amount of cups you would like to convert to teaspoons:");
						System.out.println();
						Scanner cups = new Scanner(System.in);
						convertCupsToTeaspoons(cups.nextDouble());
						break;
					
					case 2 : // teaspoons to cups
						System.out.println();
						System.out.println("Please enter the amount of teaspoons you would like to convert to cups:");
						System.out.println();
						Scanner teaspoons = new Scanner(System.in);
						convertTeaspoonsToCups(teaspoons.nextDouble());
						break;
					
					case 3 : // US Gallons to Imperial Gallons
						System.out.println();
						System.out.println("Please enter the amount of US Gallons you would like to convert to Imperial Gallons:");
						System.out.println();
						Scanner USGallons = new Scanner(System.in);
						convertUSGallonsToImperialGallons(USGallons.nextDouble());
						break;
					
					case 4 : // exiting from the volume menu
						System.out.println();
						System.out.println("Thank you! Have a good day.");
						x++;
						break;
					
					default : // error message from the volume menu
						System.out.println();
						System.out.println("Sorry! Please try again.");
					
					} break;
					
			case 2 : // Distance Menu
				System.out.println();
				System.out.println("Please select an option:");
				System.out.println("[ 1 ] Feet to Meters");
				System.out.println("[ 2 ] Miles to Kilometers");
				System.out.println("[ 3 ] Quit");
				System.out.println();
				
				switch(option.nextInt()) {
				
					case 1 : // feet to meters
						System.out.println();
						System.out.println("Please enter the amount of feet you would like to convert to meters:");
						System.out.println();
						Scanner feet = new Scanner(System.in);
						convertFeetToMeters(feet.nextDouble());
						break;
						
					case 2 : // miles to kilometers
						System.out.println();
						System.out.println("Please enter the amount of miles you would like to convert to kilometers:");
						System.out.println();
						Scanner miles = new Scanner(System.in);
						convertMilesToKilometers(miles.nextDouble());
						break;
						
					case 3 : // exiting from the distance menu
						System.out.println();
						System.out.println("Thank you! Have a good day.");
						x++;
						break;
						
					default : // error message from the distance menu
						System.out.println();
						System.out.println("Sorry! Please try again.");
						
				} break;
				
			case 3 : // exiting from the main menu
				System.out.println();
				System.out.println("Thank you! Have a good day.");
				x++;
				break;
		
			default : // error message from the main menu
				System.out.println();
				System.out.println("Sorry! Please try again.");
			
				}
			
			}while(x==1);
		
		}
	
	public static void convertTeaspoonsToTableSpoons(double teaspoons) {
		
		System.out.println();
		double tablespoons = teaspoons * 0.333;
		System.out.println(teaspoons + " teaspoons equals " + tablespoons + " tablespoons");
		
		}
	
	public static void convertTeaspoonsToCups(double teaspoons) {
		
		System.out.println();
		double cups = teaspoons * 0.0208;
		System.out.println(teaspoons + " teaspoons equals " + cups + " cups");
		
		}
	
	public static void convertCupsToTeaspoons(double cups) {
		
		System.out.println();
		double teaspoons = cups * 48;
		System.out.println(cups + " cups equals " + teaspoons + " teaspoons");
	
		}
	
	public static void convertUSGallonsToImperialGallons(double gallons) {
		
		System.out.println();
		double ImperialGallons = gallons * 0.833;
		System.out.println(gallons + " US gallons equals " + ImperialGallons + " Imperial Gallons");
		
		}

	public static void convertFeetToMeters(double feet) {
	
		System.out.println();
		double meters = feet * 0.305;
		System.out.println(feet + " feet equals " + meters + " meters");
		
		
		}
	
	public static void convertMilesToKilometers(double miles) {
		
		System.out.println();
		double kilometers = miles * 1.609;
		System.out.println(miles + " miles equals " + kilometers + " kilometers");
		
		}
	
	
		
	}
