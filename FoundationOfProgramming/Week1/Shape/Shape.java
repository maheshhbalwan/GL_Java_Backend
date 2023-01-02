package FoundationOfProgramming.Week1.Shape;

abstract class Shape {
    String color, type;

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

    public void displayShapeDetails() {
    }
}
