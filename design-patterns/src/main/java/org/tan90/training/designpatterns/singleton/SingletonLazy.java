package org.tan90.training.designpatterns.singleton;

public class SingletonLazy {
    
    private static SingletonLazy INSTANCE;
    
    private SingletonLazy() {}
    
    public static SingletonLazy getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonLazy();
                }
            }
        }
        return INSTANCE;
    }

}
