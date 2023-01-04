package com.asergejs.backend_playground.controller;

import com.asergejs.backend_playground.domain.dto.UserDTO;
import com.asergejs.backend_playground.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    @Autowired
    private RegistrationService registrationService;

//    @GetMapping("/user-info")
//    public UserDTO getUserInfo(@RequestBody UserDTO userDTO) {
//        return registrationService.registerUser(userDTO);
//    }

}
