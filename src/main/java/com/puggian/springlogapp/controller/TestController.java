package com.puggian.springlogapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/success")
    public String success(@RequestParam String message) {
        log.info(message);
        return message;
    }

    @GetMapping("/fail")
    public String fail(@RequestParam String message) {
        log.error(message);
        return message;
    }

}
