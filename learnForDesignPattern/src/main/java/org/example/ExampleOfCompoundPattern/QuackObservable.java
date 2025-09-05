package org.example.ExampleOfCompoundPattern;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
