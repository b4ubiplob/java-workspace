package org.tan90.training.designpatterns.adapter;

public class Circle implements Shape {

    public void draw() {
        System.out.println("Drawing circle");
    }

    public void resize() {
        System.out.println("Resizing rectangle");
    }

    public String description() {
        return "Circle object";
    }

    public boolean isHidden() {
        return false;
    }
}
