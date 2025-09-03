package org.example.ExampleOfComposite;

public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallarDuck() {
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
    public Quackable createGooseDuck() {
        return new QuackCounter(new GooseAdapter(new Goose()));
    }
}
