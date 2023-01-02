package FoundationOfProgramming.Week1.Shape;

public class Square extends Shape{

    double side;

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
        return 4 * side;
    }

    @Override
    public void displayShapeDetails() {
        System.out.println("This is a " + super.type+ " shape of " +  super.color + " color. The Perimeter of the " + super.type + " is " + this.calcShapePerimeter() +" and the Area is " + this.calcShapeArea()+".");    }
    @Override
    public void drawShape() {
        super.drawShape();
    }
}
