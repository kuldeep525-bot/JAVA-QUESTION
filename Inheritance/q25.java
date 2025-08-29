// Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound(). Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods to describe how each bird flies and makes a sound.


abstract class Bird {
    public abstract void fly();

    public abstract void makeSound();
}

class Eagle extends Bird {
  
    public void fly() {
        System.out.println("Eaglel is flying.");
    }
  
    public void makeSound() {
        System.out.println("Eaglel is sounded.");
    }
}


class Hawk extends Bird {

    public void fly() {
        System.out.println("Hawk is flying.");
    }

    public void makeSound() {
        System.out.println("Hawk is sounded.");
    }
}


 class main {
    public static void main(String st[]) {
        Eagle obj1 = new Eagle();
        Hawk obj2 = new Hawk();

      obj1.fly();
      obj1.makeSound();

        obj2.fly();
        obj2.makeSound();
    }
}