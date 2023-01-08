package com.asergejs.backend_playground.controller;

import com.asergejs.backend_playground.domain.dto.RegistrationRequestDTO;
import com.asergejs.backend_playground.domain.dto.SignInDTO;
import com.asergejs.backend_playground.domain.dto.UserDTO;
import com.asergejs.backend_playground.domain.model.Message;
import com.asergejs.backend_playground.domain.model.RegisterUserResponse;
import com.asergejs.backend_playground.service.AuthorizationService;
import com.asergejs.backend_playground.service.RegistrationService;
import com.asergejs.backend_playground.validation.RegistrationRequestValidator;
import com.asergejs.backend_playground.validation.SignInRequestValidator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/public")
public class AuthenticationController {

    private final RegistrationService registrationService;
    private final RegistrationRequestValidator registrationRequestValidator;
    private final AuthorizationService authorizationService;
    private final SignInRequestValidator signInRequestValidator;

    public AuthenticationController(RegistrationService registrationService, RegistrationRequestValidator registrationRequestValidator, AuthorizationService authorizationService, SignInRequestValidator signInRequestValidator) {
        this.registrationService = registrationService;
        this.registrationRequestValidator = registrationRequestValidator;
        this.authorizationService = authorizationService;
        this.signInRequestValidator = signInRequestValidator;
    }

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

    @PostMapping("/sign-in")
    public ResponseEntity<?> signIn(@RequestBody SignInDTO signInDTO) {
        var validationStatus = signInRequestValidator.validate(signInDTO);
        if(!validationStatus.isValid()) {
            return ResponseEntity.status(400).body(validationStatus.getMessage());
        }

        Optional<UserDTO> authorizedUser = authorizationService.signIn(signInDTO);
        if(authorizedUser.isPresent()) {
            return ResponseEntity.status(201).body(new RegisterUserResponse(authorizedUser.get(), new Message("SUCCESS", "User authorized")));
        }
        return ResponseEntity.status(400).body(new Message("FAIL", "Unable to sign in"));
    }

}
