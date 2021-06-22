package com.example.TestAuth.service;

import com.example.TestAuth.model.User;
import com.example.TestAuth.web.Dto.UserRegistrationDto;

public interface UserService {

    User save(UserRegistrationDto registrationDto);
}
