package com.example.backend.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.example.backend.dto.UserCreateDTO;
import com.example.backend.dto.UserUpdateDTO;
import com.example.backend.dto.UserViewDTO;

public interface UserService {

    UserViewDTO getUserById(Long id);

    List<UserViewDTO> getUsers();

    UserViewDTO createUser(UserCreateDTO userCreateDTO);

    UserViewDTO updateUser(Long id, UserUpdateDTO userUpdateDTO);

    void deleteUser(Long id);

    List<UserViewDTO> slice(Pageable pageable);


}
