package com.skilldisillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckTester {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter the number of trucks to be rated: ");
		FoodTruck[] newTruck = new FoodTruck[kb.nextInt()];
		kb.nextLine(); //consumes the \n so input is not skipped
		FoodTruckData foodTruckData = new FoodTruckData();
		foodTruckData.gatherFoodTruckData(newTruck, kb);

		Menu menu = new Menu();
		menu.menu(newTruck, kb);
		
		kb.close();
	}

	
}
