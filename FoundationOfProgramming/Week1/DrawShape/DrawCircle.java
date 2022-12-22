package FoundationOfProgramming.Week1.DrawShape;

//for the Color and Graphics classes

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

//  J component is abstract class
public class DrawCircle extends JComponent {
    private int width;

    public DrawCircle(int width) {
        this.width = width;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double r = new Ellipse2D.Double(50, 50, this.width, this.width);
//        g2d.setColor(new Color(100,149,237));
        g2d.setColor(Color.orange);
        g2d.fill(r);
    }
}

