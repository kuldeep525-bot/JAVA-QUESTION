package p2;
import p2.q8;

public class main {
    public static void main(String st[]) {
        q8 obj1 = new q8();
        System.out.println("Protected Integer: " + obj1.protectedInteger);
        System.out.println("Protected String: " + obj1.protectedString);
        obj1.protectedMethod();
    }
}