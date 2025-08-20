// 6. Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run.

class Animal{
 public void move()
 {
  System.out.println("run");
 }
}

class Cheetah{

  //override
  public void move()
  {
    System.out.println("fastest than animals");
  }
}

class main
{
  public static void main(String st[])
  {
  Animal animal=new Animal();
  animal.move();

  Cheetah cheetah=new Cheetah();
  cheetah.move();
  }
}