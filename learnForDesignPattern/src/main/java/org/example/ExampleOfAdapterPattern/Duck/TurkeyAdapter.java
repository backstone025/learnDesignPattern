package org.example.ExampleOfAdapterPattern.Duck;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    // 오리와 다르게 Turkey는 오래 날 수 없다.
    @Override
    public void fly() {
        for(int i = 0; i < 5; i++)
            turkey.fly();
    }
}
