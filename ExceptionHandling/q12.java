// 12. Write a Java program to show an example of multiple catch

class multipleCatches{
  public static void main(String st[])
  {
    int x;
    int y;

    try{
      x=Integer.parseInt(st[0]);
      y=Integer.parseInt(st[1]);
      System.out.println("x:"+x);
      System.out.println("y:"+y);
    }

    catch(NumberFormatException e)
    {
      System.out.println("valid only intergers:"+e.getMessage());
    }

    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("not valid input:"+e.getMessage());
    }

    catch(Throwable e)
    {
      System.out.println("error"+e.getMessage());
    }

    finally{
      System.out.println("thanks for visting:");
    }
  }
}