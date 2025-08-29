// 18. Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behav


abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion eats meat.");
    }

    void sleep() {
        System.out.println("Lion sleeps in the shade.");
    }
}

class Tiger extends Animal {
    void eat() {
        System.out.println("Tiger eats meat.");
    }

    void sleep() {
        System.out.println("Tiger sleeps in the forest.");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Deer eats plants.");
    }

    void sleep() {
        System.out.println("Deer sleeps in the meadow.");
    }
}

 class main {
    public static void main(String st[]) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal deer = new Deer();
        
        System.out.println("Lion:");
        lion.eat();
        lion.sleep();

        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sleep();

        System.out.println("\nDeer:");
        deer.eat();
        deer.sleep();
    }
}