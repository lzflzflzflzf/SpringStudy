package com.example.bookdemo;


import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.bookdemo.mappers"})
@EnableDiscoveryClient
@NacosPropertySource(dataId = "book-config", autoRefreshed = true)
public class BookdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookdemoApplication.class, args);
    }

}
