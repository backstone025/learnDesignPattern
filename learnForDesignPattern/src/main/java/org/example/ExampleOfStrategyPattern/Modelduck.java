package org.example.ExampleOfStrategyPattern;

import org.example.ExampleOfStrategyPattern.FlyBehavior.FlyNoWay;
import org.example.ExampleOfStrategyPattern.QuackBehavior.Quack;
import org.example.ExampleOfStrategyPattern.QuackBehavior.QuackBehavior;

public class Modelduck extends Duck{
    public Modelduck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void dispaly() {
        System.out.println("저는 모형 오리예요!");
    }
}
