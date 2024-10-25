package com.example.springboothomework2.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@PropertySource("classpath:test.properties")
@EnableConfigurationProperties(MyProperties.class)
@ConfigurationProperties(prefix = "test")

public class MyProperties {

    @Value("${test.id}")
    private int id;

    @Value("${test.name}")
    private String name;

    @Override
    public String toString() {
        return "MyProperties{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
