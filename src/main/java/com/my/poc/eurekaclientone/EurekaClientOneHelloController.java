package com.my.poc.eurekaclientone;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EurekaClientOneHelloController {

    @GetMapping("hello")
    public ResponseEntity<String> sayHelloFromEurekaClientOne() {
        return ResponseEntity.ok("Hello from Eureka Client One");
    }
}
