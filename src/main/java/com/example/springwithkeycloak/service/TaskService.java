package com.example.springwithkeycloak.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TaskService {

    public List<String> getTasks(){
        List<String> tasks= new ArrayList<>();
        tasks.add("cleaning");
        tasks.add("cooking");
        tasks.add("washing cloth");
        return tasks;
    }
}
