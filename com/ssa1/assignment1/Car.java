package com.ssa1.assignment1;

/**
 * <h1>Car Class</h1>
 * <p>
 * This class creates a generic car
 * </p>
 * 
 * @author Joseph Spekterman
 *
 */

public class Car
{
    public static String DEFAULT_CAR_MAKE = "Honda";
    public static String DEFAULT_CAR_MODEL = "Civic";
    public static int DEFAULT_CYLINDER = 4;
    public static int DEFAULT_MILAGE = 0;

    private int milage;
    private int numCylinder;

    private String carMake;
    private String carModel;

    /**
     * <h1>Default Car Constructor</h1>
     * <p>
     * By default the constructor builds a 4 Cylinder Honda Civic with no miles
     * </p>
     * 
     */
    public Car()
    {
        this(DEFAULT_MILAGE, DEFAULT_CYLINDER, DEFAULT_CAR_MAKE, DEFAULT_CAR_MODEL);
    }

    /**
     * <h1>Overloaded Car Constructor</h1> <br>
     * 
     * @param milage
     * @param numCylinder
     * @param make
     * @param model
     */
    public Car(int milage, int numCylinder, String make, String model)
    {
        this.milage = milage;
        this.numCylinder = numCylinder;
        this.carMake = make;
        this.carModel = model;
    }

    /**
     * <h1>driverMiles</h1>
     * <p>
     * Adds the amount of miles driven to the cars mileage
     * </p>
     * 
     * @param numMiles
     */
    public void driverMiles(int numMiles)
    {
        this.milage += numMiles;
    }

    // Following is a list of getters and setters
    public int getMilage()
    {
        return milage;
    }

    public void setMilage(int milage)
    {
        this.milage = milage;
    }

    public int getNumCylinder()
    {
        return numCylinder;
    }

    public void setNumCylinder(int numCylinder)
    {
        this.numCylinder = numCylinder;
    }

    public String getCarMake()
    {
        return carMake;
    }

    public void setCarMake(String carMake)
    {
        this.carMake = carMake;
    }

    public String getCarModel()
    {
        return carModel;
    }

    public void setCarModel(String carModel)
    {
        this.carModel = carModel;
    }

}
