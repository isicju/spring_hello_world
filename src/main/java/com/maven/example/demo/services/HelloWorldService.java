package com.maven.example.demo.services;

import com.maven.example.demo.model.MyConfigFile;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class HelloWorldService {
    MyConfigFile myConfigFile;

    public String getMyConfigFileValue() {
        return myConfigFile.getIp() + " kek!";
    }

}
