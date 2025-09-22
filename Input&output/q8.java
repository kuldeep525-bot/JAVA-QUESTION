// 8. Enter the long integer from user using Scanner class

import java.util.Scanner;
import java.util.InputMismatchException;

class main{
  public static void main(String st[])
  {
    Scanner scanner=new Scanner(System.in);
try{
    System.out.print("Enter the long interger:");
    long inputLong=scanner.nextLong();
        System.out.println("You entered: " + inputLong);    
    }
    catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid short number" + e.getMessage());
        } finally {
            scanner.close();
        }
  }
}
