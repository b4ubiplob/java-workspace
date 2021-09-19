package org.tan90.training.designpatterns.adapter.extra;

public class Triangle implements GeometricShape {

    private final double a;
    private final double b;
    private final double c;

    public Triangle() {
        this(1.0d, 1.0d, 1.0d);
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        //Heron's formula
        //Area = Squareroots(s *(s - a) * (s - b) * (s -c))
        //where s = (a + b + c) / 2;
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing Triangle with asrea : " + area() + " and perimeter: " + perimeter());
    }
}
