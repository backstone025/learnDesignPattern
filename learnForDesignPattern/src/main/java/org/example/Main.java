package org.example;

import org.example.ExampleOfCommandPattern.CommandPattern.Command.GarageDoorUpCommand;
import org.example.ExampleOfCommandPattern.CommandPattern.GarageDoor;
import org.example.ExampleOfCommandPattern.CommandPattern.Light;
import org.example.ExampleOfCommandPattern.CommandPattern.Command.LightOnCommand;
import org.example.ExampleOfCommandPattern.CommandPattern.SimpleRemoteControl;

public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorUpCommand garageDoorOpen = new GarageDoorUpCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
    }
}