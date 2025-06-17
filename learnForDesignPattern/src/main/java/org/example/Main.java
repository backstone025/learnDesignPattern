package org.example;

import org.example.ExampleOfStrategyPattern.Duck;
import org.example.ExampleOfStrategyPattern.MallarDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}