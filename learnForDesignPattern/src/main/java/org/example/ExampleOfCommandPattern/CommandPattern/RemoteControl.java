package org.example.ExampleOfCommandPattern.CommandPattern;

import org.example.ExampleOfCommandPattern.CommandPattern.Command.Command;
import org.example.ExampleOfCommandPattern.CommandPattern.Command.NoCommand;

public class RemoteControl {
    Command[] offCommands;
    Command[] onCommands;
    Command undoCommand;

    public RemoteControl() {
        offCommands = new Command[7];
        onCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuff = new StringBuilder();
        stringBuff.append("\n------ 리모컨 ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            String onName = onCommands[i].getClass().getName();
            String offName = offCommands[i].getClass().getName();
            stringBuff.append("[slot " + i + "] " + onName.substring(onName.lastIndexOf(".") + 1) +
                    "\t\t\t" + offName.substring(offName.lastIndexOf(".") + 1) + "\n");
        }
        return stringBuff.toString();
    }
}
