package com.example.board.repository;

import com.example.board.dto.User;

public interface UserRepository {
	
	public User login(User user);
	public int signIn(User user);
	
}
