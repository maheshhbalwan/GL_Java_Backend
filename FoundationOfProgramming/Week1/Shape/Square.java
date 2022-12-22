package FoundationOfProgramming.Week1.Shape;

public class Square extends Shape{

    double side;

//    constructor
    public Square(String color, String type, double side) {
        super(color, type);
        this.side = side;
    }

    @Override
    public double calcShapeArea() {
        return side * side;
    }

    @Override
    public double calcShapePerimeter() {
        return 4* side;
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
