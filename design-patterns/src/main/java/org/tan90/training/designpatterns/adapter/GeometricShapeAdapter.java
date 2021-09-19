package org.tan90.training.designpatterns.adapter;

import org.tan90.training.designpatterns.adapter.extra.GeometricShape;
import org.tan90.training.designpatterns.adapter.extra.Rhombus;
import org.tan90.training.designpatterns.adapter.extra.Triangle;

public class GeometricShapeAdapter implements Shape {

    private GeometricShape adaptee;

    public GeometricShapeAdapter(GeometricShape adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void draw() {
        this.adaptee.drawShape();
    }

    @Override
    public boolean isHidden() {
        return false;
    }

    @Override
    public String description() {
        if (adaptee instanceof Rhombus) {
            return "Rhombus object";
        }
        else if (adaptee instanceof Triangle) {
            return  "Triangle object";
        }
        else {
            return "Unknown object";
        }
    }

    @Override
    public void resize() {
        System.out.println(description() + " cannot be reshaped. Please create a new one with required values");
    }


}
