package com.example.usersystem.model;

import lombok.Data;

@Data
public class User {
    private int id;

    private String username;

    private String password;

    private String gender;

    private Integer age;

    private String createTime;

}
