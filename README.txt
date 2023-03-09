Create a class according to your variant from the list below.
Using the Lombok library, implement set and get methods, constructors with arguments, a default constructor, and an overridden toString() method.
The class should contain a public static method getInstance() and a static field instance, the value of which will be returned by the getInstance method.
The main method should create an array of class objects using:
	a default constructor
	a constructor that receives all parameters
	2 objects obtained by calling the getInstance method
Output the identifiers of all objects in the array to the console using a for loop.

Variant 11
Create a class Helicopter that will have the following fields:
id: a unique identifier of the helicopter, with a default value of 100;
model: the model of the helicopter;
currentAltitude: the current altitude of the helicopter;
maxAltitude: the maximum altitude that the helicopter can reach;
fuelCapacity: the amount of fuel that the helicopter can hold;
currentFuel: the current level of fuel in the helicopter.

The Helicopter class should have the following public methods:
takeOff(): a method that lifts the helicopter to a height of 100 meters;
ascend(int altitude): a method that raises the helicopter to the specified height (in meters);
descend(int altitude): a method that lowers the helicopter to the specified height (in meters) and checks that the height does not become negative. If the height is to become negative, the altitude should be considered to be 0;
refuel(int fuel): a method that adds the specified amount of fuel to the helicopter and checks for tank overflow.
