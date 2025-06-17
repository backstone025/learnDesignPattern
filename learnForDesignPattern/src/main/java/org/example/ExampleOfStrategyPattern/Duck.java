package org.example.ExampleOfStrategyPattern;

import org.example.ExampleOfStrategyPattern.FlyBehavior.FlyBehavior;
import org.example.ExampleOfStrategyPattern.QuackBehavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){}
    public abstract void dispaly();
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
    public void swim(){
        System.out.println("모든 오리는 물에서 떠요. 가짜라도 뜨죠");
    }
}
