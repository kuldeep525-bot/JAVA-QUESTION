// 1. Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}


class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat meows");
    }
}



class main {
    public static void main(String st[]) {
     
        Animal animal = new Animal();
        animal.makeSound(); 

        Cat cat = new Cat();
        cat.makeSound(); 
    }
}