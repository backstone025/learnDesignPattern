package org.example.ExampleOfStrategyPattern.QuackBehavior;

public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("삐에엑~");
    }
}
