package org.example.ExampleOfAdapterPattern.Duck;

import java.util.Random;

public class DuckAdapter implements Turkey{
    Duck duck;
    Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        rand = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        // 5번에 한 번 날도록 설정
        if(rand.nextInt(5) == 0)
            duck.fly();
    }
}
