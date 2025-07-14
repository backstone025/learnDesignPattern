package org.example.ExampleOfCommandPattern.CommandPattern.Command;

import org.example.ExampleOfCommandPattern.CommandPattern.TV;

public class TVOffCommand implements Command{
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
