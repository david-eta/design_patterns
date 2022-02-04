public class SmallCar extends Car { 
    Car car;

    public SmallCar (String make, String model) {
        super(make, model);
        System.out.println("Creating a " + make + " " + model);
        assemble();
    }

    protected void addFrame() {
        System.out.println("Adding a small frame");
    }
    
    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.PHONE_CHARGER);
    }
}
