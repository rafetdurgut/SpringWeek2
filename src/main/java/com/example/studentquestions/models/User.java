package com.example.studentquestions.controllers;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class User {
    private @Id @GeneratedValue Long id;
    private String name;
    private String email;
    private String password;


}
