package org.example.ExampleOfCommandPattern.CommandPattern;

import org.example.ExampleOfCommandPattern.CommandPattern.Command.Command;

public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl(){}

    public void setCommand(Command command){
        slot = command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
