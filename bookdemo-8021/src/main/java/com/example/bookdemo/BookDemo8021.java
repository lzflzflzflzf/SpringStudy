package com.example.bookdemo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookDemo8021 {
    public static void main(String[] args) {
        SpringApplication.run(BookDemo8021.class, args);
    }
}
