// 11. Create a program, showing an example of super keyword

class A {
    int x;

    // Constructor for class A
    A(int x) {
        this.x = x;
    }
}

class B extends A {
    // Constructor for class B
    B(int x) {
        super(x); // Call the constructor of class A
        System.out.println("Value: " + x);
    }
}

 class main {
    public static void main(String st[]) {
        B obj = new B(20); 
    }
}