// Abstract class with abstract and non-abstract methods
abstract class Vehicle {
    // Abstract method (must be implemented by subclass)
    abstract void startEngine();

    // Non-abstract method (can be used directly)
    public void fuelType() {
        System.out.println("This vehicle runs on petrol or diesel.");
    }
}

// Subclass extending the abstract class
class Car extends Vehicle {
    // Implementing the abstract method
    public void startEngine() {
        System.out.println("Car engine started with key ignition.");
    }

    // Method to access non-abstract method from the abstract class
    public void accessNonAbstractMethods() {
        System.out.println("Accessing non-abstract methods from the child class:");
        
        // Creating an object of the abstract class using 'this'
        Vehicle obj = this;  // 'this' refers to the current Car object
        
        obj.fuelType();  // Calling the non-abstract method
    }
}

// Main class
public class AbstractSubClassDemo {
    public static void main(String[] args) {
        System.out.println("=== Abstract Class Example ===");

        // Creating an object of the child class
        Car myCar = new Car();

        // Calling implemented abstract method
        myCar.startEngine();

        // Calling non-abstract method from child class
        myCar.accessNonAbstractMethods();
    }
}
