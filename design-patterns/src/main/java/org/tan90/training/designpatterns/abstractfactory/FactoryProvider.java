package org.tan90.training.designpatterns.abstractfactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String factoryType) {

        if ("color".equalsIgnoreCase(factoryType)) {
            return new ColorFactory();
        }
        else if ("animal".equalsIgnoreCase(factoryType)) {
            return new AnimalFactory();
        }

        return null;
    }
}
