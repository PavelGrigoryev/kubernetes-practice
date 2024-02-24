package com.example.demo.controller;

import com.example.demo.dto.HelloDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public ResponseEntity<HelloDto> sayHelloWorld() {
        String podName = System.getenv("HOSTNAME");
        return ResponseEntity.ok(new HelloDto("Hello World from %s !".formatted(podName != null ? podName : "Mike")));
    }

}
