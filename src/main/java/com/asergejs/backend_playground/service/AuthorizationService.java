package com.asergejs.backend_playground.service;

import com.asergejs.backend_playground.domain.User;
import com.asergejs.backend_playground.domain.dto.SignInDTO;
import com.asergejs.backend_playground.domain.dto.UserDTO;
import com.asergejs.backend_playground.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static com.asergejs.backend_playground.mapper.UserDTOMapper.toUserDTO;

@Slf4j
@Component
public class AuthorizationService {

    private final UserRepository userRepository;

    public AuthorizationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<UserDTO> signIn(SignInDTO signInDTO) {
        try {
            var user = userRepository.findByEmail(signInDTO.getEmail())
                    .filter(this::passwordMatches)
                    .orElseThrow(() -> new IllegalArgumentException("Invalid credentials"));
            return Optional.of(toUserDTO(user));
        } catch (Exception ex) {
            log.warn("Something went wrong while trying to sign in user, \n", ex);
            return Optional.empty();
        }
    }

    //TODO change to password encoder
    private boolean passwordMatches(User user) {
        return user.getPassword().equals("pass");
    }
}
