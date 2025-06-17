package org.example;

import org.example.ExampleOfStrategyPattern.Duck;
import org.example.ExampleOfStrategyPattern.FlyBehavior.FlyRocketPowered;
import org.example.ExampleOfStrategyPattern.MallarDuck;
import org.example.ExampleOfStrategyPattern.Modelduck;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new Modelduck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}