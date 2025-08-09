package com.meradevs.msvc_users.services;


import com.meradevs.msvc_users.models.dto.UserDTO;
import com.meradevs.msvc_users.models.dto.requests.CreateUserDTO;
public interface UserService {

    UserDTO createUser(CreateUserDTO newUserDTO);
}
