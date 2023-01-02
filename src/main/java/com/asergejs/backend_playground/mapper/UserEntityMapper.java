package com.asergejs.backend_playground.mapper;

import com.asergejs.backend_playground.UserDTO;
import com.asergejs.backend_playground.domain.User;

public class UserEntityMapper {

    public static User toUserEntity(UserDTO userDTO) {
      var userEntity = new User();
      userEntity.setEmail(userDTO.getEmail());
      userEntity.setPassword(userDTO.getPassword());
      return userEntity;
    }

}
