package FoundationOfProgramming.Week1.Shape;

public class Shape {
    String color;
    String type;

    //    constructor
    public Shape(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public double calcShapeArea() {
        return 0;
    }

    public double calcShapePerimeter() {
        return 0;
    }

    public void drawShape() {
        System.out.println("Drawing the " + this.type);
    }

    public void displayDetails() {
        System.out.println("This is a " + this.type + " shape with " + this.color + " color.");
    }

}

