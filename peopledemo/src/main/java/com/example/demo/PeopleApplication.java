package com.example.demo;


import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.demo.mappers"})
@NacosPropertySource(dataId = "people_config", autoRefreshed = true)
@EnableDiscoveryClient
@ComponentScan({"com.example.demo","com.example.bookdemo"})
public class PeopleApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeopleApplication.class, args);
    }
}