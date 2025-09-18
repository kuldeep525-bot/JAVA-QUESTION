// 1. Enter the character from user using InputStreamReader

import java.io.InputStreamReader;
import java.io.IOException;

class main{
  public static void main(String st[])
  {
    try{
      System.out.print("Enter the character:");
      int x=System.in.read();
      System.out.println("the character:"+(char) x);
    }

    catch(java.io.IOException e)
    {
      System.out.println("error: "+e.getMessage());
    }
  }
}