package com.example.firsthomework;

import com.example.firsthomework.controller.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstHomeworkApplicationTests {

    @Autowired
    private TestController testController;

    @Test
    void contextLoads() {
        System.out.println(testController.demo());
    }

}
