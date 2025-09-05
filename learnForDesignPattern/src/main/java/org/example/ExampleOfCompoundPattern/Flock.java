package org.example.ExampleOfCompoundPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable{
    List<Quackable> quackers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator =  quackers.iterator();

        while (iterator.hasNext()){
            Quackable quqcker = iterator.next();
            quqcker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator =  quackers.iterator();

        while (iterator.hasNext()){
            Quackable quqcker = iterator.next();
            quqcker.quack();
        }
    }

    public void add(Quackable quacker){
        quackers.add(quacker);
    }
}
