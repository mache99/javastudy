package com.example.board.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.board.dto.User;
import com.example.board.repository.UserRepository;
import com.example.board.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repository;
	
	public boolean login(User user) {
		
		User loginResult = repository.login(user);
		
		if(!StringUtils.isEmpty(loginResult)) {
			return true;
		}
		return false;
	}
	
	public boolean signIn(User user) {
		
		int signInResult = repository.signIn(user);
		
		if(signInResult == 1) {
			
			return true;
		}
		
		return false;
	}
}
