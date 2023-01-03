package FoundationOfProgramming.ShapeProgramUsingInterface.Shape;

public class Square extends Rectangle{

    int side;

    public Square( int side) {
        super(side, side);
    }

    @Override
    public double calcShapeArea() {
        return super.calcShapeArea();
    }

    @Override
    public double calcShapePerimeter() {
        return super.calcShapePerimeter();
    }
}

