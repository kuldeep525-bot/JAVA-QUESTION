// 6. Write a Java method to print characters between two characters (i.e. A to P).

class printCharacter{
  void twoCharacter(char ch1,char ch2)
  {
    for(char c=ch1;c<=ch2;c++)
    {
        System.out.println("Character: " + c);
    }
  }
}

class main{
  public static void main(String st[])
  {
    printCharacter obj1=new printCharacter();
    obj1.twoCharacter('p','z');
  }
}