package com.m.demo.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@ConfigurationProperties(prefix = "sa")
@PropertySource(value = "")
@RestController
public class  HelloWorldController{
    @RequestMapping("/hello")
    public String index() {
        return "Hello ";
    }
}