// 9. Get all characters from the file and display on the screen

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class main{
  public static void main(String st[])
  {
    String file="dispay.txt";
    try{
      readdisplayfile(file);
    }

    catch(FileNotFoundException e)
    {
      System.out.println("The file was not found: " +e.getMessage());
    }
  }

  public static void readdisplayfile(String file) throws FileNotFoundException
  {
    File objfile=new File(file);
    Scanner scanner=new Scanner(objfile);
    System.out.println(scanner.nextLine());
    scanner.close();
  }
}