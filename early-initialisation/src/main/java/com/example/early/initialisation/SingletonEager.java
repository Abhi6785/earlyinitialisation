package com.example.early.initialisation;
public class SingletonEager {
    private static final SingletonEager instance = new SingletonEager();

    // Private constructor to prevent instantiation
    private SingletonEager() {

    }

    // Global access point to the instance
    public static SingletonEager getInstance() {
        return instance;
    }

    // Other methods and attributes
    public void doSomething() {
        System.out.println("SingletonEager instance is doing something.");
    }
}


