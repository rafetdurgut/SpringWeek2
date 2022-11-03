package com.example.studentquestions.controllers;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Question {
    private @Id @GeneratedValue Long id;
    private String title;
    private String content;
}
