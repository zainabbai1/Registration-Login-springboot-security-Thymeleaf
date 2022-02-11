package net.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.springboot.model.User;
import net.springboot.model.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
