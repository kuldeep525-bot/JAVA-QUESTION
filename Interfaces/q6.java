// 6. Write a Java program to create an interface Drawable with a method draw() that takes no arguments and returns void. Create three classes Circle, Rectangle, and Triangle that implement the Drawable interface and override the draw() method to draw their respective shapes.

interface Drawable{
  void draw();
}

class Circle implements Drawable{
  // override
  public void draw()
  {
    System.out.println("draw the shape of circle");
  }
}

class Rectangle implements Drawable{
  // override
  public void draw()
  {
    System.out.println("draw the shape of rectangle");
  }
}

class Triangle implements Drawable{
  // override
  public void draw()
  {
    System.out.println("draw the shape of triangle");
  }
}

class main{
  public static void main(String st[])
  {
    Circle circle=new Circle();
    circle.draw();

    Rectangle rectangle=new Rectangle();
    rectangle.draw();

    Triangle triangle=new Triangle();
    triangle.draw();
  }
}

