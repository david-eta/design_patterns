public class CarFactory extends Car {
    

    public CarFactory(String make, String model) {
        super(make, model);
    }

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
