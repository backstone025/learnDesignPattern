package org.example.ExampleOfCompoundPattern;

public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RuberDuck());
    }

    @Override
    public Quackable createGooseAdapter(Goose goose) {
        return new QuackCounter(new GooseAdapter(goose));
    }
}
