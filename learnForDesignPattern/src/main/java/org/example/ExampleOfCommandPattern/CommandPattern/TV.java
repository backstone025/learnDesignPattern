package org.example.ExampleOfCommandPattern.CommandPattern;

public class TV {
    String name;
    int channel;
    int volume;

    public TV(String name) {
        this.name = name;
        channel = 0;
        volume = 50;
    }
    public void on(){
        System.out.println(name+" TV를 킵니다");
    }
    public void off(){
        System.out.println(name+" TV를 끕니다");
    }
    public void setInputChannel(int channel){
        this.channel = channel;
        System.out.println(name+" TV의 채널을 "+channel+"로 설정합니다");
    }
    public void setVolume(int volume){
        this.volume = volume;
        System.out.println(name+" TV의 소리를 "+volume+"로 설정합니다");
    }
}
