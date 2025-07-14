package org.example;

import org.example.ExampleOfCommandPattern.CommandPattern.CeilingFan;
import org.example.ExampleOfCommandPattern.CommandPattern.Command.CeilingFanHighCommand;
import org.example.ExampleOfCommandPattern.CommandPattern.Command.CeilingFanMediumCommand;
import org.example.ExampleOfCommandPattern.CommandPattern.Command.CeilingFanOFFCommand;
import org.example.ExampleOfCommandPattern.CommandPattern.RemoteControl;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        CeilingFan ceilingFan = new CeilingFan("로비");

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOFFCommand ceilingFanOFF = new CeilingFanOFFCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOFF);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOFF);

        // remote control 작동
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPressed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}