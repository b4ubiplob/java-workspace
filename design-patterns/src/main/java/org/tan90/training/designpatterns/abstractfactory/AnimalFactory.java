package org.tan90.training.designpatterns.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal> {

    public Animal create(String type) {

        if ("Dog".equals(type)) {
            return new Dog();
        }
        else if ("Bear".equals(type)) {
            return new Bear();
        }
        else if ("Duck".equals(type)) {
            return new Duck();
        }
        else {
            return null;
        }
    }
}
