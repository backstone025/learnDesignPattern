package org.example.ExampleOfFacadePattern.FacadeObjects;

public class StreamingPlayer {
    String amplifier;

    public void on() {
        System.out.println("스트리밍 플레이어가 켜졌습니다.");
    }

    public void off() {
        System.out.println("스트리밍 플레이어가 꺼졌습니다.");
    }

    public void pause() {
    }

    public void play(String movie) {
        amplifier = movie;
        System.out.println("스트리밍 플레이어에서 \""+amplifier+"\"를 재생합니다");
    }

    public void setSurroundAudio() {
    }

    public void stop() {
        System.out.println("스트리밍 플레이어에서 \""+amplifier+"\" 재생을 종료합니다.");
    }

    public String toString() {
        return null;
    }
}
