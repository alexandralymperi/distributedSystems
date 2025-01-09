package gr.hua.dit.ds.ds2024Team77.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class authController {

    @GetMapping("/login")
    public String login(){
        return "auth/login";
    }
}
