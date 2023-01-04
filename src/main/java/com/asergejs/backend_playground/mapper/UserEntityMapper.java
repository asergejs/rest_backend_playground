package com.asergejs.backend_playground.mapper;

import com.asergejs.backend_playground.domain.dto.RegistrationRequestDTO;
import com.asergejs.backend_playground.domain.dto.UserDTO;
import com.asergejs.backend_playground.domain.User;

public class UserEntityMapper {

    public static User registrationReqToUserEntity(RegistrationRequestDTO registrationRequestDTO) {
      var userEntity = new User();
      userEntity.setEmail(registrationRequestDTO.getEmail());
      userEntity.setPassword(registrationRequestDTO.getPassword());
      return userEntity;
    }

}
