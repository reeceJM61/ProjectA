package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		
		int x = 1;
		
		do {
			
			System.out.println();
			System.out.println("Please select an option:");
			System.out.println("1. Cups to Teaspoons");
			System.out.println("2. Miles to Kilometers");
			System.out.println("3. US Gallons to Imperial Gallons");
			System.out.println("4. Quit");
			System.out.println();
			
			Scanner option = new Scanner(System.in);
			
			switch(option.nextInt()) {
			
			case 1 : 
				System.out.println();
				System.out.println("Please enter the amount of cups you would like to convert:");
				System.out.println();
				Scanner amount = new Scanner(System.in);
				convertCupsToTeaspoons(amount.nextDouble());
				break;
				
			case 2 :
				System.out.println();
				System.out.println("Please enter the number of miles you would like to convert:");
				System.out.println();
				Scanner miles = new Scanner(System.in);
				convertMilesToKilometers(miles.nextDouble());
				//number.close();
				break;
			
			case 3 :
				System.out.println();
				System.out.println("Please enter the amount of US gallons you would like to convert:");
				System.out.println();
				Scanner gallons = new Scanner(System.in);
				convertUSGallonsToImperialGallons(gallons.nextDouble());
				//gallons.close();
				break;
				
			case 4 :
				System.out.println();
				System.out.println("Thank you! Have a good day.");
				x++;
				break;
				
			default :
				System.out.println();
				System.out.println("Sorry! Please try again.");
				
				}
			
			}while(x == 1);
		
		}
	
	public static void convertCupsToTeaspoons(double amount) {
		
		System.out.println();
		double newAmount = amount * 48;
		System.out.println(amount + " cups equals " + newAmount + " teaspoons");
	
		}
	
	public static void convertMilesToKilometers(double miles) {
		
		System.out.println();
		double kilometers = miles * 1.609;
		System.out.println(miles + " miles equals " + kilometers + " kilometers");
		
		}
	
	public static void convertUSGallonsToImperialGallons(double gallons) {
		
		System.out.println();
		double ImperialGallons = gallons * 0.833;
		System.out.println(gallons + " US gallons equals " + ImperialGallons + " Imperial Gallons");
		
		}
		
	}
