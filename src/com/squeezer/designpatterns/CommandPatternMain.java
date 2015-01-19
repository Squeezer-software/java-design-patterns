package com.squeezer.designpatterns;

import com.squeezer.designpatterns.command.BoldCommand;
import com.squeezer.designpatterns.command.CommandManager;
import com.squeezer.designpatterns.command.Document;

public class CommandPatternMain {

    public static void main(String[] args) {

        CommandManager commandManager = new CommandManager();
        Document document = new Document("Hi IIT");

        commandManager.ExecuteCommand(new BoldCommand(document));

        commandManager.Undo();
        System.out.println("result after Undo = " + document.getText());

    }

}
