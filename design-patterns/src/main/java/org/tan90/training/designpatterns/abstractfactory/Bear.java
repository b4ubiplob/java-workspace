package org.tan90.training.designpatterns.abstractfactory;

public class Bear implements Animal {


    public String makeSound() {
        return "Bear noise";
    }


    public String getType() {
        return "Bear";
    }
}
