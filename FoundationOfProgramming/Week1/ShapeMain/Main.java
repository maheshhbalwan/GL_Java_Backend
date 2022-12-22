package FoundationOfProgramming.Week1.ShapeMain;

import FoundationOfProgramming.Week1.DrawShape.DrawCircle;
import FoundationOfProgramming.Week1.DrawShape.DrawRectangle;
import FoundationOfProgramming.Week1.DrawShape.DrawSquare;
import FoundationOfProgramming.Week1.Shape.Circle;
import FoundationOfProgramming.Week1.Shape.Rectangle;
import FoundationOfProgramming.Week1.Shape.Square;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the option for the name of the Shape. \n 1. Rectangle \n 2. Square \n 3. Circle ");
        System.out.println("Enter 1, 2 or 3");
        int choice = input.nextInt();

        if (choice == 1) {
//            Rectangle
            System.out.println("You've selected Rectangle!");
            System.out.println("Enter the height!");
            int height = input.nextInt();
            System.out.println("Enter the width!");
            int width = input.nextInt();
            System.out.println("Enter the color!");
            String color = input.next();

            Rectangle rectangle = new Rectangle(color, "Rectangle", height, width);
            rectangle.displayDetails();
            System.out.println("The area of the rectangle is " + rectangle.calcShapeArea());
            System.out.println("The perimeter of the rectangle is " + rectangle.calcShapePerimeter());
            rectangle.drawShape();

            //        DrawRectangle
            JFrame f = new JFrame();
            DrawRectangle dc = new DrawRectangle(width, height);
            f.setSize(width, height);
            f.setTitle("Drawing Rectangle in Java");
            f.add(dc);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);

        } else if (choice == 2) {
//            Square
            System.out.println("You've selected Square!");
            System.out.println("Enter the side!");
            int side = input.nextInt();
            System.out.println("Enter the color!");
            String color = input.next();

            Square square = new Square(color, "Square", side);
            square.displayDetails();
            System.out.println(square.calcShapeArea());
            System.out.println(square.calcShapePerimeter());
            square.drawShape();

            //        DrawSquare
            JFrame f2 = new JFrame();
            DrawSquare drawSquare = new DrawSquare(side);
            f2.setSize(side, side);
            f2.setTitle("Drawing Square in Java");
            f2.add(drawSquare);
            f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f2.setVisible(true);

        } else if (choice == 3) {

            //        Circle
            System.out.println("You've selected Circle!");
            System.out.println("Enter the radius!");
            int radius = input.nextInt();
            System.out.println("Enter the color!");
            String color = input.next();

            Circle circle = new Circle(color, "Circle", radius);
            circle.displayDetails();
            System.out.println(circle.calcShapeArea());
            System.out.println(circle.calcShapePerimeter());
            circle.drawShape();

            //        Draw Circle
            JFrame f3 = new JFrame();
            DrawCircle drawCircle = new DrawCircle(radius);
            f3.setSize(radius, radius);
            f3.setTitle("Drawing Circle in Java");
            f3.add(drawCircle);
            f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f3.setVisible(true);
        }
    }

}
