// 6. Enter the boolean from user using Scanner class

import java.util.Scanner;
import java.util.InputMismatchException;

class main {
    public static void main(String st[]) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a boolean value (true or false): ");
            boolean inputBoolean = scanner.nextBoolean();
            System.out.println("You entered: " + inputBoolean);
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid boolean value (true or false): " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
