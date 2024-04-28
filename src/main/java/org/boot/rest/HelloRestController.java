package org.boot.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class HelloRestController {
    @GetMapping("/hello")
    public String sayHelloForGet() {
        return "hello rest web service from get handler get";
    }

    @PostMapping("/hello")
    public String sayHelloForPost() {
        return "hello rest web service from post handler";
    }

    @PutMapping("/hello")
    public String sayHelloForPut() {
        return "hello rest web service from put handler";
    }

    @DeleteMapping("/hello")
    public String sayHelloForDelete() {
        return "hello rest web service from delete handler";
    }
}
