package com.yang.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class StartApp {
    
    public static void main(String[] args) {
        SpringApplication.run(StartApp.class, args);
    }
    
}
