package com.hxq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootHelloTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootHelloTestApplication.class, args);
        System.out.println("git-test");
        System.out.println("git-test1");
        System.out.println("hot-fix");
    }

}
