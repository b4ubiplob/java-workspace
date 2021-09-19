package org.tan90.training.designpatterns;

public class SingletonEager {
    
    private static SingletonEager instance = new SingletonEager();
    
    private SingletonEager() {
    }
    
    public static SingletonEager getInstance() {
        return instance;
    }

}
