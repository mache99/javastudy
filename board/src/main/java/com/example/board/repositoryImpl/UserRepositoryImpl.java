package com.example.board.repositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.board.dto.User;
import com.example.board.mapper.UserMapper;
import com.example.board.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	UserMapper mapper;

	public User login(User user) {
		return mapper.login(user);

	}

	public int signIn(User user) {
		return mapper.signIn(user);
	}
}

//클래스 상속의 경우 extends