package com.skilldisillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckData {

	public void gatherFoodTruckData(FoodTruck[] ft, Scanner kb) {

		for (int i = 0; i < ft.length; i++) {
			String foodType;
			int rating;
			System.out.println("Enter the name of truck " + i + "(To Skip type Next):\n");
			String truckName = kb.nextLine();
			if (truckName.equalsIgnoreCase("next")) {
				continue;
			}
		
			System.out.println("Enter type of food at " + truckName + ":\n");
			foodType = kb.nextLine();

			System.out.println(
					"How many stars would you rate " + truckName + "?(\u2b50 - \u2b50\u2b50\u2b50\u2b50\u2b50)");
			rating = kb.nextInt();
			kb.nextLine();
			FoodTruck newTruckObj = new FoodTruck(truckName, foodType, rating);
			ft[i] = newTruckObj;

		}

	}
}
