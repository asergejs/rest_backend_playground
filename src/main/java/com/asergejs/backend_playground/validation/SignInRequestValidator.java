package com.asergejs.backend_playground.validation;

import com.asergejs.backend_playground.domain.dto.SignInDTO;
import com.asergejs.backend_playground.domain.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SignInRequestValidator {


    public ValidationStatus validate(SignInDTO signInDTO) {

        if (signInDTO.getEmail() == null || signInDTO.getPassword() == null) {
            return new ValidationStatus(false, new Message("fail", "Mandatory fields are empty"));
        }

        if (signInDTO.getEmail().isBlank() || signInDTO.getPassword().isBlank()) {
            return new ValidationStatus(false, new Message("fail", "Incorrect format of mandatory fields"));
        }

        return new ValidationStatus(true);
    }

}
