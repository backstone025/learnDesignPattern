package org.example.ExampleOfProxyPattern;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public String toString() {
        return "판매 되었습니다.";
    }
}
