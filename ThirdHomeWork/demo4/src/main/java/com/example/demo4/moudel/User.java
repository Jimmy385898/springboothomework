package com.example.demo4.moudel;

import lombok.Data;

/**
 * 实体层
 */
@Data
public class User {

    private int id;

    private String username;

    private String pwd;

    private int age;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                '}';
    }
}
