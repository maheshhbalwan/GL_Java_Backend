package FoundationOfProgramming.Week1.Shape;

public class Rectangle extends Shape {

    double height;
    double width;

    public Rectangle(String color, String type, double height, double width) {
        super(color, type);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calcShapeArea() {
        return height * width;
    }

    @Override
    public double calcShapePerimeter() {
        return 2 * (height + width);
    }

    @Override
    public void displayShapeDetails() {
        System.out.println("This is a " + super.type + " shape of " + super.color + " color. The Perimeter of the " + super.type + " is " + this.calcShapePerimeter() + " and the Area is " + this.calcShapeArea() + ".");
    }

    @Override
    public void drawShape() {
        super.drawShape();
    }
}
