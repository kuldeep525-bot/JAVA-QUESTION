// 5. Enter the double from user using Scanner class

// 4. Enter the float from user using Scanner class


import java.util.Scanner;

class main{
  public static void main(String st[])
  {
       Scanner scanner=new Scanner(System.in);
    try{

    //  the user to enter a string
    System.out.print("Enter a string:");
    String inputstring=scanner.nextLine();
    System.out.println("You entered: " + inputstring);

    //the user to enter a interger

    System.out.print("Enter a interger:");
    int inputint=scanner.nextInt();
    System.out.println("You entered: " + inputint);

    System.out.print("Enter a float number:");
    float inputfloat=scanner.nextFloat();
    System.out.println("You entered: " + inputfloat);

    System.out.print("Enter a double number:");
    double inputdouble=scanner.nextDouble();
    System.out.println("You entered: " + inputdouble);
    }

    catch( java.util.InputMismatchException e)
    {
      System.out.println("Please enter valid data:"+e.getMessage());
    }
    finally {
            scanner.close();
        }

  }
}