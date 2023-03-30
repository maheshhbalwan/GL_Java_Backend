package FoundationOfProgramming.ShapeProgram.Shape;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

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
        System.out.println("This is a " + super.type + " shape of " + super.color + " color. The Perimeter of the " + super.type + " is " + this.calcShapePerimeter() + " and the Area is " + this.calcShapeArea() + ".");
    }

    @Override
    public void drawShape() {
        super.drawShape();
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double r = new Rectangle2D.Double(50, 50, side, side);
        //        ToDo: color
//        g2d.setColor(new Color(100,149,237));
        g2d.setColor(Color.green);
        g2d.fill(r);
    }
}
