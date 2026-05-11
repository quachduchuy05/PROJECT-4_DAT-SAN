package com.example.demo.qdhController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QDHLoginController {

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String login(String username, String password){

        if(username.equals("admin") && password.equals("123")){
            return "redirect:/admin";
        }

        return "redirect:/login";
    }
}