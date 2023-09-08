package com.dipner.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funapi {

    // injecting properties for coach.name and team.name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teamInfo")
    public String TeamInfo(){
        return "Coach Name is :"+ coachName +" and the Team name is " + teamName ;

    }

    @GetMapping("/greeting")
    public String Greeting(){
        return "Hello, It is a beautiful day out there.\n Isn't it?😄";
    }

    @GetMapping("/task")
    public String task(){
        return "the take is done only once";
    }

}
