package org.example.ExampleOfCommandPattern.CommandPattern.Command;

import org.example.ExampleOfCommandPattern.CommandPattern.TV;

public class TVOnCommand implements Command{
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
