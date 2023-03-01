package com.example.Counter.controller;

import com.example.Counter.model.Counter;
import com.example.Counter.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/visitor-counter")
public class CounterController {

    @Autowired
    private CounterService counterservice;

    //    if you want to write code without using Autowired we can use below code
//    private CounterService counterservice; // dependency injection
//
//    public counterController(CounterService counterservice) {
//        this.counterservice=counterservice;
//    }
    @GetMapping("count/username/{username}")
    public Counter getHitCount(@PathVariable String username)
    {
        Counter counter=counterservice.addUser(username);
        return counter;
    }
//    @RequestMapping("/count")
//    public String user(){
//        return "my name is";
//    }
}
