package FoundationOfProgramming.ShapeProgram.Shape;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    //    constructor
    public Circle(String color, String type, double radius) {
        super(color, type);
        this.radius = radius;
    }

    @Override
    public double calcShapeArea() {
        return PI * radius * radius;
    }

    @Override
    public double calcShapePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public void displayShapeDetails() {
        System.out.println("This is a " + super.type+ " shape of " +  super.color + " color. The Perimeter of the " + super.type + " is " + this.calcShapePerimeter() +" and the Area is " + this.calcShapeArea()+".");}

    @Override
    public void drawShape() {
        super.drawShape();
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double r = new Ellipse2D.Double(50, 50, this.radius, this.radius);
        //        ToDo: color
//        g2d.setColor(new Color(100,149,237));
        g2d.setColor(Color.orange);
        g2d.fill(r);
    }
}
