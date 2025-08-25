package org.example.ExampleOfProxyPattern;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuaterState;
    State soldState;
    State winnerState;

    State state;
    String location;
    int count;

    public GumballMachine(String location, int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuaterState(this);
        hasQuaterState = new HasQuaterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.location = location;
        this.count = count;
        if (count > 0)
            state = noQuarterState;
        else state = soldState;
    }

    public State getState() {
        return state;
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }
}
