package org.example.ExampleOfStrategyPattern.FlyBehavior;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날아가요오!");
    }
}
