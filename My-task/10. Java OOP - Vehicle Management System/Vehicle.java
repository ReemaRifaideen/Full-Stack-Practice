// Vehicle.java - Abstract Class
// Abstract classes cannot be instantiated directly.
// They define a common structure that all subclasses must follow.

public abstract class Vehicle {

    // Common fields shared by all vehicles
    String brand;
    String model;

    // Constructor to initialize common vehicle details
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Abstract method: start()
    // Every subclass MUST provide its own implementation of this method
    public abstract void start();

    // Abstract method: stop()
    // Every subclass MUST provide its own implementation of this method
    public abstract void stop();
}
