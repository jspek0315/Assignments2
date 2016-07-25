package com.ssa1.assignment1;

public class Driver
{

    public static void main(String[] args)
    {
        // Create two cars
        // Car1 is your car
        // Car2 is my car
        Car car1 = new Car();
        Car car2 = new Car(400, 6, "Lexus", "SC430");

        // Print out my cars statistics
        System.out.print("My car is a ");
        printCarMessage(car2);

        // Print out your cars statistics
        System.out.print("Your car is a ");
        printCarMessage(car1);

        // Drive to New York on my car
        car2.driverMiles(800);
        System.out.println("After driving to New York my cars new milage is: " + car2.getMilage() + " miles");

    }

    public static void printCarMessage(Car car2)
    {
        System.out.print(car2.getCarMake() + " " + car2.getCarModel() + ".\n");
        System.out.print("It is a " + car2.getNumCylinder() + " cylinder car ");
        System.out.println("with " + car2.getMilage() + " miles.\n");
    }

}
