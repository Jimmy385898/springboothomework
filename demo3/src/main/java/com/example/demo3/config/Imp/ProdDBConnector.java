package com.example.demo3.config.Imp;

import com.example.demo3.config.DBConnector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdDBConnector implements DBConnector {
    @Override
    public void dataConfig() {
        System.out.println("生产环境的启动");
    }
}
