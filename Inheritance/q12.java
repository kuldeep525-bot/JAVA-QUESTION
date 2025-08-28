// 12. Create a program, showing an example of super function


class Animal {
    void speak() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the speak method
    @Override
    void speak() {
        super.speak();
        System.out.println("Dog barks.");
    }
}

 class main {
    public static void main(String st[]) {
        Dog myDog = new Dog();
        myDog.speak();
    }
}