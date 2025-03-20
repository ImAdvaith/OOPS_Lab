class Shape {

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Shape shape = new Shape();

        System.out.println("Area of Circle: " + shape.calculateArea(5.0));

        System.out.println("Area of Rectangle: " + shape.calculateArea(4.0, 6.0));

        System.out.println("Area of Triangle: " + shape.calculateArea(4.0, 3.0));
    }
}
