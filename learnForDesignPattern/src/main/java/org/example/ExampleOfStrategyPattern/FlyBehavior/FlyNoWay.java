package org.example.ExampleOfStrategyPattern.FlyBehavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("못 날겠어요ㅠㅠ");
    }
}
