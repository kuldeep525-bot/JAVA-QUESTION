class Shape {
    public float getPerimeter() {
        return 0; 
    }

    public float getArea() {
        return 0;
    }
}

class Circle extends Shape {
    private int radius;
    private float pi = 3.1415929f;

    // Constructor to initialize the circle
    Circle(int radius) {
        this.radius = radius;
    }

    //override
    public float getPerimeter() {
        return 2 * pi * radius;
    }

    //override
    public float getArea() {
        return pi * radius * radius;
    }
}

 class main {
    public static void main(String st[]) {
        Shape shape = new Shape();

        Circle circle = new Circle(5);
        System.out.println("Area of the circle: " + circle.getArea());
        System.out.println("Perimeter of the circle: " + circle.getPerimeter());
    }
}