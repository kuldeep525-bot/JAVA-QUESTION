// 8. Create a Java program to create a package with public class and protected members to be accessed in another class.
package p2;

public class q8 {
    protected int protectedInteger = 10; 
    protected String protectedString = "protected";
    
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }
}