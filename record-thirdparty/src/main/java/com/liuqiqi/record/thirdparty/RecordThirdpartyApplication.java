package com.liuqiqi.record.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RecordThirdpartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecordThirdpartyApplication.class, args);
    }

}
