package com.example.hello.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        log.info("HELLO WORLD");
        return "HELLO WORLD";
    }
}
