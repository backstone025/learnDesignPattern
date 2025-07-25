package org.example.ExampleOfCommandPattern.CommandPattern;

public class GarageDoor {
    String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(name + " 슬라이딩이 올라갑니다.");
    }

    public void down() {
        System.out.println(name + " 슬라이딩이 내라갑니다.");
    }

    public void stop() {
        System.out.println(name + " 슬라이딩이 멈춥니다.");
    }

    public void lightOn() {
        System.out.println(name + " 조명이 켜집니다.");
    }

    public void lightOff() {
        System.out.println(name + " 조명이 꺼집니다.");
    }
}
