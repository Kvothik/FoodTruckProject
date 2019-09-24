package com.skilldisillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckTester {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter the number of trucks to be rated: ");
		FoodTruck[] newTruck = new FoodTruck[kb.nextInt()];
		kb.nextLine(); // consumes the \n so input is not skipped

		FoodTruckData foodTruckData = new FoodTruckData();
		foodTruckData.gatherFoodTruckData(newTruck, kb);

		FoodTruckTester test = new FoodTruckTester();
		test.menuChoice(kb, newTruck);

		kb.close();
	}

	public void menuChoice(Scanner kb, FoodTruck[] newTruck) {
		boolean keepGoing = true;
		int menuChoice = 0;
		while (keepGoing) {
			if(menuChoice == 4) {
				keepGoing = false;
				break;
			}
			System.out.println("*MENU*\n1.List all existing food trucks." + "\n2.See the average rating of food trucks."
					+ "\n3.Display the highest-rated food truck." + "\n4.Quit the program.");
			menuChoice = kb.nextInt();
			Menu menu = new Menu();
			menu.menu(newTruck, menuChoice);
		}
	}

}
