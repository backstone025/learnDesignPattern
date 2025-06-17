package org.example.ExampleOfStrategyPattern;

import org.example.ExampleOfStrategyPattern.FlyBehavior.FlyWithWings;
import org.example.ExampleOfStrategyPattern.QuackBehavior.Quack;

public class MallarDuck extends Duck{
    public MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void dispaly() {
        System.out.println("저는 물오리예요!");
    }
}
