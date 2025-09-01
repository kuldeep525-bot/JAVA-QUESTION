// 1. Write a Java method to find the smallest number among three numbers.

class smallest{
  void smallestNumber(double a, double b, double c){
    if(a<b && a<c)
    {
      System.out.println("A is smallest Number:"+a);
    }

    else if(b<a && b<c)
    {
      System.out.println("B is smallest Number:"+b);
    }

    else{
      System.out.println("C is smallest Number:"+c);
    }

  }
}

class main{
  public static void main(String st[])
  {
    smallest obj1=new smallest();
    obj1.smallestNumber(5,9,8);
  }
}