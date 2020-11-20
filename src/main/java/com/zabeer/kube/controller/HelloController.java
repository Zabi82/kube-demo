package com.zabeer.kube.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        String demoString = System.getenv().getOrDefault("DEMO_STRING", "Kubernetes");
        return String.format("Hello. This is a %s demo", demoString);
    }
}
