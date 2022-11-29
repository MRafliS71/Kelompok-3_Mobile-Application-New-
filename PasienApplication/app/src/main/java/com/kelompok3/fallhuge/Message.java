package com.kelompok3.fallhuge;

public class Message {

    private int pointer;
    private String textMessage;

    public Message(int pointer, String textMessage) {
        this.pointer = pointer;
        this.textMessage = textMessage;
    }

    public int getPointer() {
        return pointer;
    }

    public void setPointer(int pointer) {
        this.pointer = pointer;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }
}
