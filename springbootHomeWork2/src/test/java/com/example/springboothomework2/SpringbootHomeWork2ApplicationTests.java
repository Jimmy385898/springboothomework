package com.example.springboothomework2;

import com.example.springboothomework2.config.MyProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootHomeWork2ApplicationTests {

    @Autowired
    private MyProperties myProperties;

    @Test
    void contextLoads() {
        System.out.println(myProperties);
        System.out.println(myProperties.getId());
    }

}
