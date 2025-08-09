package com.meradevs.msvc_users.services.implement;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.meradevs.msvc_users.models.dto.UserDTO;
import com.meradevs.msvc_users.models.dto.requests.CreateUserDTO;
import com.meradevs.msvc_users.models.entities.User;
import com.meradevs.msvc_users.repositories.UserRepository;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    public UserDTO createUser(CreateUserDTO newUserDTO) {
        User user = modelMapper.map(newUserDTO, User.class);

        User createdUser = userRepository.save(user);

        return modelMapper.map(createdUser, UserDTO.class);
    }
}
