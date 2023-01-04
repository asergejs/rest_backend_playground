package com.asergejs.backend_playground.controller;

import com.asergejs.backend_playground.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("/user-info")
    public String getUserInfo() {
        return "OK";
    }

}
