package com.dipner.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funapi {
    @GetMapping("/greeting")
    public String Greeting(){
        return "Hello, It is a beautiful day out there.\n Isn't it?😄";
    }
}
