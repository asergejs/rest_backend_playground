package com.asergejs.backend_playground.service;


import com.asergejs.backend_playground.UserDTO;
import com.asergejs.backend_playground.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.asergejs.backend_playground.mapper.UserDTOMapper.toUserDTO;
import static com.asergejs.backend_playground.mapper.UserEntityMapper.toUserEntity;

@Component
public class RegistrationService {

    private final UserRepository userRepository;

    public RegistrationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO registerUser(UserDTO userDTO) {
        var user = userRepository.save(toUserEntity(userDTO));
        return toUserDTO(user);
    }

}
