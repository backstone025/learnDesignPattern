package org.example.ExampleOfComposite;

public class QuackCounter implements Quackable{
    Quackable duck;
    static int numberOfDucks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack(){
        duck.quack();
        numberOfDucks++;
    }

    public static int getNumberOfDucks() {
        return numberOfDucks;
    }
}
