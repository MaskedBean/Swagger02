package com.example.Swagger02.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DefaultController {

    @GetMapping
    public String sayWelcome(){return "Welcome!";}
}
