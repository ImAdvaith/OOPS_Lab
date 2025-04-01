class Shape {
    protected double area;

    public Shape() {
        this.area = 0;
    }
    
    public double getArea() {
        return area;
    }
}

class Circle extends Shape {
    public Circle(double radius) {
        super();
        this.area = Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super();
        this.area = length * width;
    }
}

class Triangle extends Shape {
    public Triangle(double base, double height) {
        super();
        this.area = 0.5 * base * height;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        System.out.println("Area of Circle: " + circle.getArea());

        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangle.getArea());

        Shape triangle = new Triangle(4.0, 3.0);
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}
