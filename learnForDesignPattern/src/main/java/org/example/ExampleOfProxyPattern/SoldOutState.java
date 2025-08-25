package org.example.ExampleOfProxyPattern;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public String toString() {
        return "알맹이 매진되었습니다.";
    }
}
