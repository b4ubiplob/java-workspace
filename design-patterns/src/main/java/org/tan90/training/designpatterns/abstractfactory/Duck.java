package org.tan90.training.designpatterns.abstractfactory;

public class Duck implements Animal {

    @Override
    public String getType() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Duck noise";
    }
}
