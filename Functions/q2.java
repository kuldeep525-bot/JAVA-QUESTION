// 2. Write a Java method to compute the average of three numbers.


class average{

  void averageNumber(double a, double b, double c){
    System.out.println("Average of three number:"+(a+b+c)/3);
  }
}

class main{
  public static void main(String st[])
  {
    average obj1=new average();
    obj1.averageNumber(3,3,3);
  }
}