package com.maven.example.demo.controllers;

import com.maven.example.demo.services.HelloWorldService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class MyConfigController {

    HelloWorldService helloWorldService;


    @GetMapping("/data")
    public String getDataFromService(){
       return helloWorldService.getMyConfigFileValue();
    }


}
