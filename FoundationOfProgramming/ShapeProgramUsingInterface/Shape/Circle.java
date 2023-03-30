package FoundationOfProgramming.ShapeProgramUsingInterface.Shape;

public class Circle implements IShape{
    double radius;
    final double PI = 3.14;

    public Circle(double radius) {
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
}
