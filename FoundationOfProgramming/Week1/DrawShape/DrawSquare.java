package FoundationOfProgramming.Week1.DrawShape;

//for the Color and Graphics classes

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

//  J component is abstract class
public class DrawSquare extends JComponent{
        private int width;


    public DrawSquare(int width) {
        this.width = width;
    }
    protected  void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double r = new Rectangle2D.Double(100,100,width,width);
//        g2d.setColor(new Color(100,149,237));
        g2d.setColor(Color.green);
        g2d.fill(r);
    }
}

