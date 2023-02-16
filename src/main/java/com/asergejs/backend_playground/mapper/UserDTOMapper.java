package com.asergejs.backend_playground.mapper;

import com.asergejs.backend_playground.domain.dto.UserDTO;
import com.asergejs.backend_playground.domain.entity.User;

import static com.asergejs.backend_playground.mapper.CartDTOMapper.toCartDTO;

public class UserDTOMapper {

    public static UserDTO toUserDTO(User user) {
        var userDTO = new UserDTO();
        userDTO.setEmail(user.getEmail());
        if(user.getCart() != null) {
            userDTO.setCart(toCartDTO(user.getCart()));
        }
        return userDTO;
    }

}
