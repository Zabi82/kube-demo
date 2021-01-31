package com.zabeer.kube.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        log.info("Hello endpoint invoked");
        String demoString = System.getenv().getOrDefault("DEMO_STRING", "Kubernetes");
        return String.format("Hello. This is a %s demo", demoString);
    }
}
