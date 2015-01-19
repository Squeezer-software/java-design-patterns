package com.squeezer.designpatterns.command;

public class BoldCommand extends UndoableCommand {

    private Document mDocument;
    // Undo management
    private String mPreviousText;

    public BoldCommand(Document doc) {
        this.mDocument = doc;
        mPreviousText = this.mDocument.getText();
    }

    @Override
    public void execute() {
        mDocument.BoldSelection();
    }

    @Override
    public void Undo() {
        mDocument.setText(mPreviousText);
    }

}
