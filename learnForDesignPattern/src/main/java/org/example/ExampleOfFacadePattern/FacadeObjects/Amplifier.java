package org.example.ExampleOfFacadePattern.FacadeObjects;

public class Amplifier {
    int tuner;
    String player;

    public void on() {
        System.out.println("엠프가 켜졌습니다.");
    }

    public void off() {
        System.out.println("엠프가 꺼졌습니다.");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println("엠프를 "+player+"player와 연결합니다.");
    }

    public void setStereoSound() {
    }

    public void setSurroundSound() {
        System.out.println("엠프를 서라운드 모드로 설정합니다(5.1 채널)");
    }

    public void setTuner() {
    }

    public void setVolume(int volume) {
        System.out.println("엠프 볼륨을 "+volume+"로 설정합니다");
    }

    public String toString() {
        return null;
    }
}
