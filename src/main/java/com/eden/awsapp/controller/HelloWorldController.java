package com.eden.awsapp.controller;

import com.eden.awsapp.model.HelloWorld;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello-world")
    public ResponseEntity<HelloWorld> hello() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("HelloWorld");

        return ResponseEntity.ok().body(helloWorld);
    }
}
