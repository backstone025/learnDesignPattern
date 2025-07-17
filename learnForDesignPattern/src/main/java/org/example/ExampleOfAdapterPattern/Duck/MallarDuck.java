package org.example.ExampleOfAdapterPattern.Duck;

import org.example.ExampleOfAdapterPattern.Duck.Duck;

public class MallarDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("꽥");
    }

    @Override
    public void fly() {
        System.out.println("날고 있어요!!");
    }
}
