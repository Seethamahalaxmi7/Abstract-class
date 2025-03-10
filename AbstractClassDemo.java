// Abstract class with both abstract and non-abstract methods
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();

    // Non-abstract method (already implemented)
    public void sleep() {
        System.out.println("Sleeping... Zzz...");
    }
}

// Subclass Dog that extends Animal
class Dog extends Animal {
    // Implementing the abstract method
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Subclass Cat that extends Animal
class Cat extends Animal {
    // Implementing the abstract method
    public void makeSound() {
        System.out.println("Cat meows: Meow! Meow!");
    }
}

// Main class
public class AbstractClassDemo {
    public static void main(String[] args) {
        System.out.println("=== Abstract Class Example ===");

        // Creating objects of subclasses
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling implemented abstract methods
        myDog.makeSound();
        myCat.makeSound();

        // Calling non-abstract method from abstract class
        myDog.sleep();
        myCat.sleep();
    }
}
