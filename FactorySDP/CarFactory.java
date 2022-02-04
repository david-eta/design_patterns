public class CarFactory extends Car {
    
    public CarFactory() {}

    public Car createCar(String type, String make, String model) {
        Car car = null;

        if (type.equals("small")) {
            car = new SmallCar();
        } else if (type.equals("sedan")) {
            car = new SedanCar();
        } else if (type.equals("luxury")) {
            car = new LuxuryCar();
        } else {
            car = new DefaultCar();
        }

        return car;
    }
}
