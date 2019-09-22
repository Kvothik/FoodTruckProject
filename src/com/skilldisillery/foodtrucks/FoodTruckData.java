package com.skilldisillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckData {

	public void gatherFoodTruckData(FoodTruck[] ft, Scanner kb) {

		for (int truckID = 0; truckID < ft.length; truckID++) {

			System.out.println("Enter the name of truck " + truckID + "(To Exit type Quit):");
			String truckName = kb.next();

			if (truckName.equalsIgnoreCase("quit")) {
				break;
			
			}
		
			System.out.println("Enter type of food at " + truckName + ":");
			String foodType = kb.next();

			System.out.println(
					"How many stars would you rate " + truckName + "?(\u2b50 - \u2b50\u2b50\u2b50\u2b50\u2b50)");
			int rating = kb.nextInt();
			FoodTruck newTruckObj = new FoodTruck(truckID, truckName, foodType, rating);
			ft[truckID] = newTruckObj;

		}

	}
}
