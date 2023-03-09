package com.example.welcomespring.controllers;

import com.example.welcomespring.model.MyModel;
import com.example.welcomespring.service.MyModelService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WekcomeControler {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
    @RequestMapping("/welcome")
    public String showForm(HttpServletRequest request) {
        request.setAttribute("name", "Congnv");
        return "welcome";
    }
    @RequestMapping("/example")
    public String example(Model model) {
        String message = "Hello, World!";
        model.addAttribute("message", message);
        return "example";
    }
    @Autowired
    private MyModelService myModelService;
    @GetMapping("/create-model")
    public String createModel(Model model) {
        MyModel model1 = myModelService.createModel("John Doe", 25);
        model.addAttribute("model", model1);
        return "myview";
    }
}
