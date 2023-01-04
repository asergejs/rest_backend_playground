package com.asergejs.backend_playground.service;


import com.asergejs.backend_playground.domain.dto.RegistrationRequestDTO;
import com.asergejs.backend_playground.domain.dto.UserDTO;
import com.asergejs.backend_playground.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static com.asergejs.backend_playground.mapper.UserDTOMapper.toUserDTO;
import static com.asergejs.backend_playground.mapper.UserEntityMapper.registrationReqToUserEntity;

@Slf4j
@Component
public class RegistrationService {

    private final UserRepository userRepository;

    public RegistrationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO registerUser(RegistrationRequestDTO registrationRequestDTO) {
        var user = userRepository.save(registrationReqToUserEntity(registrationRequestDTO));
        log.info("Registering user with email: {}", user.getEmail());
        return toUserDTO(user);
    }

}
