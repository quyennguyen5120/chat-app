package com.example.chatapp.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    @GetMapping(value = "/")
    public String test(){
        return "ABC";
    }
}
