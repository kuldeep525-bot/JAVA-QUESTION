// 22. Write a Java program to create an abstract class Person with abstract methods eat() and exercise(). Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods to describe how each person eats and exercises.


abstract class Person{
  abstract void eat();
  abstract void exercise();
}

class Athlete extends Person{
void eat(){
  System.out.println("proper take meal");
}

void exercise(){
  System.out.println("regular exercise");
}
}

class LazyPerson extends Person{
void eat(){
  System.out.println("not proper take meal");
}

void exercise(){
  System.out.println("not regular exercise");
}
}

class main{
  public static void main(String st[])
  {
    Athlete obj1=new Athlete();

    obj1.eat();
    obj1.exercise();

     LazyPerson obj2=new LazyPerson();
     obj2.eat();
    obj2.exercise();
  }
}