package com.skilldisillery.foodtrucks;

public class FoodTruck {
	private static int truckID;
	private String truckName;
	private String foodType;
	private int rating;

	public FoodTruck() {
		super();
	}

	public FoodTruck(int truckID, String truckName, String foodType, int rating) {
		{
			FoodTruck.truckID = truckID;
		}

		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;

	}

	public int getTruckID() {
		return truckID;
	}

	public void setTruckID(int truckID) {
		FoodTruck.truckID = truckID;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Truck ID #" + truckID + "\tTruck name: " + truckName + "\t Type of food: " + foodType + "\t Rating: "
				+ ratingStars(rating);
	}

	public String ratingStars(int rating) {
		String ratingStars = "";
		switch (this.rating) {
		case 1:
			ratingStars = "\u2b50";
			return ratingStars;
		case 2:
			ratingStars = "\u2b50\u2b50";
			return ratingStars;
		case 3:
			ratingStars = "\u2b50\u2b50\u2b50";
			return ratingStars;
		case 4:
			ratingStars = "\u2b50\u2b50\u2b50\u2b50";
			return ratingStars;
		case 5:
			ratingStars = "\u2b50\u2b50\u2b50\u2b50\u2b50";
			return ratingStars;
		}
		return ratingStars;
	}
}
