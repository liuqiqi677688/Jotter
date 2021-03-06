package com.liuqiqi.record.question;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.liuqiqi.record.question.dao")
@SpringBootApplication
public class QuestionApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuestionApplication.class, args);
    }
}