package org.tan90.training.designpatterns.adapter;

import org.tan90.training.designpatterns.adapter.extra.Rhombus;
import org.tan90.training.designpatterns.adapter.extra.Triangle;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creating drawing of shapes");

        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());

        drawing.addShape(new GeometricShapeAdapter(new Rhombus()));
        drawing.addShape(new GeometricShapeAdapter(new Triangle()));

        System.out.println("Drawing ...");
        drawing.draw();
        System.out.println("Resizing ...");
        drawing.resize();
    }
}
