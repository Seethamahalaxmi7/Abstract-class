// Abstract class with a non-abstract method
abstract class Transport {
    // Non-abstract method (already implemented)
    public void fuelType() {
        System.out.println("This transport runs on petrol or diesel.");
    }
}

// Child class that extends the abstract class
class Bike extends Transport {
    // Method where the child class creates its own instance and calls non-abstract method
    public void createInstanceAndCall() {
        System.out.println("Creating an instance inside the child class...");

        // Creating an instance of Bike inside the Bike class itself
        Bike myBike = new Bike();

        // Calling non-abstract method from the parent class
        myBike.fuelType();
    }
}

// Main class with a new name
public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("=== Abstract Class Example ===");

        // Creating an object of Bike class
        Bike bikeObj = new Bike();

        // Calling the method that creates an instance inside itself
        bikeObj.createInstanceAndCall();
    }
}
