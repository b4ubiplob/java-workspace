package org.tan90.training.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class Drawing {

    List<Shape> shapes = new ArrayList<>();

    public Drawing() {
        super();
    }

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return this.shapes;
    }

    public  void draw() {
        if (shapes.isEmpty()) {
            System.out.println("Nothing to draw");
        }
        else {
            shapes.stream().forEach(shape -> shape.draw());
        }
    }

    public void resize() {
        if (shapes.isEmpty()) {
            System.out.println("Nothing to resize");
        }
        else {
            this.shapes.stream().forEach(shape -> shape.resize());
        }
    }
}
