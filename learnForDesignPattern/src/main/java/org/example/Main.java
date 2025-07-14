package org.example;

import org.example.ExampleOfCommandPattern.CommandPattern.*;
import org.example.ExampleOfCommandPattern.CommandPattern.Command.*;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("거실");
        TV tv = new TV("거실");
        Stereo stereo = new Stereo("거실");
        Hottub hottub = new Hottub("");

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        MacroCommand macroOnCommand = new MacroCommand(new Command[]{lightOn, tvOn, stereoOnWithCD, hottubOn});
        MacroCommand macroOffCommand = new MacroCommand(new Command[]{lightOff, tvOff, stereoOff, hottubOff});

        remoteControl.setCommand(0, macroOnCommand, macroOffCommand);

        // remote control 작동
        System.out.println(remoteControl);
        remoteControl.onButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}