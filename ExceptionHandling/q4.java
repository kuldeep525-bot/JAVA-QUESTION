
// 4. Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class readNumber{
  public static void main(String st[])
  {
    String file="number.txt";

    try{
      readnumberfile(file);
    }

    catch(FileNotFoundException e)
    {
      System.out.println("The file was not found: " +e.getMessage());
    }

    catch(NumberFormatException e)
    {
      System.out.println("enter the correct Number "+ e.getMessage());
    }

     catch(IllegalArgumentException e)
    {
      System.out.println("errors" +e.getMessage());
    }
  }

  public static void readnumberfile(String file) throws java.io.FileNotFoundException,NumberFormatException,IllegalArgumentException
  {
    File objfile= new File(file);
    Scanner scanner = new Scanner(objfile);
     while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int number=Integer.parseInt(line);

            if (number > 0) {
                throw new IllegalArgumentException("Positive number found: " + number);
            } else {
                System.out.println(number);
            }

        }
        scanner.close();
  }
}