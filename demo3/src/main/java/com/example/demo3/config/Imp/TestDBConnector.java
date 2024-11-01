package com.example.demo3.config.Imp;

import com.example.demo3.config.DBConnector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestDBConnector implements DBConnector {
    @Override
    public void dataConfig() {
        System.out.println("调用测试环境");
    }
}
