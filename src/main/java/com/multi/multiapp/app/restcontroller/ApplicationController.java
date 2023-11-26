package com.multi.app.multiapp.restcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class ApplicationController {
    

    @GetMapping("/home")
    public ResponseEntity<String> getTest(){
        return ResponseEntity.ok().body("Your application is up and running");
    }
}
