package com.liuqiqi.record.channel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.liuqiqi.record.channel.dao")
@SpringBootApplication
public class ChannelApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChannelApplication.class, args);
    }
}