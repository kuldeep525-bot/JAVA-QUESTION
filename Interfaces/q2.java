// 2. Write a Java program to create a Animal interface with a method called bark() that takes no arguments and returns void. Create a Dog class that implements Animal and overrides speak() to print "Dog is barking".


interface Animal {
    void bark();
}

class Dog implements Animal {
    // Override the bark() method
    public void bark() {
        System.out.println("Dog is barking");
    }
}


 class main {
    public static void main(String st[]) {

        Dog dog = new Dog();
        dog.bark();
    }
}