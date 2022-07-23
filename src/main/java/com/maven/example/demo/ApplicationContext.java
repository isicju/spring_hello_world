package com.maven.example.demo;

import com.maven.example.demo.model.MyConfigFile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContext {


    @Bean
    MyConfigFile myConfigFile(){
        return new MyConfigFile("127.0.0.1", "8080");
    }


}
