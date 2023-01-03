package FoundationOfProgramming.ShapeProgramUsingInterface.Shape;

public class Triangle implements IShape {

    int height;
    int base;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calcShapeArea() {
        return this.height * this.base;
    }

    @Override
    public double calcShapePerimeter() {
        return (this.height + this.base) + Math.sqrt(this.height ^ 2 + this.base ^ 2);
    }

}
