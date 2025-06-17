package org.example.ExampleOfStrategyPattern.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽤에엑!!");
    }
}
