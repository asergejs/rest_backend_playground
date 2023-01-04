package com.asergejs.backend_playground.mapper;

import com.asergejs.backend_playground.domain.dto.UserDTO;
import com.asergejs.backend_playground.domain.User;

public class UserDTOMapper {

    public static UserDTO toUserDTO(User user) {
        var userDTO = new UserDTO();
        userDTO.setEmail(user.getEmail());
        return userDTO;
    }

}
