package FoundationOfProgramming.ShapeProgramUsingInterface.ShapeMain;

import FoundationOfProgramming.ShapeProgramUsingInterface.Shape.Circle;
import FoundationOfProgramming.ShapeProgramUsingInterface.Shape.Rectangle;
import FoundationOfProgramming.ShapeProgramUsingInterface.Shape.Square;
import FoundationOfProgramming.ShapeProgramUsingInterface.Shape.Triangle;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(50, 20);
        System.out.println("Perimeter of Rectangle is: " + rectangle.calcShapePerimeter());
        System.out.println("Area of Rectangle is: " + rectangle.calcShapeArea());

        Circle circle = new Circle(50);
        System.out.println("Perimeter of Circle is: " + circle.calcShapePerimeter());
        System.out.println("Area of Circle is: " + circle.calcShapeArea());

        Square square = new Square(60);
        System.out.println("Perimeter of Square is: " + square.calcShapePerimeter());
        System.out.println("Area of Square is: " + square.calcShapeArea());

        Triangle triangle = new Triangle(30, 50);
        System.out.println("Perimeter of Triangle is: " + triangle.calcShapePerimeter());
        System.out.println("Area of Triangle is: " + triangle.calcShapeArea());

    }
}
