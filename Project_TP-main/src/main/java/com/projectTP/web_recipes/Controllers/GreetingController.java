package com.projectTP.web_recipes.Controllers;


import com.projectTP.web_recipes.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {
    @Autowired
    //private UserRepository userRepository;//
    @GetMapping("/")
    public String greeting(Map<String,Object>model) {
        return "greeting";
    }
    @GetMapping("/main")
    public String main(Map<String,Object>model){

                return "main";
    }
}