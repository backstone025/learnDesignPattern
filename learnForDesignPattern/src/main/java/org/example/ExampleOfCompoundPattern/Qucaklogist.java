package org.example.ExampleOfCompoundPattern;

public class Qucaklogist implements Observer{
    @Override
    public void update(QuackObservable duck) {
        System.out.println("꽥꽥 학자 : "+duck+"가 방금 소리냈다.");
    }
}
