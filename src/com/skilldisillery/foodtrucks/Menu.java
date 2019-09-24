package com.skilldisillery.foodtrucks;

public class Menu {
	public void menu(FoodTruck[] foodTrucks, int menuChoice) {

		switch (menuChoice) {

		case 1:
			printFoodTrucks(foodTrucks);
			break;
		case 2:// See average rating of food trucks
			ratingAverage(foodTrucks);
			break;
		case 3:// Display highest rated food truck
			highestRated(foodTrucks);
			break;
		case 4:// Quit the program
			System.out.println("Exiting...");
			break;
		default:
			System.out.println("Invalid Selection, Please Try Again.");
		}

	}

	public void printFoodTrucks(FoodTruck[] foodTrucks) {
		for (FoodTruck ft : foodTrucks) {
			if (ft != null) {
				System.out.println(ft.toString());
			}
		}
	}

	public void ratingAverage(FoodTruck[] foodTrucks) {
		double avgRating = 0;
		double sum = 0;
		int notNull = 0;
		for (FoodTruck ft : foodTrucks) {
			if (ft != null) {
				notNull++; 
				sum = sum + ft.getRating();
				avgRating = sum / notNull;
			}
		}
		System.out.println("Average rating: " + avgRating);// have not yet added half stars to method
															// ratingStars()
	}

	public void highestRated(FoodTruck[] foodTrucks) {
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
		System.out.println("Highest Rated Food Truck: " + highestRated + "\t\tWith a rating of: " + ratingStarsHighest);
	}
}
