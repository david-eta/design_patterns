package FactorySDP;

import java.util.ArrayList;

/**
 * Creates a car.
 * @author David Eta
 * 
 */
public abstract class Car {
    
    private String make;
    private String model;
    protected ArrayList<Accessories> accessories = new  ArrayList<Accessories>();

    /**
     * Initialises the car based on a make and model given.
     * @param makeandmodel details specific to the car being made.
     */
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    /**
     * Calls all the necessary functions to construct all the car parts
     */
    public void assemble() {
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccessories();
        displayAccessories();
    }

    protected abstract void addFrame();

    protected void addWheels() {
        System.out.println("Adding the Wheels");
    }
    
    protected void addEngine() {
        System.out.println("Adding a Standard Engine");
    }
    
    protected void addWindows() {
        System.out.println("Adding Windows");
    }
    
    /**
     * Abstract function because it is specific to the type of car.
     */
    protected abstract void addAccessories();

    /**
     * Loops through all the accessories specific to the car and prints them out as a list.
     */
    protected void displayAccessories() {
        System.out.println("Accessories:");
        for (int i = 0; i < accessories.size(); i++) {
            System.out.println("- " + accessories.get(i));
        }
        System.out.println();
    }
    
}
