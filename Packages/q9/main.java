import c1.A;
import c2.B;

 class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.display(); // Call display method on obj1
        obj2.protectedMethod(); // Call protectedMethod on obj2
    }
}