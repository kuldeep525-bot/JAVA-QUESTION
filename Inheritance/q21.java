// 21. Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type.

abstract class Vehicle{
  abstract void startEngine();
  abstract void stopEngine();
}


class Car extends Vehicle{

     void startEngine() {
        System.out.println("Car engine started.");
    }
    
     void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

class Motorcycle extends Vehicle {
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    public void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

 class main {
    public static void main(String st[]) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        System.out.println("Starting and stopping the car engine:");
        car.startEngine();
        car.stopEngine();

        System.out.println("\nStarting and stopping the motorcycle engine:");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}