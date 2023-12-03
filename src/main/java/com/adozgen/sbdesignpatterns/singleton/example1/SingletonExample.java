package com.adozgen.sbdesignpatterns.singleton.example1;

public class SingletonExample {
    private static SingletonExample singletonInstance;

    private SingletonExample() {
    }
    public static SingletonExample getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new SingletonExample();
        }
        return singletonInstance;
    }
}

