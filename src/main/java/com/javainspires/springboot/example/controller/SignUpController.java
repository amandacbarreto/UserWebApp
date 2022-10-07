package com.javainspires.springboot.example.controller;

import com.javainspires.springboot.example.entity.User;
import com.javainspires.springboot.example.model.SignupForm;
import com.javainspires.springboot.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @Autowired
    private UserRepository userRepository;

    //method to get signup page
    @GetMapping(path="/signup")
    public String getSignUpPage(){
        return "signup";
    }

    //method to submit signup
    @PostMapping(path="/signup")
    public String submitSignUpPage(SignupForm signupForm){
        User user = null;
        if (signupForm!=null){
            user = new User(null, signupForm.getFirstName(),signupForm.getLastName(), signupForm.getEmail(), signupForm.getPassword());
        }
        userRepository.save(user);
        return "signup-sucess";
    }
}
