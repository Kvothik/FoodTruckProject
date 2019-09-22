## Food Truck Rating Project

### Week 2 Homework Project for Skill Distillery

### Overview
FoodTruck project was created using 4 classes. I will break down what each class does.

#### 1. FoodTruck
FoodTruck has fields for the FoodTruck object:
1. -truckName
2. -foodType
3. -rating
4. -truckID

Getters and setters are created for each of the fields along with a default constructor and constructor using the four fields.

FoodTruck class has two additional methods:
1. public String toString()
toString() method returns a concatenated String with the FoodTrucks data.
2. public String ratingStars(int rating)
ratingStars() utilizes a switch statement with an argument of (int rating) from the user. ratingStars() returns a star emoji based on how many stars the review has given said truck.

#### 2. FoodTruckTester
FoodTruckTester contains the main method. This class contains the Scanner and instantiates new objects for each of the other 3 classes. FoodTruckTester then calls necessary methods from FoodTruckData and Menu.

#### 3. Menu
Menu class contains only one method with which to call and generate the menu.

1. public void menu(FoodTruck[] foodTrucks, Scanner kb)
menu() is a switch statement contained within a while(true), so that the menu will continue to populate until the users selects "Quit". menu() contains options for:
1. Listing all existing foodTrucks.
Accomplished by using a foreach to iterate through each object in FoodTruck[] and calling toString() to print them.
2. Display average rating of all entered foodTrucks.
Accomplished by using a foreach, iterating through each object of the array then calculating the average.
3. Display the highest rated foodTruck.
Accomplished by using a foreach with nested if statement to determine if previous iteration was higher. Returns the foodTruck with the highest rating.
4. Quit
Breaks out of the loop and prints a message "Exiting...".
#### 4. FoodTruckData
FoodTruckData contains one method to gather input and set the data used by the rest of the program.
FoodTruckData asks the number of FoodTrucks the user wanted to enter and then enters that amount of trucks into the array newTruck[]. After that, there is a for loop to iterate the fields of the array.
There is a nested if statement which checks if the user types "Quit". If the user types quit, the loop will break before anymore data is entered. The menu method will be called and requested data will be printed there.
### Technologies/Topics Applied

### Lessons Learned
