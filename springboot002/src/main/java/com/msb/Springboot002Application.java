package com.msb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.msb.mapper")
public class Springboot002Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot002Application.class, args);
    }

}
