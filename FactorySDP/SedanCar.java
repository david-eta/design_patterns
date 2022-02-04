/**
 * Creates a sedan car
 * @author David Eta
 * 
 */
public class SedanCar extends Car {

    /**
     * Shows the user the car being developed and assembles it.
     * @param makeandmodel details specific to the car being made.
     */
    public SedanCar (String make, String model) {
        super(make, model);
        System.out.println("Creating a " + make + " " + model);
        assemble();
    }

    /**
     * Notifies user of a type-specific frame addition.
     */
    protected void addFrame() {
        System.out.println("Adding a three part frame");
    }
    
    /**
     * Adds the accessories specific to this car type.
     */
    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.BACK_UP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
    }
}
