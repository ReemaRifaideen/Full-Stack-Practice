// Bike.java - Concrete Class
// Extends the abstract class Vehicle (inherits brand, model, and structure)
// Implements the FuelEfficiency interface (must define calculateMileage)

public class Bike extends Vehicle implements FuelEfficiency {

    // Bike-specific fields
    double fuelTankCapacity; // in litres
    double distanceTravelled; // in km

    // Constructor
    public Bike(String brand, String model, double fuelTankCapacity, double distanceTravelled) {
        super(brand, model); // Call the Vehicle constructor
        this.fuelTankCapacity  = fuelTankCapacity;
        this.distanceTravelled = distanceTravelled;
    }

    // ---------- Implementing abstract method: start() ----------
    @Override
    public void start() {
        System.out.println("Bike [" + brand + " " + model + "] is starting... Engine ON.");
    }

    // ---------- Implementing abstract method: stop() ----------
    @Override
    public void stop() {
        System.out.println("Bike [" + brand + " " + model + "] is stopping... Engine OFF.");
    }

    // ---------- Implementing interface method: calculateMileage() ----------
    // Mileage = distance travelled / fuel tank capacity
    @Override
    public void calculateMileage() {
        double mileage = distanceTravelled / fuelTankCapacity;
        System.out.printf("Bike Mileage    : %.2f km/litre%n", mileage);
    }
}
