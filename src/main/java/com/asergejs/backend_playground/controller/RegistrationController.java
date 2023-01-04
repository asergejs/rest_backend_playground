package com.asergejs.backend_playground.controller;

import com.asergejs.backend_playground.domain.dto.RegistrationRequestDTO;
import com.asergejs.backend_playground.domain.dto.UserDTO;
import com.asergejs.backend_playground.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/register")
    public UserDTO registerUser(@RequestBody RegistrationRequestDTO registrationRequestDTO) {
        return registrationService.registerUser(registrationRequestDTO);
    }

}
