// 3. Write a Java program to create an interface Flyable with a method called fly_obj(). Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface. Implement the fly_obj() method for each of the three classes.

interface Flyable {
    void fly_obj();
}

class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying through space.");
    }
}


class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying through the sky.");
    }
}


class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter is flying through the sky.");
    }
}

 class main {
    public static void main(String st[]) {
   
        Spacecraft space = new Spacecraft();
        space.fly_obj();

        Airplane plane = new Airplane();
        plane.fly_obj();

        Helicopter heli = new Helicopter();
        heli.fly_obj();
    }
}