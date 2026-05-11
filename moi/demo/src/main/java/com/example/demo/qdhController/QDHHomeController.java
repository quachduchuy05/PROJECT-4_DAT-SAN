package com.example.demo.qdhController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QDHHomeController {

    @GetMapping("/")
    public String home() {
        return "qdhhome";
    }
}
