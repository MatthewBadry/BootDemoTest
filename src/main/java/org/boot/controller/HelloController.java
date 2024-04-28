package org.boot.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello() {
        return "hello";
    }
}