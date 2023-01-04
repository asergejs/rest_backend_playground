package com.asergejs.backend_playground.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class SignOutController {

    @GetMapping("/sign-out")
    public String signOut() {
        return "cya!";
    }

}

