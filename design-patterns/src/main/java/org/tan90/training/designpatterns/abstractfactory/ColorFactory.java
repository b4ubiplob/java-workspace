package org.tan90.training.designpatterns.abstractfactory;

public class ColorFactory implements AbstractFactory<Color> {

    public Color create(String type) {

        if ("Black".equals(type)) {
            return new Black();
        }
        else if ("Brown".equals(type)) {
            return new Brown();
        }
        else if ("White".equals(type)) {
            return new White();
        }
        else {
            return null;
        }
    }
}
