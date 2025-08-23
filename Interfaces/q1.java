// 1. Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.

interface Shape{
  void getArea();
}

class Rectangle implements Shape{

private double length;
private double width;

//constructor to initialize the rectangle

Rectangle(double length,double width){
this.length=length;
this.width=width;
}

public void getArea()
{
  System.out.println("Area of rectangle:"+length*width);
}

}

class Circle{
  private double pi=3.14159265359;


  public void getArea(double radius)
  {
    
  System.out.println("Area of circle:"+ pi * radius * radius);
  }

}

class Triangle{

 public void getArea(double height,double width)
  {
    
  System.out.println("Area of triangle:"+ (height*width)/2);
  }

}

class main{
public static void main(String st[])
{
  Rectangle rectangle=new Rectangle(20.00,34.87);
  rectangle.getArea();

  Circle circle=new Circle();
  circle.getArea(2.5);

  Triangle triangle=new Triangle();
  triangle.getArea(2,3);
}
}