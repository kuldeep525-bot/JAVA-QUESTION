// 9. Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.

abstract class Vehicle {
    abstract void make();
    abstract void model();
    abstract void year();
    abstract void fuel();
}



class Car extends Vehicle {
    private double distance;
    private double maxSpeed;
    private double fuel;

    // Default constructor
    Car() {
        this.distance = 0;
        this.maxSpeed = 0;
        this.fuel = 0;
    }

    //override
    void make() {
        System.out.println("Car is made by steel");
    }

    //override
    void model() {
        System.out.println("Car model is 2020");
    }

    //override
    void year() {
        System.out.println("Car model year is 2025");
    }

    //override
    void fuel() {
        System.out.println("Car fuel: Petrol");
    }

    void distanceTraveled(double speed, double time) {
        this.distance = speed * time;
        System.out.println("Distance traveled in kilometers: " + this.distance);
    }

    void calculateMaxSpeed(double time) {
        if (time != 0) {
            this.maxSpeed = this.distance / time;
            System.out.println("Maximum speed: " + this.maxSpeed + " km/h");
        } else {
            System.out.println("Time cannot be zero for speed calculation.");
        }
    }

    void fuelEfficiency(double liters) {
        if (liters > 0 && this.distance > 0) {
            this.fuel = this.distance / liters;
            System.out.println("Fuel efficiency: " + this.fuel + " km/L");
        } else if (liters <= 0) {
            System.out.println("Not sufficient fuel");
        } else {
            System.out.println("Distance must be greater than zero to calculate fuel efficiency.");
        }
    }
}

class Motorcycle extends Vehicle {
    private double distance;
    private double maxSpeed;
    private double fuel;

    // Default constructor
    Motorcycle() {
        this.distance = 0;
        this.maxSpeed = 0;
        this.fuel = 0;
    }

    //override
    void make() {
        System.out.println("motorcycle is made by steel");
    }

    //override
    void model() {
        System.out.println("motorcycle model is 2020");
    }

    //override
    void year() {
        System.out.println("motorcycle model year is 2025");
    }

    //override
    void fuel() {
        System.out.println("motorcycle fuel: Petrol");
    }

    void distanceTraveled(double speed, double time) {
        this.distance = speed * time;
        System.out.println("Distance traveled in kilometers: " + this.distance);
    }

    void calculateMaxSpeed(double time) {
        if (time != 0) {
            this.maxSpeed = this.distance / time;
            System.out.println("Maximum speed: " + this.maxSpeed + " km/h");
        } else {
            System.out.println("Time cannot be zero for speed calculation.");
        }
    }

    void fuelEfficiency(double liters) {
        if (liters > 0 && this.distance > 0) {
            this.fuel = this.distance / liters;
            System.out.println("Fuel efficiency: " + this.fuel + " km/L");
        } else if (liters <= 0) {
            System.out.println("Not sufficient fuel");
        } else {
            System.out.println("Distance must be greater than zero to calculate fuel efficiency.");
        }
    }
}

class Truck extends Vehicle {
    private double distance;
    private double maxSpeed;
    private double fuel;

    // Default constructor
    Truck() {
        this.distance = 0;
        this.maxSpeed = 0;
        this.fuel = 0;
    }

    //override
    void make() {
        System.out.println("truck is made by steel");
    }

    //override
    void model() {
        System.out.println("truck model is 2020");
    }

    //override
    void year() {
        System.out.println("truck model year is 2025");
    }

    //override
    void fuel() {
        System.out.println("truck fuel: disel");
    }

    void distanceTraveled(double speed, double time) {
        this.distance = speed * time;
        System.out.println("Distance traveled in kilometers: " + this.distance);
    }

    void calculateMaxSpeed(double time) {
        if (time != 0) {
            this.maxSpeed = this.distance / time;
            System.out.println("Maximum speed: " + this.maxSpeed + " km/h");
        } else {
            System.out.println("Time cannot be zero for speed calculation.");
        }
    }

    void fuelEfficiency(double liters) {
        if (liters > 0 && this.distance > 0) {
            this.fuel = this.distance / liters;
            System.out.println("Fuel efficiency: " + this.fuel + " km/L");
        } else if (liters <= 0) {
            System.out.println("Not sufficient fuel");
        } else {
            System.out.println("Distance must be greater than zero to calculate fuel efficiency.");
        }
    }
}

class main {
    public static void main(String st[]) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Truck truck = new Truck();

  
        System.out.println("Car:");

        car.make();
        car.model();
        car.year();
        car.fuel();
        car.distanceTraveled(60.0, 2.5); // Speed = 60 km/h, Time = 2.5 hours
        car.calculateMaxSpeed(2.5); // Time = 2.5 hours
        car.fuelEfficiency(10.0); // Fuel used = 10 liters

        System.out.println("\n");
        System.out.println("Motorcycle:");
        System.out.println("\n");

        motorcycle.make();
        motorcycle.model();
        motorcycle.year();
        motorcycle.fuel();
        motorcycle.distanceTraveled(40.0, 5); // Speed = 40 km/h, Time = 5 hours
        motorcycle.calculateMaxSpeed(5); // Time = 5 hours
        motorcycle.fuelEfficiency(3); // Fuel used = 3 liters

        System.out.println("\n");
        System.out.println("Truck:");
        System.out.println("\n");


        truck.make();
        truck.model();
        truck.year();
        truck.fuel();
        truck.distanceTraveled(100.0, 2); // Speed = 100 km/h, Time = 2 hours
        truck.calculateMaxSpeed(2); // Time = 2 hours
        truck.fuelEfficiency(30); // Fuel used = 30 liters
    }
}

