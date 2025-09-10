// 1. Write a Java program that throws an exception and catch it using a try-catch block.

class ExceptionExample {
    public static void main(String st[]) {
        int x;
        int y;
        try {
            x = Integer.parseInt(st[0]);
            y = Integer.parseInt(st[1]);
            System.out.println("x: " + x + " y: " + y);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } 
    }
}