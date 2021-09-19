package org.tan90.training.designpatterns.abstractfactory;

public interface AbstractFactory<T> {

    public T create(String type);
}
