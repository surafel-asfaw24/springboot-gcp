package com.gcp.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping()
    public ResponseEntity<String> greeting() {
        return ResponseEntity.ok("Hello world!");
    }
}
