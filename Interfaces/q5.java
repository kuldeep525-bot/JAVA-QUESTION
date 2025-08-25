// 5. Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods.

interface Resizable{
  void resizeWidth(int width);
  void resizeHeight(int height);
}

class Rectangle implements Resizable{
  private int width;
  private int height;

  //constructor for intializing the width and height
  Rectangle(int width,int height)
  {
    this.width=width;
    this.height=height;
  }

  public void resizeWidth(int width)
  {
    this.width=width;
  }

  public void resizeHeight(int height)
  {
    this.height=height;
  }

  public void printSize() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}

class main{
  public static void main(String st[])
  {
      Rectangle rectangle = new Rectangle(100, 150);
        rectangle.printSize();
        rectangle.resizeWidth(150);
        rectangle.resizeHeight(200);

        //print the updated printsize
        rectangle.printSize();
  }
}