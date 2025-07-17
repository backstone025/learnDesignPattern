package org.example.ExampleOfFacadePattern.FacadeObjects;

public class TheaterLights {
    public void on() {
    }

    public void off() {
        System.out.println("조명이 꺼졌습니다.");
    }

    public void dim(int p) {
        System.out.println("조명 밝기를 " + p + "%로 설정합니다.");
    }

    public String toString() {
        return null;
    }

}
