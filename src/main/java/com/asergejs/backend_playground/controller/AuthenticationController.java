package com.asergejs.backend_playground.controller;

import com.asergejs.backend_playground.domain.dto.RegistrationRequestDTO;
import com.asergejs.backend_playground.domain.dto.UserDTO;
import com.asergejs.backend_playground.domain.model.Message;
import com.asergejs.backend_playground.domain.model.RegisterUserResponse;
import com.asergejs.backend_playground.service.RegistrationService;
import com.asergejs.backend_playground.validation.RegistrationRequestValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/public")
public class AuthenticationController {

    @Autowired
    private RegistrationService registrationService;
    @Autowired
    private RegistrationRequestValidator registrationRequestValidator;

    @PostMapping("/sign-up")
    public ResponseEntity<?> signUp(@RequestBody RegistrationRequestDTO req) {
        var validationStatus = registrationRequestValidator.validate(req);
        if(!validationStatus.isValid()) {
           return ResponseEntity.status(400).body(validationStatus.getMessage());
        }

        Optional<UserDTO> registeredUser = registrationService.registerUser(req);
        if(registeredUser.isPresent()) {
            return ResponseEntity.status(201).body(new RegisterUserResponse(registeredUser.get(), new Message("SUCCESS", "User registered")));
        }

        return ResponseEntity.status(400).body(new Message("FAIL", "Something went wrong"));
    }

//    @PostMapping("/sign-in")
//    public UserDTO signIn(@RequestBody SignInDTO signInDTO) {
//        return registrationService.registerUser(registrationRequestDTO);
//    }

}
