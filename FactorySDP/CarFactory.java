package FactorySDP;

/**
 * Initialises a specific type of car.
 * @author David Eta
 * 
 */
public class CarFactory extends Car {    

    public CarFactory(String make, String model) {
        super(make, model);
    }

    /**
     * Specifies the type of car that will be creted.
     * @param details the type, make and model of the car being created.
     */
    public static Car createCar(String type, String make, String model) {
        Car car = null;

        if (type.equals("small")) {
            car = new SmallCar(make, model);
        } else if (type.equals("sedan")) {
            car = new SedanCar(make, model);
        } else if (type.equals("luxury")) {
            car = new LuxuryCar(make, model);
        } else {
            car = new SmallCar(make, model); // default
        }
        return car;
    }

    protected void addFrame() {}
    protected void addAccessories() {}
}
