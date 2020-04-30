package com.springboot.websocket.websocket.controller;

import com.springboot.websocket.websocket.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSocketController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Message Greeting(Message message) throws Exception {
        System.out.println(message.getContent());
        return message;
    }

    @GetMapping("/hello/joe")
    public String hello() {
        System.out.println("hellow joe");
        return "<h1>hello world</h1>";
    }

}
