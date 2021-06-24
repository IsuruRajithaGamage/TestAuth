package com.example.TestAuth.service;

import com.example.TestAuth.model.User;
import com.example.TestAuth.web.Dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);
}
