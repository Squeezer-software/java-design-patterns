package com.squeezer.designpatterns.command;

import java.util.ArrayDeque;

public class CommandManager {
    private ArrayDeque<UndoableCommand> commandStack = new ArrayDeque<UndoableCommand>();

    public void ExecuteCommand(Command cmd) {
        cmd.execute();
        if (cmd instanceof UndoableCommand) {
            commandStack.push((UndoableCommand) cmd);
        }
    }

    public void Undo() {

        if (commandStack.size() > 0) {
            UndoableCommand cmd = commandStack.pop();
            cmd.Undo();
        }
    }
}