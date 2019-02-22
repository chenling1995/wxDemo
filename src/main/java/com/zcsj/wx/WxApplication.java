package com.zcsj.wx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class WxApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxApplication.class, args);
    }

}
