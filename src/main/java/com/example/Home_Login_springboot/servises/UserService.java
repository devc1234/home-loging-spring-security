package com.example.Home_Login_springboot.servises;

import com.example.Home_Login_springboot.dto.UserDto;
import com.example.Home_Login_springboot.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}