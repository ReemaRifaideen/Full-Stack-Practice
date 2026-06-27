// Main.java - Entry Point
// Demonstrates the Vehicle Management System using abstraction and interfaces

public class Main {
    public static void main(String[] args) {

        // ---------- Car Object ----------
        // Car extends Vehicle and implements FuelEfficiency
        Car car = new Car("Toyota", "Corolla", 50.0, 750.0);

        System.out.println("==============================");
        System.out.println("         CAR DETAILS         ");
        System.out.println("==============================");
        car.start();
        car.calculateMileage();
        car.stop();

        System.out.println();

        // ---------- Bike Object ----------
        // Bike extends Vehicle and implements FuelEfficiency
        Bike bike = new Bike("Honda", "CB Shine", 10.5, 525.0);

        System.out.println("==============================");
        System.out.println("        BIKE DETAILS         ");
        System.out.println("==============================");
        bike.start();
        bike.calculateMileage();
        bike.stop();

        System.out.println("==============================");
    }
}
