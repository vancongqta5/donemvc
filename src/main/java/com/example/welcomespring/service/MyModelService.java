package com.example.welcomespring.service;

import com.example.welcomespring.model.MyModel;
import org.springframework.stereotype.Service;

@Service
public class MyModelService {

    public MyModel createModel(String name, int age) {
        MyModel model = new MyModel();
        model.setName(name);
        model.setAge(age);
        return model;
    }
}