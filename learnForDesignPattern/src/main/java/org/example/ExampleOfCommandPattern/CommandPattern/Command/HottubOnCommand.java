package org.example.ExampleOfCommandPattern.CommandPattern.Command;

import org.example.ExampleOfCommandPattern.CommandPattern.Hottub;

public class HottubOnCommand implements Command{
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}
