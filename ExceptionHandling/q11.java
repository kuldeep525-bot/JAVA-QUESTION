// 11. Write a Java program to show an example of throws Keyword.

import java.io.InputStreamReader;
import java.io.BufferedReader;

class ThrowsExample{
  public static void main(String st[]) throws java.io.IOException,NumberFormatException
  {

    try{
    InputStreamReader obj1=new InputStreamReader(System.in);
    BufferedReader obj2=new BufferedReader(obj1);

    System.out.println("Enter the interger:");
    String number1=obj2.readLine();
    int x=Integer.parseInt(number1);  

     System.out.println("Enter the interger:");
    String number2=obj2.readLine();
    int y=Integer.parseInt(number2);  

    System.out.println("sum:"+(x+y));
  }

  catch(NumberFormatException e)
  {
    System.out.println("please give only Integers:"+e.getMessage());
  }

  catch(Throwable e)
  {
       System.out.println("error"+e);
  }

  finally{
       System.out.println("thanks for visiting ");
  }
  
  }

}