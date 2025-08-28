// 15. Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.

abstract class Animal{
abstract void sound();
}

class Lion extends Animal{
  void sound()
  {
    System.out.println("lion sound");
  }
}

class Tiger extends Animal{
  void sound()
  {
    System.out.println("Tiger sound");
  }
}

class main{
  public static void main(String st[])
  {
    Lion lion=new Lion();
    lion.sound();

    Tiger tiger=new Tiger();
    tiger.sound();
  }
}