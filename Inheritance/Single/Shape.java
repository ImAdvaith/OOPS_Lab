class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    void displayShapeInfo() {
        System.out.println("Shape Color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);  
        this.radius = radius;
    }

    void displayCircleInfo() {
        displayShapeInfo();  
        System.out.println("Circle Radius: " + radius);
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        circle.displayCircleInfo();
    }
}
