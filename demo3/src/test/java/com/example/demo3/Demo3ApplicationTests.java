package com.example.demo3;

import com.example.demo3.config.DBConnector;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo3ApplicationTests {

    @Autowired
    private DBConnector dbConnector;

    @Test
    void contextLoads() {
        dbConnector.dataConfig();
    }

//    @Value("${my.secret}")
    @Value("${app.description}")
    private String myValue;

//    @Value("${my.unmber}")
    @Value("${my.unmber.less}")
    private int myIntValue;
    @Test
    public void getValue(){
        System.out.println(myValue);
    }

    @Test
    public void getIntValue(){
        System.out.println(myIntValue);
    }

}
