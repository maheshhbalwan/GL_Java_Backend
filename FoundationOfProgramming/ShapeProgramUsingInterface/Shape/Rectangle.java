package FoundationOfProgramming.ShapeProgramUsingInterface.Shape;

public class Rectangle implements IShape{

    int height, width;

    public Rectangle(int height, int width) {
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
}
