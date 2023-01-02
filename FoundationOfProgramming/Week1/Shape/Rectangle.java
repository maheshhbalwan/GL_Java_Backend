package FoundationOfProgramming.Week1.Shape;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape {

    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

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

    protected void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double r = new Rectangle2D.Double(50, 50, this.width, this.height);
//        ToDo: color
//        g2d.setColor(new Color(100,149,237));
        g2d.setColor(Color.orange);
        g2d.fill(r);

    }
}
