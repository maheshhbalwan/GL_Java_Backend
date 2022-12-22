package FoundationOfProgramming.Week1.DrawShape;

//for the Color and Graphics classes

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

//  J component is abstract class
public class DrawRectangle extends JComponent{
        private int width;
        private int height;
    public DrawRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    protected  void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double r = new Rectangle2D.Double(50,50,this.width,this.height);
//        g2d.setColor(new Color(100,149,237));
        g2d.setColor(Color.orange);
        g2d.fill(r);
    }
}

