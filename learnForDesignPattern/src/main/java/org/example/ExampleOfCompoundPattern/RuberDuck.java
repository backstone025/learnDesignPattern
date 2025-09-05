package org.example.ExampleOfCompoundPattern;

public class RuberDuck implements Quackable{
    Observable observable;

    public RuberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("삑삑");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "고무 오리";
    }
}
