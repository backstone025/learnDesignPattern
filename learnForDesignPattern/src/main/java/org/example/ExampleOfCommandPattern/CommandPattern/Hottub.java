package org.example.ExampleOfCommandPattern.CommandPattern;

public class Hottub {
    String name;
    int temperature;

    public Hottub(String name) {
        this.name = name;
        temperature = 30;
    }

    public void on() {
        System.out.println(name + "욕조가 작동합니다.");
    }

    public void off() {
        System.out.println(name + "욕조가 작동을 중지합니다.");
    }

    public void circulate() {
        System.out.println(name + "욕조 물 순환을 시작합니다.");
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
        System.out.println(name+"욕조 온도를 "+temperature+"로 설정합니다.");
    }

}
