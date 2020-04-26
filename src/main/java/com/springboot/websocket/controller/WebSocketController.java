package com.springboot.websocket.controller;

import com.springboot.websocket.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Message Greeting(Message message) throws Exception {
        System.out.println(message.getContent());
        return message;
    }

}
