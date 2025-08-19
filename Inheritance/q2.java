
// 2. Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car"

class Vehicle
{
  public void drive()
  {
    System.out.println("Repairing a vehicle");
  }
}

class Car extends Vehicle
{
  public void drive()
  {
    System.out.println("Repairing a car");
  }
}

class main
{
  public static void main(String st[])
  {
    Vehicle vehicle=new Vehicle();
    vehicle.drive();

    Car car=new Car();
    car.drive();
  }
}