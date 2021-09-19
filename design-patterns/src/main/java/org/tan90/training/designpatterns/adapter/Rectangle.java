package org.tan90.training.designpatterns.adapter;

public class Rectangle implements Shape {

    public void draw() {
        System.out.println("Drawing rectangle");
    }

    public void resize() {
        System.out.println("Resizing rectangle");
    }

    public String description() {
        return "Rectangle objetc";
    }

    public boolean isHidden() {
        return false;
    }
}
