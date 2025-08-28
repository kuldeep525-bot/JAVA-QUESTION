// 14. Create a program, showing an example of dynamic method dispatch

// Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass
class Dog extends Animal {
 
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Another Subclass
class Cat extends Animal {
 
    void makeSound() {
        System.out.println("Cat meows.");
    }
}

// Main class to test the functionality
 class main {
    public static void main(String st[]) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the makeSound method on different objects
        myAnimal.makeSound(); // Calls the method in Animal
        myDog.makeSound();    // Calls the overridden method in Dog
        myCat.makeSound();    // Calls the overridden method in Cat
    }
}