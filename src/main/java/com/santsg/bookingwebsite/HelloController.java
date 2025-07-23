package com.santsg.bookingwebsite;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/hello")
    public String hello() {
        logger.info("/hello endpoint called");
        return "Hello world";
    }
}
