package com.miu.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "hello world!";
    }
}
