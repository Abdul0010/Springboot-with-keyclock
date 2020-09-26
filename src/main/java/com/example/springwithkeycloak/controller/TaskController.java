package com.example.springwithkeycloak.controller;

import com.example.springwithkeycloak.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping("/tasks")
    public String getTasks(Model model){
        model.addAttribute("tasks",service.getTasks())  ;
        return "tasks";

    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "/";
    }
}
