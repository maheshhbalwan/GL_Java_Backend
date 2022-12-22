package FoundationOfProgramming.Week1.Shape;

public class Circle extends Shape {
    double radius;
    final double PI = 3.14;

    //    constructor
    public Circle(String color, String type, double radius) {
        super(color, type);
        this.radius = radius;
    }

    @Override
    public double calcShapeArea() {
        return PI * radius * radius;
    }

    @Override
    public double calcShapePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public void displayDetails() {
        System.out.println("This is a " + super.type+ " shape with " +  super.color + " color.");
    }

    @Override
    public void drawShape() {
        super.drawShape();
    }
}
