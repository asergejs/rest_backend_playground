package com.asergejs.backend_playground.domain.model;

import com.asergejs.backend_playground.domain.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserResponse {
    private UserDTO user;
    private Message message;
}
