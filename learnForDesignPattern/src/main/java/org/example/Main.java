package org.example;

import org.example.ExampleOfCommandPattern.CommandPattern.Command.*;
import org.example.ExampleOfCommandPattern.CommandPattern.GarageDoor;
import org.example.ExampleOfCommandPattern.CommandPattern.Light;
import org.example.ExampleOfCommandPattern.CommandPattern.RemoteControl;
import org.example.ExampleOfCommandPattern.CommandPattern.Stereo;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("회의실");
        Light cafeteriaLight = new Light("구내식당");
        GarageDoor garageDoor = new GarageDoor("본관 차고");
        Stereo stereo = new Stereo("휴게실");

        remoteControl.setCommand(0, ()->livingRoomLight.on(), ()->livingRoomLight.off());
        remoteControl.setCommand(1, ()->cafeteriaLight.on(), ()-> cafeteriaLight.off());
        remoteControl.setCommand(2, ()->garageDoor.up(), ()->garageDoor.down());
        remoteControl.setCommand(3,()-> stereo.on(), ()-> stereo.off());

//        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
//        LightOnCommand cafeteriaLightOn = new LightOnCommand(cafeteriaLight);
//        LightOffCommand cafeteriaLightOff = new LightOffCommand(cafeteriaLight);
//
//        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
//        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
//
//        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
//        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
//
//        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//        remoteControl.setCommand(1, cafeteriaLightOn, cafeteriaLightOff);
//        remoteControl.setCommand(2, garageDoorUp, garageDoorDown);
//        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
    }
}