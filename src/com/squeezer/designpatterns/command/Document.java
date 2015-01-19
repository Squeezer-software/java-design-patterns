package com.squeezer.designpatterns.command;

public class Document {
    private String mText;

    public Document(String textbox) {
        this.mText = textbox;
    }

    public void BoldSelection() {

        mText = mText + " Bolded";
        System.out.println(mText);

    }

    public void UnderlineSelection() {
        System.out.println(mText + " underlined");
    }

    public void Cut() {
        System.out.println(mText + " Cut");
    }

    public void Copy() {
        System.out.println(mText + " Copied");
    }

    public void Paste() {
        System.out.println(mText + " Pasted");
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        this.mText = text;
    }

}
