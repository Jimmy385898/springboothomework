package com.example.demo3.config.Imp;

import com.example.demo3.config.DBConnector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevDBConnector implements DBConnector {
    @Override
    public void dataConfig() {
        System.out.println("开发环境");
    }
}
