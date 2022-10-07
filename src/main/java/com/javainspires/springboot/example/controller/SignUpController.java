package com.javainspires.springboot.example.controller;

import com.javainspires.springboot.example.model.SignupForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    //method to get signup page
    @GetMapping(path="/signup")
    public String getSignUpPage(){
        return "signup";
    }

    //method to submit signup
    @PostMapping(path="/signup")
    public String submitSignUpPage(SignupForm signupForm){
        return "signup-sucess";
    }
}
