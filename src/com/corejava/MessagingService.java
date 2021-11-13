package com.corejava;

import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message2> messages;
    public MessagingService() {
        this.messages = new ArrayList<>();
    }
    public void add(Message2 message) {
        if (message.getContent().length() <= 280) {
            this.messages.add(message);
        }

    }
    public ArrayList<Message2> getMessages() {
        return this.messages;
    }

}
