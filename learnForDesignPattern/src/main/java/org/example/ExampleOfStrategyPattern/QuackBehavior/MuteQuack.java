package org.example.ExampleOfStrategyPattern.QuackBehavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("(조용). . .");
    }
}
