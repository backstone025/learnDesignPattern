package org.example.ExampleOfProxyPattern;


public class NoQuaterState implements State {
    GumballMachine gumballMachine;

    public NoQuaterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public String toString() {
        return "동전 투입 대기중";
    }
}
