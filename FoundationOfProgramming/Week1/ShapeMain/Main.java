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
        String color;
        int choice;
        JFrame jFrameObj;
        do {
            System.out.println("""
                    --- Draw the Shape Program ---
                    Enter the option for the name of the Shape.
                    1. Rectangle
                    2. Square
                    3. Circle
                    9. Exit the program
                                
                    Enter the option number: """);
            choice = input.nextInt();
            switch (choice) {
                case 1: //            Rectangle
                    System.out.println("You've selected Rectangle!");
                    System.out.println("Enter the height!");
                    int height = input.nextInt();
                    System.out.println("Enter the width!");
                    int width = input.nextInt();
                    System.out.println("Enter the color!");
                    color = input.next();

                    // TODO: color, drawShape()
                    Rectangle rectangle = new Rectangle(color, "Rectangle", height, width);
                    rectangle.displayShapeDetails();
                    rectangle.drawShape();

                    //        DrawRectangle
                    jFrameObj = new JFrame();
                    DrawRectangle dc = new DrawRectangle(width, height);
                    jFrameObj.setSize(width, height);
                    jFrameObj.setTitle("Drawing Rectangle in Java");
                    jFrameObj.add(dc);
                    jFrameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jFrameObj.setVisible(true);
                    break;

                case 2: //            Square
                    System.out.println("You've selected Square!");
                    System.out.println("Enter the side!");
                    int side = input.nextInt();
                    System.out.println("Enter the color!");
                    color = input.next();

                    // TODO: color, drawShape()
                    Square square = new Square(color, "Square", side);
                    square.displayShapeDetails();
                    square.drawShape();

                    //        DrawSquare
                    jFrameObj = new JFrame();
                    DrawSquare drawSquare = new DrawSquare(side);
                    jFrameObj.setSize(side, side);
                    jFrameObj.setTitle("Drawing Square in Java");
                    jFrameObj.add(drawSquare);
                    jFrameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jFrameObj.setVisible(true);
                    break;

                case 3://        Circle
                    System.out.println("You've selected Circle!");
                    System.out.println("Enter the radius!");
                    int radius = input.nextInt();
                    System.out.println("Enter the color!");
                    color = input.next();

                    // TODO: color, drawShape()
                    Circle circle = new Circle(color, "Circle", radius);
                    circle.displayShapeDetails();
                    circle.drawShape();

                    //        Draw Circle
                    jFrameObj = new JFrame();
                    DrawCircle drawCircle = new DrawCircle(radius);
                    jFrameObj.setSize(radius, radius);
                    jFrameObj.setTitle("Drawing Circle in Java");
                    jFrameObj.add(drawCircle);
                    jFrameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jFrameObj.setVisible(true);
                    break;
                case 9: //  Exit
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);
        System.out.println("Exiting the program...");
    }
}