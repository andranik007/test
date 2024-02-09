package com.example.andranik.controller;

import com.example.andranik.model.Users;
import com.example.andranik.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("/all")
    String mainPage(Model model){
            model.addAttribute("users", userService.findAll());
            return "main";
}

@GetMapping("/add")
    String addUsers(){
        return "add_user";
}

@PostMapping("/save")
    String saveUser(Users users){
        userService.save(users);
        return "redirect:/all";
}
}
