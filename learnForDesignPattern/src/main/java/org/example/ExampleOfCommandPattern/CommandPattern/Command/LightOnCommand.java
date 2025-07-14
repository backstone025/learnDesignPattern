package org.example.ExampleOfCommandPattern.CommandPattern.Command;

import org.example.ExampleOfCommandPattern.CommandPattern.Command.Command;
import org.example.ExampleOfCommandPattern.CommandPattern.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
