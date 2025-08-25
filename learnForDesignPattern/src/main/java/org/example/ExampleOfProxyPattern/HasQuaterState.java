package org.example.ExampleOfProxyPattern;


import java.util.Random;

public class HasQuaterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuaterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public String toString() {
        return "동전이 두입되었습니다.";
    }
}
