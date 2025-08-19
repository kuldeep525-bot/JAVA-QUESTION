// Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

class Shape
{
  public double getArea()
  {
    return 0.0;
  }
}

class Rectangle extends Shape
{

private double length;
private double width;

//constructor to initialize the rectangle
public Rectangle (double length, double width)
{
  this.length=length;
  this.width=width;
}

// Override the getArea method to calculate the area of the rectangle
  public double getArea()
  {
    return length*width;
  }
}

class main{
  public static void main(String st[])
  {
    Shape shape=new Shape();
    System.out.println("Area of the shape: " + shape.getArea());

    Rectangle rectangle=new Rectangle(5.0,8.0);
     System.out.println("Area of the rectangle: " + rectangle.getArea());
  }
}