package org.example.ExampleOfCommandPattern.CommandPattern.Command;

import org.example.ExampleOfCommandPattern.CommandPattern.Hottub;

public class HottubOffCommand implements Command{
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
    }
}
