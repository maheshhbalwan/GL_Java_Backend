package FoundationOfProgramming.ShapeProgram.ShapeMain;

import FoundationOfProgramming.ShapeProgram.Shape.Circle;
import FoundationOfProgramming.ShapeProgram.Shape.Rectangle;
import FoundationOfProgramming.ShapeProgram.Shape.Square;

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

                    Rectangle rectangleObj = new Rectangle(color, "Rectangle", height, width);
                    rectangleObj.displayShapeDetails();
                    rectangleObj.drawShape();

//                    create frame object
                    jFrameObj = new JFrame();
//                    set Frame object size
                    jFrameObj.setSize(1000, 600);
//                    set frame title
                    jFrameObj.setTitle("Drawing Rectangle in Java");
//                    add rectangle object to frame - to print rectangle on frame
                    jFrameObj.add(rectangleObj);    //no
//                    close operation
                    jFrameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                    frame visibility
                    jFrameObj.setVisible(true);
                    break;

                case 2: //            Square
                    System.out.println("You've selected Square!");
                    System.out.println("Enter the side!");
                    int side = input.nextInt();
                    System.out.println("Enter the color!");
                    color = input.next();

                    // TODO: color
                    Square squareObj = new Square(color, "Square", side);
                    squareObj.displayShapeDetails();
                    squareObj.drawShape();

                    jFrameObj = new JFrame();
                    jFrameObj.setSize(1000, 600);
                    jFrameObj.setTitle("Drawing Square in Java");
                    jFrameObj.add(squareObj);
                    jFrameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jFrameObj.setVisible(true);
                    break;

                case 3://        Circle
                    System.out.println("You've selected Circle!");
                    System.out.println("Enter the radius!");
                    int radius = input.nextInt();
                    System.out.println("Enter the color!");
                    color = input.next();

                    Circle circleObj = new Circle(color, "Circle", radius);
                    circleObj.displayShapeDetails();
                    circleObj.drawShape();

                    jFrameObj = new JFrame();
                    jFrameObj.setSize(1000, 600);
                    jFrameObj.setTitle("Drawing Circle in Java");
                    jFrameObj.add(circleObj);
                    jFrameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jFrameObj.setVisible(true);
                    break;
                case 9: //  Exit
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}