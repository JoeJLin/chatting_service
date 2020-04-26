package com.springboot.websocket.model;

import java.time.LocalDateTime;

public class Message {
    private String username;
    private String content;
    private MessageType type;
    private String sender;
    private LocalDateTime dateTime = LocalDateTime.now();

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE,
        TYPING
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
