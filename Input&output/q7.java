// 7. Enter the short integer from user using Scanner class

import java.util.Scanner;

class main{
  public static void main(String st[])
  {
    Scanner scanner=new Scanner(System.in);

    try{
      System.out.println("Enter a short number");
       short inputShort = scanner.nextShort();
        System.out.println("You entered: " + inputShort);    
    }
    catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid short number" + e.getMessage());
        } finally {
            scanner.close();
        }
  }
}
