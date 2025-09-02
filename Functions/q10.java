// 10. Write a Java method to count the number of digits in an integer with the value 2. The integer may be assumed to be non-negative.

class count{
  int count=0;

  void countInterger(int num)
  {
    while(num!=0)
    {
    int digits=num%10;
    count++;
    num=num/10;
    }
    System.out.println("count the digits in an interger"+count);
  }

   public static void main(String st[]) 
   {
        count cons = new count();
        cons.countInterger(189878);  
    }
}

