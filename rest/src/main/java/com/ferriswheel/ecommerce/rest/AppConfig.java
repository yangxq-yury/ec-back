package com.ferriswheel.ecommerce.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by QQ on 2016/11/23.
 */


@Configuration
@ComponentScan( basePackages = "com.ferriswheel.ecommerce")
public class AppConfig {
    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }
}
