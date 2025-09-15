// 6. Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates

import java.io.InputStreamReader;
import java.io.BufferedReader;

class IntegerRead{
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

     System.out.println("Enter the interger:");
    String number3=obj2.readLine();
    int z=Integer.parseInt(number3);

    if(x==y  || x==z || y==z)
    {
      System.out.println("dublicate value find");
    }  

    else{
      System.out.println("All values are unique.");
    }
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