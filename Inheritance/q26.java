// 26. Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter(). Create subclasses Triangle and Square that extend the GeometricShape class and implement the respective methods to calculate the area and perimeter of each shape

abstract class GeometricShape{
 abstract void area();
 abstract void perimeter();
}

class Triangle extends GeometricShape{

  protected double area;
  protected double perimeter;

  private double height;
  private double base;
  private double side1;
  private double side2;
  private double side3;

  Triangle(double height,double base, double side1, double side2, double side3)
  {
    this.height=height;
    this.base=base;
    this.side1=side1;
    this.side2=side2;
    this.side3=side3;
  }

  void area()
  {
    area=height*base/2;
    System.out.println("Area of triangle: " +area);
  }

  void perimeter()
  {
    perimeter=side1+side2+side3;
    System.out.println("Perimeter of triangle: " + perimeter);
  }
}

class Square extends GeometricShape {
    private double side;

    Square(double side) {
        this.side = side;
    }

     void area() {
          System.out.println("Area of square: " +side * side);
    }

    
     void perimeter() {
          System.out.println("Area of triangle: " +4*side);
    }
}

class main{
  public static void main(String st[])
  {
    Triangle triange=new Triangle(3.0, 4.0, 3.0, 4.0, 5.0);
    triange.area();
    triange.perimeter();

    System.out.println("square\n ");

    Square square=new Square(5.9);
    square.area();
    square.perimeter();
  }
}