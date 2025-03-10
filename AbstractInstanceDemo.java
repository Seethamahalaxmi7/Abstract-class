// Abstract class with an abstract and a non-abstract method
abstract class Animal {
    // Abstract method (must be implemented in the subclass)
    abstract void makeSound();

    // Non-abstract method (already implemented)
    public void sleep() {
        System.out.println("Sleeping... Zzz...");
    }
}

// Child class that extends the abstract class
class Dog extends Animal {
    // Implementing the abstract method
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }

    // Method where the child class creates its own instance and calls abstract method
    public void createInstanceAndCall() {
        System.out.println("Creating an instance inside the child class...");

        // Creating an instance of Dog inside the Dog class itself
        Dog myDog = new Dog();

        // Calling abstract method
        myDog.makeSound();

        // Calling non-abstract method
        myDog.sleep();
    }
}

// Main class
public class AbstractInstanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Abstract Class Example ===");

        // Creating an object of Dog class
        Dog dogObj = new Dog();

        // Calling the method that creates an instance inside itself
        dogObj.createInstanceAndCall();
    }
}
