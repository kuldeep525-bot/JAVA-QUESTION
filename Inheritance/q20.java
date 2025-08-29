// 20. Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea(). Create subclasses Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume and surface area of each shape.

abstract class Shape3D{

double pi;

Shape3D(double pi)
{
  this.pi=pi;
}

 abstract void calculateVolume(double radius);
abstract void calculateSurfaceArea(double radius);
}


class Sphere extends Shape3D{

  double volume;
  double surfacearea;


  Sphere(double pi)
  {
    super(pi);
  }

  void calculateVolume(double radius)
  {
   volume = (4.0 / 3.0) * pi * radius * radius * radius;
  System.out.println("Volume of the sphere: " + volume+""+"cm cube");
  }

  void calculateSurfaceArea(double radius)
  {
    surfacearea=4*pi*radius*radius;
     System.out.println("surface area of the sphere: " + surfacearea+""+"cm square");
  }
}


class Cube extends Shape3D{

  double volume;
  double surfacearea;

 Cube(double pi) {
        super(pi);
    }

  void calculateVolume(double a)
  {
   volume = a*a*a;
  System.out.println("Volume of the cube: " + volume+""+"cm cube");
  }

  void calculateSurfaceArea(double a)
  {
    surfacearea=6*a*a;
     System.out.println("surface area of the cube: " + surfacearea+""+"cm square");
  }
}

class main{
  public static void main(String st[])
  {
    Sphere sphere=new Sphere(3.14159);
    Cube cube=new Cube(3.14159);

    System.out.println("sphere");
    sphere.calculateVolume(5.0);
    sphere.calculateSurfaceArea(5.0);

     System.out.println("cube");
    cube.calculateVolume(5.0);
    cube.calculateSurfaceArea(5.0);
     

  }
}