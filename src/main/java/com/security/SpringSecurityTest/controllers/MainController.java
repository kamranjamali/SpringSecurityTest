package com.security.SpringSecurityTest.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home2")
public class MainController {

    @GetMapping("/normal")
    public ResponseEntity<String> normalUser() {
        return ResponseEntity.ok("I am a normal user");
    }

    @GetMapping(value = "/admin")
    public ResponseEntity<String> adminUser() {
        return ResponseEntity.ok("I am a admin user");
    }


    @GetMapping(value = "/public")
    public ResponseEntity<String> publicUser() {
        return ResponseEntity.ok("I am a public user");
    }
}
