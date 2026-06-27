// Car.java - Concrete Class
// Extends the abstract class Vehicle (inherits brand, model, and structure)
// Implements the FuelEfficiency interface (must define calculateMileage)

public class Car extends Vehicle implements FuelEfficiency {

    // Car-specific fields
    double fuelTankCapacity; // in litres
    double distanceTravelled; // in km

    // Constructor
    public Car(String brand, String model, double fuelTankCapacity, double distanceTravelled) {
        super(brand, model); // Call the Vehicle constructor
        this.fuelTankCapacity  = fuelTankCapacity;
        this.distanceTravelled = distanceTravelled;
    }

    // ---------- Implementing abstract method: start() ----------
    @Override
    public void start() {
        System.out.println("Car [" + brand + " " + model + "] is starting... Engine ON.");
    }

    // ---------- Implementing abstract method: stop() ----------
    @Override
    public void stop() {
        System.out.println("Car [" + brand + " " + model + "] is stopping... Engine OFF.");
    }

    // ---------- Implementing interface method: calculateMileage() ----------
    // Mileage = distance travelled / fuel tank capacity
    @Override
    public void calculateMileage() {
        double mileage = distanceTravelled / fuelTankCapacity;
        System.out.printf("Car Mileage     : %.2f km/litre%n", mileage);
    }
}
