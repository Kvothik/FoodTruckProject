package com.skilldisillery.foodtrucks;

import java.util.Scanner;

public class Menu {
	public void menu(FoodTruck[] foodTrucks, Scanner kb) {
		while (true) {
			System.out.println("*MENU*\n1.List all existing food trucks." + "\n2.See the average rating of food trucks."
					+ "\n3.Display the highest-rated food truck." + "\n4.Quit the program.");
			int menuChoice = kb.nextInt();

			switch (menuChoice) {

			case 1:
				printFoodTrucks(foodTrucks);
				continue;
			case 2:// See average rating of food trucks
				double avgRating = 0;
				for (FoodTruck ft : foodTrucks) {
					if (ft != null) {
						avgRating = (avgRating + ft.getRating());
					}
				}
				avgRating = avgRating / foodTrucks.length;
				System.out.println("Average rating: " + avgRating);// have not yet added half stars to method
																	// ratingStars()
				continue;
			case 3:// Display highest rated food truck
				int highest = 0;
				String highestRated = "";
				String ratingStarsHighest = "";
				for (FoodTruck ft : foodTrucks) {
					if (ft != null) {
						if (ft.getRating() > highest) {

							highest = ft.getRating();
							highestRated = ft.getTruckName();
							ratingStarsHighest = ft.ratingStars(highest);
						}
					}
				}
				System.out.println(
						"Highest Rated Food Truck: " + highestRated + "\t\tWith a rating of: " + ratingStarsHighest);
				continue;
			case 4:// Quit the program
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid Selection, Please Try Again.");
			}
			break;

		}

	}
	
	public void printFoodTrucks(FoodTruck[] foodTrucks) {
		for (FoodTruck ft : foodTrucks) {
			if (ft != null) {
				System.out.println(ft.toString());
			}
		}
	}
}
