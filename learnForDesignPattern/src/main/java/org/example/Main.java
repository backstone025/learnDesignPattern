package org.example;

import org.example.ExampleOfSingletonPattern.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.UNIQUE_INSTANCE;
    }
}