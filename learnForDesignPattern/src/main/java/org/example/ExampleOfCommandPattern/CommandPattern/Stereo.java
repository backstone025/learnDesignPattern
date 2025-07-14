package org.example.ExampleOfCommandPattern.CommandPattern;

public class Stereo {
    String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " 오디오가 켜졌습니다.");
    }

    public void off() {
        System.out.println(name + " 오디오가 꺼졌습니다.");
    }

    public void setCD() {
        System.out.println(name + " 오디오에서 CD가 재생됩니다");
    }

    public void setRadio() {
        System.out.println(name + " 오디오에서 라디오가 재생됩니다.");
    }

    public void setVolume(int volume) {
        System.out.println(name + " 오디오 볼륨이 " + volume + "으로 설정되었습니다.");
    }
}
