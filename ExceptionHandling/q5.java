// 5. Write a Java program that reads a file and throws an exception if the file is empty.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileEmpty{
  public static void main(String st[])
  {
  String filePath="kuldeep.txt";

  try{
    readFile(filePath);
  }
  catch(FileNotFoundException e)
  {
      System.out.println("The file was not found: " +e.getMessage());
  }

  catch(Exception e)
  {
    System.out.println("file is empty " +e);
  }
}

public static void readFile(String filePath) throws  java.io.FileNotFoundException,Exception
{
  File file=new File(filePath);
  Scanner scanner=new Scanner(file);

  if(!scanner.hasNextLine())
  {
     throw new Exception("File is empty");
  }
   while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        // Close the scanner
        scanner.close();
}
}
