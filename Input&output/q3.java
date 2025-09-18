// 3. Enter the integer from user using Scanner class
// (Scanner class provides methods to read different types of input, such as integers, strings, and more.)

import java.util.Scanner;

class main{
  public static void main(String st[])throws java.io.IOException
  {
    Scanner scanner=new Scanner(System.in);

    //  the user to enter a string
    System.out.print("Enter a string:");
    String inputstring=scanner.nextLine();
    System.out.println("You entered: " + inputstring);

    //the user to enter a interger

    System.out.print("Enter a interger:");
    int inputint=scanner.nextInt();
    System.out.println("You entered: " + inputint);

    scanner.close();

  }
}